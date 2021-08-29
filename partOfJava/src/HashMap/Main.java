package HashMap;


import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {


//        Person ivan = new Person("i","hb",454);
//        Person petr = new Person("hg","hghgb",45774);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Ivan", 1);
        map.put("igor", 2);
        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}

//       System.out.println(map.get(454));
//       map.put(1, "ivan");
//       map.put(2, "petr");
//       String ivan = map.get(1);
//       System.out.println(ivan);




