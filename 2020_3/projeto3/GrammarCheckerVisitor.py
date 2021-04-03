# Generated from antlr4-python3-runtime-4.7.2/src/autogen/Grammar.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GrammarParser import GrammarParser
else:
    from GrammarParser import GrammarParser


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
            val_ret = val_0 / val_1
        else:
            return None
            
        expression = str(val_0) + " " + operation + " " + str(val_1) 

        if type(val_ret) == float:
            print("line %d Expression %s simplified to: %.1f" %(line, expression, val_ret))
        else:
            print("line %d Expression %s simplified to: %d" %(line, expression, val_ret))
        return val_ret


class Type:
    VOID = "void"
    INT = "int"
    FLOAT = "float"
    STRING = "char *"

# This class defines a complete generic visitor for a parse tree produced by GrammarParser.
class GrammarCheckerVisitor(ParseTreeVisitor):
    ids_defined = {} # Dicionário para armazenar as informações necessárias para cada identifier definido
    inside_what_function = "" # String que guarda a função atual que o visitor está visitando. Útil para acessar dados da função durante a visitação da árvore sintática da função.
    inside_bifurcation = False

    # Visit a parse tree produced by GrammarParser#fiile.
    def visitFiile(self, ctx:GrammarParser.FiileContext):
        return self.visitChildren(ctx)


     # Visit a parse tree produced by GrammarParser#function_definition.
    def visitFunction_definition(self, ctx:GrammarParser.Function_definitionContext):
        tyype = ctx.tyype().getText()
        name = ctx.identifier().getText()
        params = self.visit(ctx.arguments())

        self.ids_defined[name] = tyype, params, None
        self.inside_what_function = name
        self.visit(ctx.body())
        return


    # Visit a parse tree produced by GrammarParser#body.
    def visitBody(self, ctx:GrammarParser.BodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#statement.
    def visitStatement(self, ctx:GrammarParser.StatementContext):
        if ctx.RETURN() is not None:
            name = self.inside_what_function
            tyype = self.ids_defined[name][0]

            if tyype == Type.VOID:
                token = ctx.RETURN().getPayload()
                line = token.line
                row = token.column
                print( "ERROR: trying to return a non void expression from void function '%s' in line %d and column %d" %(name,line,row))
                
            else:
                type_exp, _ = self.visit(ctx.expression())

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

        else:
            self.visitChildren(ctx)
            
        return


    # Visit a parse tree produced by GrammarParser#if_statement.
    def visitIf_statement(self, ctx:GrammarParser.If_statementContext):

        self.visit(ctx.expression())
        self.inside_bifurcation = True

        if ctx.statement() is not None:
            self.visit(ctx.statement())

        else:
            self.visit(ctx.body())

        if ctx.else_statement() is not None:
            self.visit(ctx.else_statement())
        
        self.inside_bifurcation = False
        return

    # Visit a parse tree produced by GrammarParser#else_statement.
    def visitElse_statement(self, ctx:GrammarParser.Else_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#for_loop.
    def visitFor_loop(self, ctx:GrammarParser.For_loopContext):
        return self.visitChildren(ctx)


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
                self.ids_defined[name] = tyype, None, None

                if exp is not None:
                    type_exp, val = self.visit(exp)

                    if self.inside_bifurcation:
                        val = None

                    self.ids_defined[name] = tyype, val, None

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
                    self.ids_defined[name] = tyype, None, None
                else:
                    token = ctx.array(i).identifier().IDENTIFIER().getPayload() 
                    line = token.line
                    row = token.column
                    print("ERROR: na linha %d e coluna %d" %(line,row))

                array_literal = ctx.array_literal(i)

                if array_literal is not None:

                    for idx in range(len(array_literal.expression())):
                        type_array_literal, _ = self.visit(array_literal.expression(idx))

                        if tyype == Type.INT and type_array_literal == Type.FLOAT:
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
                    
        return 


    # Visit a parse tree produced by GrammarParser#variable_assignment.
    def visitVariable_assignment(self, ctx:GrammarParser.Variable_assignmentContext):
        if ctx.identifier() is not None:
            identifier = ctx.identifier() 
        else:
            identifier = ctx.array().identifier()
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
            else:
                tyype = self.ids_defined[function][1][name]
                
            exp = ctx.expression()
            
            if exp is not None:
                type_exp,val = self.visit(exp)
                
                if self.inside_bifurcation:
                    val = None
                
                self.ids_defined[name] = tyype, val, None

                if tyype == Type.INT and type_exp == Type.FLOAT:
                    token = identifier.IDENTIFIER().getPayload()
                    line = token.line
                    row = token.column

                    print("WARNING: possible loss of information assigning float expression to int variable '%s' in line %d and column %d" %(name,line,row))
                elif (tyype == Type.INT or tyype == Type.FLOAT) and type_exp == Type.STRING:
                    token = identifier.IDENTIFIER().getPayload()
                    line = token.line
                    row = token.column

                    print("ERROR: trying to assign 'char *' expression to variable '%s' in line %d and column %d" %(name,line,row))
                
                elif type_exp == Type.VOID:
                    token = identifier.IDENTIFIER().getPayload()
                    line = token.line
                    row = token.column

                    print("ERROR: na linha %d e coluna %d" %(line,row))

        return

        
    # Visit a parse tree produced by GrammarParser#expression.
    def visitExpression(self, ctx:GrammarParser.ExpressionContext):
        list_exp = ctx.expression()

        if len(list_exp) > 1:
            type_0, val_0 = self.visit(list_exp[0])
            type_1, val_1 = self.visit(list_exp[1])

            operation = ctx.OP.text
            token = ctx.OP
            line = token.line

            if type_0 == Type.VOID or type_1 == Type.VOID:
                row = token.column

                print("ERROR: binary operator '%s' used on type void in line %d and column %d" %(operation,line,row))
                return None, None

            elif type_0 == None  or type_1 == None:
                return None, None

            val_ret = resolve_expr(val_0,val_1,operation, line)
            
            if type_0 == Type.FLOAT or type_1 == Type.FLOAT:
                return Type.FLOAT, val_ret

            return type_0, val_ret 
        
        elif len(list_exp) == 1:

            tyype, val = self.visit(list_exp[0])

            operation = ctx.OP.text
            token = ctx.OP
            line = token.line
            
            if operation == "-":
                expression = operation + " " + str(val) 
                val = - val
                if type(val) == float:
                    print("line %d Expression %s simplified to: %.1f" %(line, expression, val))
                else:
                    print("line %d Expression %s simplified to: %d" %(line, expression, val))

            if tyype == Type.VOID:
                return None, None
            
            return tyype, val

        elif ctx.array() is not None:
            name = ctx.array().identifier().getText()
            tyype = None

            if name in self.ids_defined.keys():
                tyype = self.ids_defined[name][0]

            else:
                token = ctx.array().identifier().IDENTIFIER().getPayload()
                line = token.line
                row = token.column

                print("ERROR: undefined array '%s' in line %d and column %d" %(name,line,row))
            
            self.visit(ctx.array())
            return tyype, None

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
                for idx,exp in enumerate(exprs):
                    type_exp, _ = self.visit(exp)

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

           
            return tyype
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
        return Type.INT,int(ctx.INTEGER().getText())


    # Visit a parse tree produced by GrammarParser#floating.
    def visitFloating(self, ctx:GrammarParser.FloatingContext): 
        return Type.FLOAT, float(ctx.FLOATING().getText())


    # Visit a parse tree produced by GrammarParser#string.
    def visitString(self, ctx:GrammarParser.StringContext):
        return Type.STRING, None


    # Visit a parse tree produced by GrammarParser#identifier.
    def visitIdentifier(self, ctx:GrammarParser.IdentifierContext):
        tyype = None
        function = self.inside_what_function
        name = ctx.getText()
        val = None
        if function in self.ids_defined.keys():
            if name in self.ids_defined[function][1].keys():
                tyype = self.ids_defined[function][1][name][0]
            else:
                if name in self.ids_defined.keys():
                    tyype = self.ids_defined[name][0]
                    val = self.ids_defined[name][1] 
        

        return tyype, val

