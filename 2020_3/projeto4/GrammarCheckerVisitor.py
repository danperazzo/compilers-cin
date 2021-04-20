# Generated from antlr4-python3-runtime-4.7.2/src/autogen/Grammar.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GrammarParser import GrammarParser
else:
    from GrammarParser import GrammarParser

import struct
import math
# Função utilizada para transformar um valor float para um valor hexadecimal 
# (o equivalente em hexadecimal dos valores dos bits de um float)
def float_to_hex(f):
    float_hex = hex(struct.unpack('<Q', struct.pack('<d', f))[0])
    if (int(float_hex[10],16) % 2 != 0):
        if (float_hex[10] == 'f'):
            float_hex = float(math.ceil(f))
        else:
            float_hex = float_hex[:10] + hex(int(float_hex[10],16) + 1)[2] + "0000000"

    else: 
        float_hex = float_hex[:11] + "0000000"
    return float_hex



def type2lltype(tyype):
    if tyype == 'int':
        tyype_ll = 'i32'
    else:
        tyype_ll = tyype
    return tyype_ll




def resolve_expr(val_0,val_1,operation, line):

        if val_0 is None or val_1 is None:
            return None
        
        if operation == '+':
            val_ret = val_0 + val_1
        elif operation == '-':
            val_ret = val_0 - val_1
        elif operation == '*':
            val_ret = val_0 * val_1
        elif operation == '/':
            if type(val_0) == int and type(val_1) == int:
                val_ret = int(val_0 / val_1)
            else:
                val_ret = float(val_0 / val_1)
        elif operation == '>=':
            val_ret = int(val_0 >= val_1)
        elif operation == '<=':
            val_ret = int(val_0 <= val_1)
        elif operation == '>':
            val_ret = int(val_0 > val_1)
        elif operation == '<':
            val_ret = int(val_0 < val_1)
        elif operation == '==':
            val_ret = int(val_0 == val_1)
        elif operation == '!=':
            val_ret = int(val_0 != val_1)
        
            return None
            
        expression = str(val_0) + " " + operation + " " + str(val_1) 

        if type(val_ret) == float:
            print("line %d Expression %s simplified to: %.1f" %(line, expression, val_ret))
        else:
            print("line %d Expression %s simplified to: %d" %(line, expression, val_ret))
        return val_ret

def change_array_val(tuple_params, idx, new_val):
    if tuple_params[2]:
        return tuple_params
    params = list(tuple_params)
    params[1][idx] = new_val
    new_tuple_params = tuple(params)
    return new_tuple_params

class Type:
    VOID = "void"
    INT = "int"
    FLOAT = "float"
    STRING = "char *"

