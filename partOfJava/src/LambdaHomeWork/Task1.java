package LambdaHomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> collectionList = new ArrayList<>();
        Collections.addAll(collectionList, "ser", "collection", "find", "ser", "collectionCollection", "collectionCollectionMore");
        collectionList.stream()
                .filter(s -> !s.contains("ser")).sorted(Comparator.comparing(x -> x.length(), Comparator.reverseOrder()))
                .forEach(s -> System.out.println(s));
    }
}

