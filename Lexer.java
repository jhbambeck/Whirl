import java.util.ArrayList;

public class Lexer {

    int idx;
    int line;

    public Lexer(int line) {
	this.idx = 0;
	this.line = line;
    }

    public ArrayList<Token> lex(String input, int line, int col) {
	Token t = null;
	ArrayList<Token> tokens = new ArrayList<>();
	while (this.idx < input.length()) {
	    if (input.charAt(this.idx) == '&') {
		t = this.lexBinaryOperator(Token.BinaryOpType.andOp);
		tokens.add(t);
	    } else if (input.charAt(this.idx) == '|') {
		t = this.lexBinaryOperator(Token.BinaryOpType.orOp);
		tokens.add(t);
	    } else {
		this.idx++;
	    }
	}
	return tokens;
    }

    public Token lexBinaryOperator(Token.BinaryOpType binOpType) {
	Token t = new Token(Token.TokenType.binaryOpToken, binOpType, this.line, this.idx);
	this.idx++;
	return t;
    }
}
