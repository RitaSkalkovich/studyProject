package lesson5.task2;

public class Main2 {

    public static void main(String[] args) {
        Chair findIkea = new Chair ("ikea", 5);
        Chair.legs withWheel = findIkea.new legs();
        withWheel.wheel();
    }

}