# This class defines a complete generic visitor for a parse tree produced by GrammarParser.
class GrammarCheckerVisitor(ParseTreeVisitor):
    ids_defined = {} # Dicionário para armazenar as informações necessárias para cada identifier definido
    inside_what_function = "" # String que guarda a função atual que o visitor está visitando. Útil para acessar dados da função durante a visitação da árvore sintática da função.
    inside_bifurcation = 0
    ids_regs = {} # Dicionário para mapear ids em registradores
    count_regs = 0 # Contador para o nome do registrador
    file_ll = open('outputs/out.ll', 'w')

    # Visit a parse tree produced by GrammarParser#fiile.
    def visitFiile(self, ctx:GrammarParser.FiileContext):
        return self.visitChildren(ctx)


     # Visit a parse tree produced by GrammarParser#function_definition.
    def visitFunction_definition(self, ctx:GrammarParser.Function_definitionContext):
        tyype = ctx.tyype().getText()
        name = ctx.identifier().getText()
        params = self.visit(ctx.arguments())


        if tyype == 'int':
            tyype_ll = 'i32'
        else:
            tyype_ll = tyype

        # Get the types and order of all params
        param_ll = [type_param[0] +  " %" + str(idx) if type_param[0] != 'int' else 'i32 %' + str(idx) for idx,type_param in enumerate(params.values())]
        
        line = "define %s @%s(%s) {\n" % (tyype_ll, name, ", ".join(param_ll))
        self.file_ll.write(line)

        params_def_ll = [""]
        for idx, item in enumerate(params.items()):
            param_name = item[0]
            param_type = type2lltype(item[1][0])

            line_param = '	%%%s = alloca %s, align 4\n'  % (param_name,param_type)
            line_param = line_param + ('	store %s %%%d, %s* %%%s, align 4\n'%(param_type,idx,param_type,param_name ) )
            self.file_ll.write(line_param)
        self.count_regs = len(params) + 1 

        self.ids_defined[name] = tyype, params, None
        self.inside_what_function = name
        self.visit(ctx.body())
        self.file_ll.write("}\n\n")
        return


    # Visit a parse tree produced by GrammarParser#body.
    def visitBody(self, ctx:GrammarParser.BodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#statement.
    def visitStatement(self, ctx:GrammarParser.StatementContext):
        if ctx.RETURN() is not None:
            name = self.inside_what_function
            tyype = self.ids_defined[name][0]
            tyype_ll = type2lltype(tyype)


            if tyype == Type.VOID:
                token = ctx.RETURN().getPayload()
                line = token.line
                row = token.column
                print( "ERROR: trying to return a non void expression from void function '%s' in line %d and column %d" %(name,line,row))
                self.file_ll.write("	ret %s\n" % tyype_ll)
            else:
                type_exp, _, reg_ret = self.visit(ctx.expression())

                tyype_ll = type2lltype(type_exp)
                line_exp_ret = '	ret %s %s\n' % (tyype_ll,reg_ret)
                self.file_ll.write(line_exp_ret)
                
                if type_exp == Type.VOID:
                    token = ctx.RETURN().getPayload()
                    line = token.line
                    row = token.column
                    print("ERROR: trying to return void expression from function '%s' in line %d and column %d" %(name,line,row))

                elif type_exp == Type.FLOAT and tyype == Type.INT:

                    token = ctx.RETURN().getPayload()
                    line = token.line
                    row = token.column
                    print("WARNING: possible loss of information returning float expression from int function '%s' in line %d and column %d" %(name,line,row))

                elif type_exp != tyype:
                    token = ctx.RETURN().getPayload()
                    line = token.line
                    row = token.column
                    print("ERRO de tipos diferentes de variaveis de retorno: na linha %d e coluna %d" %(line,row))

        elif ctx.if_statement() is not None:
            self.visit(ctx.if_statement())

        elif ctx.for_loop() is not None:
            self.visit(ctx.for_loop())

        else:
            self.visitChildren(ctx)
            
        return


    # Visit a parse tree produced by GrammarParser#if_statement.
    def visitIf_statement(self, ctx:GrammarParser.If_statementContext):

        self.visit(ctx.expression())

        if ctx.statement() is not None:
            
            self.inside_bifurcation = self.inside_bifurcation + 1 
            self.visit(ctx.statement())
            self.inside_bifurcation = self.inside_bifurcation - 1

        else:
            self.inside_bifurcation = self.inside_bifurcation + 1
            self.visit(ctx.body())
            self.inside_bifurcation = self.inside_bifurcation - 1

        if ctx.else_statement() is not None:
            self.visit(ctx.else_statement())
        
        return

    # Visit a parse tree produced by GrammarParser#else_statement.
    def visitElse_statement(self, ctx:GrammarParser.Else_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#for_loop.
    def visitFor_loop(self, ctx:GrammarParser.For_loopContext):
        
        self.inside_bifurcation = self.inside_bifurcation + 1 
        self.visit(ctx.for_initializer())
        self.visit(ctx.for_condition())
        self.visit(ctx.for_step())

        if ctx.statement() is not None:
            
            self.visit(ctx.statement())
        
        else:
            self.visit(ctx.body())
        
        self.inside_bifurcation = self.inside_bifurcation - 1

        return


    # Visit a parse tree produced by GrammarParser#for_initializer.
    def visitFor_initializer(self, ctx:GrammarParser.For_initializerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#for_condition.
    def visitFor_condition(self, ctx:GrammarParser.For_conditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#for_step.
    def visitFor_step(self, ctx:GrammarParser.For_stepContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#variable_definition.
    def visitVariable_definition(self, ctx:GrammarParser.Variable_definitionContext):
        ctx_tyype = ctx.tyype()
        tyype = ctx_tyype.getText()

        if tyype == Type.VOID:
            token = ctx_tyype.VOID().getPayload()
            line = token.line
            row = token.column
            print("ERROR: na linha %d e coluna %d" %(line,row))
        else:
            for i in range(len(ctx.identifier())): # para cada identifier/expression que este nó possui...
                name = ctx.identifier(i).getText()
                exp = ctx.expression(i)
                tyype_ll = type2lltype(tyype)
                

                is_global = False
                if self.inside_what_function == "":
                    is_global = True
                    

                if not is_global:
                    line = '	%%%s = alloca %s, align 4\n'  % (name, tyype_ll)
                    self.file_ll.write(line)
                
                self.ids_defined[name] = tyype, None, is_global

                if exp is not None:
                    type_exp, val, reg_exp = self.visit(exp)
                    tyype_exp_ll = type2lltype(type_exp)
                    
                    if val is None:

                        line_param = '	store %s %s, %s* %%%s, align 4\n' % (tyype_exp_ll, reg_exp, tyype_ll, name)
                    else:
                        if type_exp == 'float':
                            val_str = str(float_to_hex(val))
                        else:
                            val_str = str(val)
                        if is_global:
                            line_param = "@%s = global %s %s\n"%(name,tyype_ll,val_str)  
                        else:
                            line_param = '	store %s %s, %s* %%%s, align 4\n' % (tyype_exp_ll, val_str, tyype_ll, name)
                    self.file_ll.write(line_param)
                    
                    if self.inside_bifurcation != 0:
                        val = None

                    self.ids_defined[name] = tyype, val, is_global

                    if tyype == Type.INT and type_exp == Type.FLOAT:
                        token = ctx.identifier(i).IDENTIFIER().getPayload()
                        line = token.line
                        row = token.column
                        print("WARNING: possible loss of information assigning float expression to int variable '%s' in line %d and column %d" %(name,line,row))

                    elif (tyype == Type.INT or tyype == Type.FLOAT) and type_exp == Type.STRING:
                        token = ctx.identifier(i).IDENTIFIER().getPayload()
                        line = token.line
                        row = token.column
                        print("ERROR: trying to assign 'char *' expression to variable '%s' in line %d and column %d" %(name,line,row))

                    elif type_exp == Type.VOID:
                        token = ctx.identifier(i).IDENTIFIER().getPayload()
                        line = token.line
                        row = token.column
                        print("ERROR: trying to assign 'void' expression to variable '%s' in line %d and column %d" %(name,line,row))
            
            for i in range(len(ctx.array())): # para cada array/array_list que este nó possui...
                array = ctx.array(i)
                name = array.identifier().getText()
                exp = array.expression()
                type_exp, _ = self.visit(exp)

                if type_exp == Type.INT:
                    is_global = False
                    if self.inside_what_function == "":
                        is_global = True

                    array_initializer = [None for i in range(int(exp.getText()))]
                    self.ids_defined[name] = tyype, array_initializer, is_global

                else:
                    token = ctx.array(i).identifier().IDENTIFIER().getPayload() 
                    line = token.line
                    row = token.column
                    print("ERROR: na linha %d e coluna %d" %(line,row))

                array_literal = ctx.array_literal(i)

                if array_literal is not None:

                    for idx in range(len(array_literal.expression())):
                        type_array_literal, val_exp = self.visit(array_literal.expression(idx))

                        if tyype == Type.INT and type_array_literal == Type.FLOAT:
                            self.ids_defined[name] = change_array_val(self.ids_defined[name], idx, int(val_exp))
                            token = ctx.array(i).identifier().IDENTIFIER().getPayload()
                            line = token.line
                            row = token.column
                            print("WARNING: possible loss of information initializing float expression to int array '%s' at index %d of array literal in line %d and column %d" % (name,idx,line, row))
                        elif (tyype == Type.INT or tyype == Type.FLOAT) and type_array_literal == Type.STRING:
                            token = ctx.array(i).identifier().IDENTIFIER().getPayload()
                            line = token.line
                            row = token.column
                            print("ERROR: trying to initialize 'char *' expression to '%s' array '%s' at index %d of array literal in line %d and column %d" % (tyype,name,idx,line, row))
                        elif type_array_literal == Type.VOID:
                            token = ctx.array(i).identifier().IDENTIFIER().getPayload()
                            line = token.line
                            row = token.column
                            print("ERROR: na linha %d, coluna %d e index %d" % (line, row, idx))
                        else:
                            self.ids_defined[name] = change_array_val(self.ids_defined[name], idx, val_exp)
                                        
        return 


    # Visit a parse tree produced by GrammarParser#variable_assignment.
    def visitVariable_assignment(self, ctx:GrammarParser.Variable_assignmentContext):
        if ctx.identifier() is not None:
            identifier = ctx.identifier() 
            array_idx = None
        else:
            identifier = ctx.array().identifier()
            array_exp = ctx.array().expression().getText()
            if array_exp in self.ids_defined:
                array_idx = self.ids_defined[array_exp][1]
            else:
                array_idx = int(array_exp)
        name = identifier.getText()
        function = self.inside_what_function

        if (name not in self.ids_defined.keys() 
            and name not in self.ids_defined[function][1].keys()):
            token = identifier.IDENTIFIER().getPayload()
            line = token.line
            row = token.column

            print("ERROR: undefined variable '%s' in line %d and column %d" %(name,line,row))
        else:
            if name in self.ids_defined.keys():
                tyype = self.ids_defined[name][0] 
                is_global = self.ids_defined[name][2]
            else:
                tyype = self.ids_defined[function][1][name]
                is_global = False
                
            exp = ctx.expression()
            
            if exp is not None:
                error = False
                type_exp,val, reg = self.visit(exp)
                
                if self.inside_bifurcation:
                    val = None

                if tyype == Type.INT and type_exp == Type.FLOAT:
                    val = int(val)
                    token = identifier.IDENTIFIER().getPayload()
                    line = token.line
                    row = token.column
                    type_exp = Type.FLOAT

                    print("WARNING: possible loss of information assigning float expression to int variable '%s' in line %d and column %d" %(name,line,row))
                elif (tyype == Type.INT or tyype == Type.FLOAT) and type_exp == Type.STRING:
                    token = identifier.IDENTIFIER().getPayload()
                    line = token.line
                    row = token.column
                    error = True

                    print("ERROR: trying to assign 'char *' expression to variable '%s' in line %d and column %d" %(name,line,row))
                
                elif type_exp == Type.VOID:
                    token = identifier.IDENTIFIER().getPayload()
                    line = token.line
                    row = token.column
                    error = True

                    print("ERROR: na linha %d e coluna %d" %(line,row))

                if not error:
                    
                    op_atr = ctx.OP.text
                    if op_atr == '=':
                        print("a")
                    elif op_atr == '+=':
                        print("a")
                    elif op_atr == '-=':
                        print("a")
                    elif op_atr == '/=':
                        tyype_ll = type2lltype(tyype)
                        line_load_id = "	%%%d = load %s, %s* %%%s, align 4\n" % (self.count_regs, tyype_ll, tyype_ll, name)
                        self.count_regs = self.count_regs + 1
                        self.file_ll.write(line_load_id)
                        
                        if val is not None:
                            
                            if type_exp == Type.FLOAT:
                                val_str = str(float_to_hex(val))
                            else:
                                val_str = str(int(val))

                            line_div = "	%%%d = sdiv %s %%%d, %s\n" % (self.count_regs, tyype_ll,self.count_regs-1, val_str)
                            self.count_regs = self.count_regs + 1
                            self.file_ll.write(line_div)

                        line_store = '	store %s %%%d, %s* %%%s, align 4\n' % (tyype_ll, self.count_regs-1, tyype_ll, name)
                            
                        self.file_ll.write(line_store)

                        _, val_old, _ = self.ids_defined[name]
                        val = val_old/val

                    elif op_atr == '*=':
                        print("a")
                    if array_idx is None:
                        self.ids_defined[name] = tyype, val, is_global
                    else:
                        self.ids_defined[name] = change_array_val(self.ids_defined[name], array_idx, val)

        return

        
    # Visit a parse tree produced by GrammarParser#expression.
    def visitExpression(self, ctx:GrammarParser.ExpressionContext):
        list_exp = ctx.expression()

        if ctx.identifier() is not None:
            id_name = ctx.identifier().getText()

            tyype, val = self.visitIdentifier(ctx.identifier())
            
            if val is not None:
                return tyype, val, None
            
            if id_name not in self.ids_regs.keys():
                self.ids_regs[id_name] = "%%%d" % self.count_regs
                tyype_ll = type2lltype(tyype)

                line_id_expr = "	%%%d = load %s, %s* %%%s, align 4\n" % (self.count_regs, tyype_ll, tyype_ll, id_name)
                self.file_ll.write(line_id_expr)
                self.count_regs += 1
            return tyype, val, self.ids_regs[id_name]


        if len(list_exp) > 1:
            type_0, val_0, reg_0 = self.visit(list_exp[0])
            type_1, val_1, reg_1 = self.visit(list_exp[1])
            
            operation = ctx.OP.text
            token = ctx.OP
            line = token.line

            if operation =='+':
                op_ll = "add"
            elif operation == '*':
                op_ll = "mul"
            elif operation == '-':
                op_ll = "sub"
            else:
                op_ll = "div"
            

            reg_ret = "%%%d" % self.count_regs  

            if type_0 == Type.VOID or type_1 == Type.VOID:
                row = token.column

                print("ERROR: binary operator '%s' used on type void in line %d and column %d" %(operation,line,row))
                type_ret = None
                val_ret = None

            elif type_0 == None or type_1 == None:
                type_ret = None
                val_ret = None
                
            val_ret = resolve_expr(val_0,val_1,operation, line)
            type_ret = type_0
            if type_0 == Type.FLOAT or type_1 == Type.FLOAT:
                type_ret = Type.FLOAT
                op_ll = "f" + op_ll
            
            tyype_ll = type2lltype(type_ret)

            if val_ret is None:
                line_exp = "	%%%d = %s %s %s, %s\n" % (self.count_regs, op_ll, tyype_ll, reg_0, reg_1)
                self.file_ll.write(line_exp)
                self.count_regs += 1
            
            return type_ret, val_ret, reg_ret
        
        elif len(list_exp) == 1:

            tyype, val, reg = self.visit(list_exp[0])

            if ctx.OP is not None:
                operation = ctx.OP.text
                token = ctx.OP
                line = token.line

                if val is not None:
                    if operation == "-":
                        expression = operation + " " + str(val) 
                        val = - val
                        if type(val) == float:
                            print("line %d Expression %s simplified to: %.1f" %(line, expression, val))
                        else:
                            print("line %d Expression %s simplified to: %d" %(line, expression, val))

            if tyype == Type.VOID:
                return None, None, None
            
            return tyype, val, reg

        elif ctx.array() is not None:
            val = None
            name = ctx.array().identifier().getText()
            array_exp = ctx.array().expression().getText()
            if array_exp in self.ids_defined:
                array_idx = self.ids_defined[array_exp][1]
            else:
                array_idx = int(array_exp)
            tyype = None

            if name in self.ids_defined.keys():
                tyype = self.ids_defined[name][0]
                if not self.ids_defined[name][2]:
                    val = self.ids_defined[name][1][array_idx]

            else:
                token = ctx.array().identifier().IDENTIFIER().getPayload()
                line = token.line
                row = token.column

                print("ERROR: undefined array '%s' in line %d and column %d" %(name,line,row))
            
            self.visit(ctx.array())
            return tyype, val, None

        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#array.
    def visitArray(self, ctx:GrammarParser.ArrayContext):
        exp = ctx.expression()
        tyype, _ = self.visit(exp)

        if tyype != Type.INT:
            token = ctx.identifier().IDENTIFIER().getPayload()
            line = token.line
            row = token.column

            print("ERROR: array expression must be an integer, but it is %s in line %d and column %d" %(tyype,line,row))

        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#array_literal.
    def visitArray_literal(self, ctx:GrammarParser.Array_literalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#function_call.
    def visitFunction_call(self, ctx:GrammarParser.Function_callContext):
        identifier = ctx.identifier()
        name = identifier.getText()
                        # call void @splash(i32 8)

        
        if name in self.ids_defined.keys():
            tyype = self.ids_defined[name][0]
            params_types = [param[0] for param in list(self.ids_defined[name][1].values())]

            exprs = ctx.expression()
            if len(params_types) != len(exprs):
                token = identifier.IDENTIFIER().getPayload()
                line = token.line
                row = token.column

                print("ERROR: incorrect number of parameters for function '%s' in line %d and column %d. Expecting %d, but %d were given" %(name,line,row,len(params_types),len(exprs)))
            else:
                tyype_ll = type2lltype(tyype)
                type_exp_reg_ll_all = []
                for idx,exp in enumerate(exprs):
                    type_exp, val_exp, reg_exp = self.visit(exp)
                    if val_exp is None:
                        type_exp_reg_ll_all.append(type2lltype(type_exp) + " " + reg_exp)
                    else:
                        if type_exp == 'float':
                            val_exp = float_to_hex(val_exp)
                        else:
                            val_exp = str(int(val_exp))
                        type_exp_reg_ll_all.append(type2lltype(type_exp)+ " " + str(val_exp))

                    if  (params_types[idx] == Type.INT and type_exp == Type.FLOAT):
                        token = identifier.IDENTIFIER().getPayload()
                        line = token.line
                        row = token.column

                        print("WARNING: possible loss of information converting float expression to int expression in parameter 0 of function '%s' in line %d and column %d" %(name,line,row))    

                    elif not (params_types[idx] == Type.FLOAT and type_exp == Type.INT) and params_types[idx] != type_exp :
                        token = identifier.IDENTIFIER().getPayload()
                        line = token.line
                        row = token.column
                        
                        print("ERROR como aqui de tipo de argumento: na linha %d e coluna %d e tipo %s e %s" %(line,row,params_types[idx],type_exp))

                line = "call %s @%s(%s)\n" % (tyype_ll, name, ", ".join(type_exp_reg_ll_all))
                reg_return = None
                if tyype != 'void':
                    reg_return = "%%%d" % self.count_regs
                    self.count_regs = self.count_regs + 1
                    line = '	' + reg_return + ' = '+line
                else:
                    line = '	' + line

                self.file_ll.write(line)
            return tyype, None, reg_return
        else:
            token = identifier.IDENTIFIER().getPayload()
            line = token.line
            row = token.column
            print("ERROR de expressão VOID: na linha %d e coluna %d" %(line,row))
            tyype = None
            return


    # Visit a parse tree produced by GrammarParser#arguments.
    def visitArguments(self, ctx:GrammarParser.ArgumentsContext):
        params_types = {}
        
        for i in range(len(ctx.tyype())):
            tyype = ctx.tyype(i)
            identifier = ctx.identifier(i)
            name = identifier.getText()

            if name not in params_types.keys():
                params_types[name] = tyype.getText(), None

        return params_types


    # Visit a parse tree produced by GrammarParser#tyype.
    def visitTyype(self, ctx:GrammarParser.TyypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#integer.
    def visitInteger(self, ctx:GrammarParser.IntegerContext):
        return Type.INT,int(ctx.INTEGER().getText()), None


    # Visit a parse tree produced by GrammarParser#floating.
    def visitFloating(self, ctx:GrammarParser.FloatingContext): 
        return Type.FLOAT, float(ctx.FLOATING().getText()), None


    # Visit a parse tree produced by GrammarParser#string.
    def visitString(self, ctx:GrammarParser.StringContext):
        return Type.STRING, None


    # Visit a parse tree produced by GrammarParser#identifier.
    def visitIdentifier(self, ctx:GrammarParser.IdentifierContext):
        tyype = None
        val = None
        function = self.inside_what_function
        name = ctx.getText()
        if function in self.ids_defined.keys():
            if name in self.ids_defined[function][1].keys():
                tyype = self.ids_defined[function][1][name][0]
            else:
                if name in self.ids_defined.keys():
                    tyype = self.ids_defined[name][0]
                    if not self.ids_defined[name][2]:
                        val = self.ids_defined[name][1]
                
        return tyype, val

