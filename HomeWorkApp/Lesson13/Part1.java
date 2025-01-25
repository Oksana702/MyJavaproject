package HomeWorkApp.Lesson13;

import java.util.HashMap;
import java.util.Map;

class PartOne {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words ={
                "Alfa", "Beta","Omega","Gamma", "Alfa", "Delta","Sigma","Omega", "Pi", "Beta"
        };
        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }


private static void task2() {
    Directory directory = new Directory();

    directory.add("Volkova", "050888897");
    directory.add("Volkova", "050888896");
    directory.add("Andreyev", "050888895");
    directory.add("Andreyev", "050888894");
    directory.add("Petrova", "050888893");
    directory.add("Petrova", "050888892");
    directory.add("Dobriy", "050888891");
    directory.add("Dobriy", "050888890");

    System.out.println(directory.get("Volkova"));
    System.out.println(directory.get("Andreyev"));
    System.out.println(directory.get("Petrova"));
    System.out.println(directory.get("Dobriy"));
}
}

