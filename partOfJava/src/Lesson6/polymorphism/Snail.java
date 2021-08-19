package Lesson6.polymorphism;

public class Snail extends Motion {
    public Snail(String moving) {
        super(moving);
    }

    @Override
    public void go() {
        System.out.println("шлеп");
    }
}