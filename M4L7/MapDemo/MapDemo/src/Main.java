import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 30);
        map.put("Albert", 73);
        map.put("Tesla", 84);
        System.out.println("Map: " + map);
        int age = map.get("Albert");
        System.out.println("Albert's age: " + age);
        boolean cont = map.containsKey("abo");
        System.out.println("Contain's key(abo): " + cont);
        boolean contVal = map.containsValue(84);
        System.out.println("Contain's value(84): " + contVal);
        System.out.println();
        System.out.println("Iterating through key-value pairs: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Iterating through values:");
        for (Integer value : map.values()) {
            System.out.println(getKeyByValue(map, value));
        }

        System.out.println("Iterating through keys:");
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println();
        map.remove("John");
        System.out.println("Map after removing John : " + map);
        int size = map.size();
        System.out.println("Map size : " + size);
        map.clear();
        System.out.println("Map after clearing : " + map);
    }

    private static <K, V> K getKeyByValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
