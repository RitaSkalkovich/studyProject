package lesson5.task1;

public class Main {

    public static void main(String[] args) {
        Bird eagle = new Bird("Ястреб", 3.6);
        Bird sparrow = new Bird("Воробей", 1);
        Bird penguin = new Bird("Пингвин", 11);


        eagle.getWeight();
        sparrow.getWeight();
        penguin.getWeight();


        Bird.getTotalWeight();

        Bird eagle1 = new Bird("newEagle");
        System.out.println("weight new Eagle  " + eagle1.getWeight());

        Bird.printTotalWeight();
        eagle.setWeight(2.8);
        System.out.println("changed and set  " + eagle.getWeight());

        System.out.println(eagle.getKind());
        System.out.println(eagle.getWeight());
        System.out.println(sparrow.weight);


        System.out.println(eagle.kind + "\n" + sparrow.kind + "\n" + penguin.kind); //все птицы

    }
}
