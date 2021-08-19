package lesson5.task3;

public class Snail {

    private String model;

    public Snail(String model) {
        this.model = model;
    }

    public static class Moving {
        public void go() {
            System.out.println("Шлеп");
        }
    }
}
