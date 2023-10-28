public class Child extends Parent {
    @Override
    public void method(int argument) {
        System.out.println("Child overrides the method: " + argument);
    }

    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();
        obj1.method(1);
        obj2.method(2); //polymorphism
    }
}