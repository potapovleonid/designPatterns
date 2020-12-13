package geeekbrains.home.des.designPatterns.adapter;

public class CarToBatCarAdapter implements BatCar {

    private Car car;
    private boolean engine;

    public CarToBatCarAdapter(Car car) {
        this.car = car;
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

    @Override
    public void fly() {
        if (engine){
            System.out.println("The car flew");
        }
    }
}
