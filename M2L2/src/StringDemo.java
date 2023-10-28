public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Dilijan in my mind"; // immutable
        String s2 = new String("Dilijan in my mind"); //redundant code
        System.out.println(s1 == s2); //reference comparison
        System.out.println(s1.equals(s2));
        System.out.println("String length: " + s1.length()); // + used for concatenation
        System.out.println("Character at index 5: " + s1.charAt(5));
        System.out.println("Comparing 2 strings: " + s1.compareTo(s2));
    }
}
