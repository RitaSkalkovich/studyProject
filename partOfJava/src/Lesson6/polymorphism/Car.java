package Lesson6.polymorphism;

public class Car extends Motion {
    public Car(String moving) {
        super(moving);
    }

    @Override
    public void go() {
        System.out.println("Врум-Врум");
    }
}