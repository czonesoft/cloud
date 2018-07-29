package gkservices.authsvc.model;

public class AuthMsg extends Msg {
    private String code;
    public String getCode(){
        return code;
    }
    public void setCode(String c){
        code = c;
    }
}
