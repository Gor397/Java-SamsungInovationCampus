package packageB;

import packageA.A;

public class B extends A {

    static final int iKarenAge = 14;

    public static void main(String[] args) {
        B b = new B();
        b.a = 5;
//        b.iKarenAge = 14;

        System.out.println("Karen age is " + b.iKarenAge);

        B b2 = new B();
//        b2.iKarenAge++;
        System.out.println("Karen age is " + b2.iKarenAge);

        B b3 = new B();
        System.out.println("Karen age is " + b3.iKarenAge + " " + java.lang.Math.PI);

    }
}
