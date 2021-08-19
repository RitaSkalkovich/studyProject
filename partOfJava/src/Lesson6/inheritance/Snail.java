package Lesson6.inheritance;

public class Snail extends Car {
    public Snail(String model) {
        super(model);

    }

    public void doGo1() {
        System.out.println("шлеп");
    }
}