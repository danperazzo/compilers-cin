# Generated from antlr4-python3-runtime-4.7.2/src/autogen/Grammar.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GrammarParser import GrammarParser
else:
    from GrammarParser import GrammarParser

# This class defines a complete generic visitor for a parse tree produced by GrammarParser.

'''
COMO RESGATAR INFORMAÇÕES DA ÁRVORE

Observe o seu Grammar.g4. Cada regra sintática gera uma função com o nome corespondente no Visitor e na ordem em que está na gramática.

Se for utilizar sua gramática do projeto 1, por causa de conflitos com Python, substitua as regras file por fiile e type por tyype. Use prints temporários para ver se está no caminho certo.  
"make tree" agora desenha a árvore sintática, se quiser vê-la para qualquer input, enquanto "make" roda este visitor sobre o a árvore gerada a partir de Grammar.g4 alimentada pelo input.

Exemplos:  

# Obs.: Os exemplos abaixo utilizam nós 'expression', mas servem apra qualquer tipo de nó

self.visitChildren(ctx) # visita todos os filhos do nó atual
expr = self.visit(ctx.expression())  # visita a subárvore do nó expression e retorna o valor retornado na função "visitRegra"

for i in range(len(ctx.expression())): # para cada expressão que este nó possui...
    ident = ctx.expression(i) # ...pegue a i-ésima expressão


if ctx.FLOAT() != None: # se houver um FLOAT (em vez de INT ou VOID) neste nó (parser)
    return Type.FLOAT # retorne tipo float

ctx.identifier().getText()  # Obtém o texto contido no nó (neste caso, será obtido o nome do identifier)

token = ctx.identifier(i).IDENTIFIER().getPayload() # Obtém o token referente à uma determinada regra léxica (neste caso, IDENTIFIER)
token.line      # variável com a linha do token
token.column    # variável com a coluna do token
'''


# Dica: Retorne Type.INT, Type.FLOAT, etc. Nos nós e subnós das expressões para fazer a checagem de tipos enquanto percorre a expressão.
class Type:
    VOID = "void"
    INT = "int"
    FLOAT = "float"
    STRING = "char *"

