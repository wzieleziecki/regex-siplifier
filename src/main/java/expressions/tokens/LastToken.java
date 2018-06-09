package expressions.tokens;

public enum LastToken {
    STAR("*"), QUESTION_MARK("?"), PLUS_SIGN("+");

    private String token;
    LastToken(String token){
        this.token = token;
    }

    public String getToken(){
        return token;
    }
}
