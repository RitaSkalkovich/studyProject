package Lesson6.inheritance;

import Lesson6.inheritance.Bicycle;
import Lesson6.inheritance.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("mers");
        car.moving();
        Bicycle bicycle = new Bicycle("aist");
        bicycle.doGo();
//        bicycle.moving();
        Snail snail = new Snail("snail");
        snail.doGo1();
    }
}
