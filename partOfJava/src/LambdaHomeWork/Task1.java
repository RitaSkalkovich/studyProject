package LambdaHomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> collectionList = new ArrayList<>();
        Collections.addAll(collectionList, "ser", "collection", "find", "ser", "collectionCollection", "collectionCollectionMore");

        List<String> newCollection = collectionList.stream()
                .filter(s -> !s.contains("ser")).sorted(Comparator.comparing(x -> x.length(), Comparator.reverseOrder()))
                .collect(Collectors.toList());

        for (String s : newCollection) {
            System.out.println(s);
        }

    }
}