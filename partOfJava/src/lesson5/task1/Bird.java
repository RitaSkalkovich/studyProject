package lesson5.task1;

public class Bird {
    String kind;
    double weight;
    static double totalWeight;

    public Bird (String kind) {
        this.kind = kind;
        weight = 0;
    }

    public static void printTotalWeight() {
        System.out.println("Сумма всех птиц   " + totalWeight);
    }

    public Bird(String kind, double weight) {
        this.kind = kind;
        this.weight = weight;
        totalWeight = totalWeight + weight;

    }

    public static double getTotalWeight() {
        return totalWeight;
    }

    public String getKind() {    // получить вид
        return kind;

    }

    public double getWeight() {    // получить вес
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
