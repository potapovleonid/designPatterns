package geeekbrains.home.des.designPatterns.chainOfResponsibility;

public class PrintHandler extends MainHandler{

    @Override
    public void handle(Context ctx, Request request) {
        System.out.println("Handlers ended, msg: " + request.getMsg());
        super.handle(ctx, request);
    }
}
