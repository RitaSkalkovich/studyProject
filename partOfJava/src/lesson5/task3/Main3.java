package lesson5.task3;

public class Main3 {
    public static void main(String[] args) {
        Car car = new Car("Peugeot");
        Car.Moving go = new Car.Moving();
        go.go();
        Bicycle bicycle = new Bicycle("Aist");
        Bicycle.Moving go1 = new Bicycle.Moving();
        go1.go();
        Snail snail = new Snail("SnailNew");
        Snail.Moving go2 = new Snail.Moving();
        go2.go();
    }

}
