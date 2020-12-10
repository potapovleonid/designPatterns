package geeekbrains.home.des.designPatterns.adapter;

import java.util.LinkedList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        List<BatCar> cars = new LinkedList<>();
        cars.add(new Batmobile(15));
        cars.add(new Batmobile(12));

        Car car = new Car(5);

        cars.add(new CarToBatCarAdapter(car));

        cars.forEach(BatCar::switchEngine);
        System.out.println("-------------------");
        cars.forEach(BatCar::fly);
        System.out.println("-------------------");
        cars.forEach(BatCar::move);

    }
}
