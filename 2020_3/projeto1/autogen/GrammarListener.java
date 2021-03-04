// Generated from autogen/Grammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(GrammarParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(GrammarParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variable_definition}.
	 * @param ctx the parse tree
	 */
	void enterVariable_definition(GrammarParser.Variable_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variable_definition}.
	 * @param ctx the parse tree
	 */
	void exitVariable_definition(GrammarParser.Variable_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(GrammarParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(GrammarParser.Function_definitionContext ctx);
}