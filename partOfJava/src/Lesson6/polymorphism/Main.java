package Lesson6.polymorphism;

public class Main {
    public static void main(String[] args) {
        Motion motion = new Motion("default");
        motion.go();
        Bicycle bicycle = new Bicycle("Aist");
        bicycle.go();
        Car car = new Car ("Mers");
        car.go();
        Snail snail = new Snail ("SnailSnail");
        snail.go();
    }
}
