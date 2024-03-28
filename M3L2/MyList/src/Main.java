import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<String> myList = new CircularLinkedList<>();

        System.out.println("At Start : ");
        myList.displayList();
        System.out.println();

        myList.addToLast("A");
        myList.addToLast("B");
        myList.addToLast("C");
        myList.addToLast("D");
        System.out.println("After adding A and B and C and D : ");
        myList.displayList();
        System.out.println();

        myList.removeFromFirst();
        System.out.println("After removing first : ");
        myList.displayList();
        System.out.println();


        System.out.println("================================================");
        CircularLinkedListIt<Integer> circularLinkedListIt = new CircularLinkedListIt<>();
        circularLinkedListIt.addToLast(1);
        circularLinkedListIt.addToLast(2);
        circularLinkedListIt.addToLast(3);
        circularLinkedListIt.addToLast(4);

        for (Integer item : circularLinkedListIt) {
            System.out.print(item + " ");
        }

        System.out.println();
        System.out.println("======================================================");
        System.out.println();

        ArrayList<String> langs = new ArrayList<>();
        langs.add("AM");
        langs.add("EN");
        langs.add("RU");
        System.out.println(langs.get(2));
    }
}