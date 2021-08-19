package Lesson6.inheritance;

public class Bicycle extends Car {
    public Bicycle(String model) {
        super(model);

    }

    public void doGo() {
        System.out.println("Шарк-Шарк");
    }
}
