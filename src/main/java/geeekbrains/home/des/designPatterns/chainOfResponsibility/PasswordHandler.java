package geeekbrains.home.des.designPatterns.chainOfResponsibility;


public class PasswordHandler extends MainHandler{

    private String correctPassword;

    public PasswordHandler(String correctPassword) {
        this.correctPassword = correctPassword;
    }

    @Override
    public void handle(Context ctx, Request request) {
        if (request.getPass().equals(correctPassword)){
            System.out.println("Pass is true");
            super.handle(ctx, request);
        } else {
            throw new IllegalArgumentException("Pass if false");
        }
    }
}
