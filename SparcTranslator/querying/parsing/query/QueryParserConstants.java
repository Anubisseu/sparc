/* Generated By:JJTree&JavaCC: Do not edit this line. QueryParserConstants.java */
package querying.parsing.query;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface QueryParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int IDENTIFIER = 1;
  /** RegularExpression Id. */
  int VARIABLE = 2;
  /** RegularExpression Id. */
  int NONZERODIGIT = 3;
  /** RegularExpression Id. */
  int POSITIVE_INTEGER = 4;
  /** RegularExpression Id. */
  int ZERO = 5;
  /** RegularExpression Id. */
  int PLUS = 6;
  /** RegularExpression Id. */
  int MINUS = 7;
  /** RegularExpression Id. */
  int MULT = 8;
  /** RegularExpression Id. */
  int DIV = 9;
  /** RegularExpression Id. */
  int OP = 10;
  /** RegularExpression Id. */
  int CP = 11;
  /** RegularExpression Id. */
  int COMMA = 12;
  /** RegularExpression Id. */
  int DOT = 13;
  /** RegularExpression Id. */
  int IDENTIFIER_WITH_OP = 14;
  /** RegularExpression Id. */
  int SPACE = 15;
  /** RegularExpression Id. */
  int UNEXPECTED_CHAR = 16;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "<IDENTIFIER>",
    "<VARIABLE>",
    "<NONZERODIGIT>",
    "<POSITIVE_INTEGER>",
    "\"0\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"(\"",
    "\")\"",
    "\",\"",
    "\".\"",
    "<IDENTIFIER_WITH_OP>",
    "<SPACE>",
    "<UNEXPECTED_CHAR>",
  };

}
