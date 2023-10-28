public class Shape {

    public void color() {
        System.out.println("Shape color");
    }

    public static void main(String[] args) {
        Shape []shapes = new Shape[4];
        shapes[0] = new Triangle();
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();
        shapes[3] = new Shape();
        for (Shape shape : shapes) {
            shape.color();
        }
    }

}

class Triangle extends Shape {

    @Override //ignore this
    public void color() {
        System.out.println("Triangle color");
    }
}

class Circle extends Shape {

    @Override
    public void color() {
        System.out.println("Circle color");
    }
}

class Rectangle extends Shape {

    @Override
    public void color() {
        System.out.println("Rectangle color");
    }
}

