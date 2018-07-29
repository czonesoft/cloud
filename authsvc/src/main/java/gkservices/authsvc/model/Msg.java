package gkservices.authsvc.model;

public abstract class Msg {
    private String msg;
    public String getMsg(){
        return msg;
    }
    public void setMsg(String contents){
        msg = contents;
    }
}
