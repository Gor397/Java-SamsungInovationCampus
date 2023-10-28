import java.util.Scanner;

class Animal {
    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    private int weigth;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int height;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int speed;
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
//        String[] str = Integer.toString(x).split("");
//
//        for (int i = 0; i < str.length; i++) {
//            for (int k = 0; k < str.length; k++){
//                if (str[i].equals(str[k]) && k != i) {
//                    System.out.println("yes");
//                    return;
//                }
//            }
//        }
//        System.out.println("no");

        int mask1 = 0;
        int mask2 = 0;
        do {
            mask1 = mask2;
            mask2 = mask1 | 1<<(value%10);
            value /= 10;
        } while (value > 0 && mask2 != mask1);
        System.out.println(mask2 == mask1);
    }
}