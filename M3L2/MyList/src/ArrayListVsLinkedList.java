import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        long startTime, finishTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
//            arrayList.add(0, "test");
//            arrayList.add(arrayList.size()/2, "text");
            arrayList.size();
        }

        finishTime = System.nanoTime();
        System.out.println("Time: " + String.format("%,d", (finishTime - startTime) / 1000) + " microseconds");

        System.out.println();

        LinkedList<String> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
//            linkedList.add(0, "test");
//            linkedList.add(linkedList.size()/2, "text");
            linkedList.size();
        }
        finishTime = System.nanoTime();
        System.out.println("Time: " + String.format("%,d", (finishTime - startTime) / 1000) + " microseconds");
    }
}
