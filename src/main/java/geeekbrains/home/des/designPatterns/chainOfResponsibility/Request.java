package geeekbrains.home.des.designPatterns.chainOfResponsibility;

public class Request {
    private String pass;
    private String msg;

    public Request(String pass, String msg) {
        this.pass = pass;
        this.msg = msg;
    }

    public String getPass() {
        return pass;
    }

    public String getMsg() {
        return msg;
    }

    public void changePass(String newPass){
        this.pass = newPass;
    }
}
