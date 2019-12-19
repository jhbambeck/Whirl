
public class Token {

    public enum TokenType {
	keywordToken, identifierToken, cellToken, numberToken, unaryOpToken, binaryOpToken, commaToken, semicolonToken,
	assignmnetToken, singleLineCommentToken, parentDirectoryToken,
    }

    public enum UnaryOpType {
	incrementOp, decrementOp
    }

    public enum BinaryOpType {
	addOp, subtractOp, multiplyOp, divideOp,
    }

    public enum KeywordType {
	keywordFor, keywordParms, keywordInclude, keywordFilename
    }

    // members

    private TokenType mTokenType;
    private UnaryOpType mUnaryOpType;
    private BinaryOpType mBinaryOpType;
    private KeywordType mKeywordType;

    private int line;
    private int col;

    // constructors

    public Token(TokenType mTokenType, int line, int col) {
	this.mTokenType = mTokenType;
	this.line = line;
	this.col = col;
    }

    public Token(TokenType mTokenType, UnaryOpType mUnaryOpType, int line, int col) {
	this.mTokenType = mTokenType;
	this.mUnaryOpType = mUnaryOpType;
	this.line = line;
	this.col = col;
    }

    public Token(TokenType mTokenType, BinaryOpType mBinaryOpType, int line, int col) {
	this.mTokenType = mTokenType;
	this.mBinaryOpType = mBinaryOpType;
	this.line = line;
	this.col = col;
    }

    public Token(TokenType mTokenType, KeywordType mKeywordType, int line, int col) {
	this.mTokenType = mTokenType;
	this.mKeywordType = mKeywordType;
	this.line = line;
	this.col = col;
    }

    // getters

    public TokenType getTokenType() {
	return this.mTokenType;
    }

    public UnaryOpType getUnaryOpType() {
	return this.mUnaryOpType;
    }

    public BinaryOpType getBinaryOpType() {
	return this.mBinaryOpType;
    }

    public KeywordType getKeywordType() {
	return this.mKeywordType;
    }

    public int getLine() {
	return this.line;
    }

    public int getCol() {
	return this.col;
    }
}
