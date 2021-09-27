package LambdaHomeWork.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        Collections.addAll(phones,
                new Phone("BB", 100),
                new Phone("CCC", 200),
                new Phone("A", 150));


        List<Phone> findPhones = phones.stream()
                .sorted((p1, p2) -> {
                    return p1.getName().length() - p2.getName().length();
                })

                .collect(Collectors.toList());

        for (Phone s : findPhones) {
            System.out.println(s);
        }


    }
}


