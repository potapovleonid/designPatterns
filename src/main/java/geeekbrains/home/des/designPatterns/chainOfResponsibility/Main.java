package geeekbrains.home.des.designPatterns.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        Request request = new Request("1987654432", "Hi men");
        MainHandler handler = new MainHandler();
            handler.addHandle(new PasswordHandler("1987654432"))
                    .addHandle(new PrintHandler());

        handler.handle(context, request);
    }
}
