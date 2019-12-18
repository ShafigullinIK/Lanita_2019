package dec_18;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        exHashMap();
    }

    public static void exHashMap(){
        HashMap<String, Integer> words = new HashMap<>();
        words.put("Тушенка", 25);
        words.put("Гречка", 40);
        words.put("Яблоки", 80);
        words.put("Тушенка", 20);
        words.remove("Яблоки");
        System.out.println(words.get("Мандарины"));
        System.out.println(words.getOrDefault("Мандарины", -1));
        Iterator<String> it = words.keySet().iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.println(key + ": " + words.get(key));
        }
        for (String key: words.keySet()){
            System.out.println(key + "| " + words.get(key));
        }
        for (Integer i : words.values()) {
            System.out.println(i);
        }
        for (String s : words.keySet()){
            System.out.println(s);
        }
    }

    public static void exHashSet(){
        HashSet<String> strings = new HashSet<>();
        System.out.println(strings.add("Hello"));
        System.out.println(strings.add("Hello1"));
        System.out.println(strings.add("Hello2"));
        System.out.println(strings.add("Hello3"));
        System.out.println(strings.add("Hello4"));
        Iterator<String> it = strings.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        for (String s: strings) {
            System.out.println(s);
        }
    }

    public static void exArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(1, 10);
        list.add(3);
        list.add(7);
        list.remove(new Integer(7));
        list.remove(7);
        System.out.println();
        System.out.println("3 = " + list.indexOf(35));
        for(Integer i: list){
            System.out.println(i);
        }
    }

}
