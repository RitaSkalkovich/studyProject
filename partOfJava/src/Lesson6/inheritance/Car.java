package Lesson6.inheritance;

public class Car {
    protected String model;

    public Car(String model) {
        this.model = model;
    }

    public void moving() {
        System.out.println("Врум-Врум");
    }
}

