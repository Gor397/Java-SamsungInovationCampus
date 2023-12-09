public class BruteForce {
    public static void main(String[] args) {
        String password = "1234"; // The password we want to find

        // Loop through all possible combinations of 4-digit numbers
        for (int i = 0; i <= 9999; i++) {
            String attempt = String.format("%04d", i); // Pad the number with leading zeros

            if (attempt.equals(password)) {
                System.out.println("Password found: " + attempt);
                break;
            }
        }
    }
}
