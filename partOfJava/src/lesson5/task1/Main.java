package lesson5.task1;

public class Main {

    public static void main(String[] args) {
        Bird eagle = new Bird("Ястреб", 3.6);
        Bird sparrow = new Bird("Воробей", 1);
        Bird penguin = new Bird("Пингвин", 11);

        System.out.println(eagle.getKind());
//        System.out.println(eagle.getWeight());
//        System.out.println(sparrow.weight);


        System.out.println(eagle.kind + "\n" + sparrow.kind + "\n" + penguin.kind); //все птицы


        double allWeight = eagle.weight + sparrow.weight + penguin.weight;   //общий вес
        System.out.println(allWeight);
        //общий вес

    }
}

//
//
//
//        double allWeight = eagle.weight + sparrow.weight + penguin.weight;
//        System.out.println(allWeight);


//        System.out.println(eagle.getKind());
//        System.out.println(findBirdSpecified2.getBirdSpecified());
//        System.out.println(findBirdSpecified3.getBirdSpecified());

//        Bird findWeight = new Bird();
//        Bird findWeight2 = new Bird();
//        Bird findWeight3 = new Bird();

//        findWeight.findWeightFor(3.6);
//        findWeight2.findWeightFor(4);
//        findWeight3.findWeightFor(3.6);

//
//        System.out.println(findWeight.getBirdWeight());


//        System.out.println(findWeight.findWeightFor(3.6));
//        System.out.println(findWeight2.findWeightFor(1));
//        System.out.println(findWeight3.findWeightFor(11));




