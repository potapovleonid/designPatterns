package geeekbrains.home.des.designPatterns.adapter;

public class Car {
    protected boolean engine = false;
    private int ID;

    public Car(int ID) {
        this.ID = ID;
    }

    public void move(){
        if (engine) {
            System.out.println("car moved");
        } else {
            System.out.println("Engine status: " + engine);
        }
    }

    public void switchEngine(){
        engine = !engine;
        System.out.println("status engine: " + engine );
    }

}