class GrammarCheckerVisitor(ParseTreeVisitor):
    ids_defined = {} # Dicionário para armazenar as informações necessárias para cada identifier definido
    inside_what_function = "" # String que guarda a função atual que o visitor está visitando. Útil para acessar dados da função durante a visitação da árvore sintática da função.

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
                print("ERROR: na linha %d e coluna %d" %(line,row))
       
        self.visitChildren(ctx)
        return


    # Visit a parse tree produced by GrammarParser#if_statement.
    def visitIf_statement(self, ctx:GrammarParser.If_statementContext):
        return self.visitChildren(ctx)


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
                    type_exp = self.visit(exp)

                    if tyype == Type.INT and type_exp == Type.FLOAT:
                        token = exp.floating().FLOATING().getPayload()
                        line = token.line
                        row = token.column
                        print("WARNING: na linha %d e coluna %d" %(line,row))

                    elif (tyype == Type.INT or tyype == Type.FLOAT) and type_exp == Type.STRING:
                        token = exp.string().STRING().getPayload()
                        line = token.line
                        row = token.column
                        print("ERROR: na linha %d e coluna %d" %(line,row))

                    elif type_exp == Type.VOID:
                        token = exp.function_call().identifier().IDENTIFIER().getPayload()
                        line = token.line
                        row = token.column
                        print("ERROR: na linha %d e coluna %d" %(line,row))
            
            for i in range(len(ctx.array())): # para cada array/array_list que este nó possui...
                array = ctx.array(i)
                name = array.identifier().getText()
                exp = array.expression()
                type_exp = self.visit(exp)

                if type_exp == Type.INT:
                    size = int(exp.getText())
                    self.ids_defined[name] = tyype, size, None
                else:
                    if type_exp == Type.FLOAT:
                        token = exp.floating().FLOATING().getPayload()
                    else:
                        token = exp.string().STRING().getPayload()
                        
                    line = token.line
                    row = token.column
                    print("ERROR: na linha %d e coluna %d" %(line,row))

                array_literal = ctx.array_literal(i)

                if array_literal is not None:

                    for idx in range(len(array_literal.expression())):
                        type_array_literal = self.visit(array_literal.expression(idx))

                        if tyype == Type.INT and type_array_literal == Type.FLOAT:
                            token = array_literal.expression(idx)
                            
                            if token.floating() is None:
                                token = token.expression(0)
                            
                            token = token.floating().FLOATING().getPayload()
                            line = token.line
                            row = token.column
                            print("WARNING: na linha %d, coluna %d e index %d" % (line, row, idx))

                        elif (tyype == Type.INT or tyype == Type.FLOAT) and type_array_literal == Type.STRING:
                            token = array_literal.expression(idx).string().STRING().getPayload()
                            line = token.line
                            row = token.column
                            print("ERROR: na linha %d, coluna %d e index %d" % (line, row, idx))

                        elif type_array_literal == Type.VOID:
                            token = array_literal.expression(idx).function_call().identifier().IDENTIFIER().getPayload()
                            line = token.line
                            row = token.column
                            print("ERROR: na linha %d, coluna %d e index %d" % (line, row, idx))
                    
        return 


    # Visit a parse tree produced by GrammarParser#variable_assignment.
    def visitVariable_assignment(self, ctx:GrammarParser.Variable_assignmentContext):
        if ctx.identifier() is not None:
            identifier = ctx.identifier() 
            idx = None
        else:
            identifier = ctx.array().identifier()
            idx = int(ctx.array().expression().getText())
        name = identifier.getText()

        if name not in self.ids_defined.keys():
            token = identifier.IDENTIFIER().getPayload()
            line = token.line
            row = token.column
            print("ERROR: na linha %d e coluna %d" %(line,row))

        else:
            tyype = self.ids_defined[name][0]  
            exp = ctx.expression()
            
            if exp is not None:
                type_exp = self.visit(exp)

                if tyype == Type.INT and type_exp == Type.FLOAT:
                    token = exp.floating().FLOATING().getPayload()
                    line = token.line
                    row = token.column
                    if idx is not None:
                        print("WARNING: na linha %d, coluna %d e index %d" % (line, row, idx))
                    else:
                        print("WARNING: na linha %d e coluna %d" %(line,row))

                elif (tyype == Type.INT or tyype == Type.FLOAT) and type_exp == Type.STRING:
                    token = exp.string().STRING().getPayload()
                    line = token.line
                    row = token.column
                    if idx is not None:
                        print("ERROR: na linha %d, coluna %d e index %d" % (line, row, idx))
                    else:
                        print("ERROR: na linha %d e coluna %d" %(line,row))
                
                elif type_exp == Type.VOID:
                    token = exp.function_call().identifier().IDENTIFIER().getPayload()
                    line = token.line
                    row = token.column
                    if idx is not None:
                        print("ERROR: na linha %d, coluna %d e index %d" % (line, row, idx))
                    else:
                        print("ERROR: na linha %d e coluna %d" %(line,row))

        return


    # Visit a parse tree produced by GrammarParser#expression.
    def visitExpression(self, ctx:GrammarParser.ExpressionContext):
        list_exp = ctx.expression()

        if len(list_exp)>1:

            type_0 = self.visit(list_exp[0])
            type_1 = self.visit(list_exp[1])

            if  (type_0 == Type.FLOAT and type_1==Type.INT) or (type_1 == Type.FLOAT and type_0==Type.INT):
                return Type.FLOAT

            if (type_0 == Type.VOID or type_1 == Type.VOID):
                return Type.VOID

        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#array.
    def visitArray(self, ctx:GrammarParser.ArrayContext):
        print("here")
        exp = ctx.expression()
        print("exp =",exp)
        tyype = self.visit(exp)
        if tyype != Type.INT:

            token = ctx.identifier().IDENTIFIER().getPayload()

            line = token.line
            row = token.column
            print("ERROR de index not integer: na linha %d e coluna %d" %(line,row))
            

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
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#tyype.
    def visitTyype(self, ctx:GrammarParser.TyypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GrammarParser#integer.
    def visitInteger(self, ctx:GrammarParser.IntegerContext):
        return Type.INT


    # Visit a parse tree produced by GrammarParser#floating.
    def visitFloating(self, ctx:GrammarParser.FloatingContext): 
        return Type.FLOAT


    # Visit a parse tree produced by GrammarParser#string.
    def visitString(self, ctx:GrammarParser.StringContext):
        return Type.STRING


    # Visit a parse tree produced by GrammarParser#identifier.
    def visitIdentifier(self, ctx:GrammarParser.IdentifierContext):

        name = ctx.getText()
        tyype = self.ids_defined[name][0]
        
        return tyype.getText()

