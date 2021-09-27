package LambdaHomeWork;

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> collectionList = new ArrayList<>();
        Collections.addAll(collectionList, "ser", "collection", "vor", "find", "ser", "collectionCollection", "collectionCollectionMore");
        System.out.println(collectionList.stream()

                .filter(s -> s.contains("vor"))
                .findFirst()
                .orElse("No elements"));

    }
}





