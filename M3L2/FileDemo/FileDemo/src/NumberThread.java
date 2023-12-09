public class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        NumberThread thread = new NumberThread();
        thread.start();
    }
}