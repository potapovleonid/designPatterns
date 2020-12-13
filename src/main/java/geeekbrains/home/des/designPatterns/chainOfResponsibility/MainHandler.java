package geeekbrains.home.des.designPatterns.chainOfResponsibility;



public class MainHandler {
    private MainHandler nextHandler;

    public void handle(Context ctx, Request request){
        if (nextHandler != null){
            nextHandler.handle(ctx, request);
        }
    }

    MainHandler addHandle(MainHandler nextHandler){
        this.nextHandler = nextHandler;
        return nextHandler;
    }
}
