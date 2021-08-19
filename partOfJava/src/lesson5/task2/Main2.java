package lesson5.task2;

public class Main2 {

    public static void main(String[] args) {
        Chair findIkea = new Chair ("ikea");
        Chair.Legs withWheel = findIkea.new Legs();
        withWheel.wheel();
        Chair findIkea1 = new Chair("ikea");
        Chair.Seat withMater = findIkea1.new Seat();
        withMater.withMaterial();
        Chair findIkea2 = new Chair("ikea");
        Chair.Back folding = findIkea1.new Back();
        folding.folding();
    }

}
