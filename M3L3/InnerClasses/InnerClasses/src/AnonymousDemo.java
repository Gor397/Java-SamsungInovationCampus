interface Eatable{
    void eat();
}

class MyEatable implements Eatable {
    @Override
    public void eat() {
        System.out.println("Nice fruits");
    }
}

class AnonymousDemo{
    public static void main(String[] args){
        Eatable e = new Eatable() {
            public void eat(){System.out.println("nice fruits");}
        };
        e.eat();
    }
}
