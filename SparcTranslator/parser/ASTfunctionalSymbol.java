/* Generated By:JJTree: Do not edit this line. ASTfunctionalSymbol.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTfunctionalSymbol extends SimpleNode {
  public ASTfunctionalSymbol(int id) {
    super(id);
  }

  public ASTfunctionalSymbol(SparcTranslator p, int id) {
    super(p, id);
  }
  
  public String toString() {
	  StringBuilder result = new StringBuilder();
	  result.append(this.image.substring(0,this.image.indexOf(')')));
	  result.append(((ASTsortExpressionList)this.jjtGetChild(0)).toString());
	  result.append(")");
	  return result.toString();
	  
  }

}
/* JavaCC - OriginalChecksum=635f26d7ed77a0136cf69a523865833a (do not edit this line) */
