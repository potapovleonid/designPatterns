package geeekbrains.home.des.designPatterns.adapter;

public class Batmobile implements BatCar{

    private boolean engine = false;
    private int ID;

    public Batmobile(int ID) {
        this.ID = ID;
    }

    public void move(){
        if (engine) {
            System.out.println("Batmobile moved");
        } else {
            System.out.println("Batmobile engine status: " + engine);
        }
    }

    public void switchEngine(){
        engine = !engine;
        System.out.println("Batmobile status engine: " + engine );
    }

    @Override
    public void fly() {
        if (engine){
            System.out.println("Batmobile flew");
        }
    }
}
