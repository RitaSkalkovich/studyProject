package lesson5.task3;

public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public static class Moving {
        public void go() {
            System.out.println("Врум-Врум");
        }
    }
}
