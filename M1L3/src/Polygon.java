public class Polygon {
    float[] x, y;
    public Polygon(float[] x, float[] y) {
        System.out.println();
    }

    public Polygon(Polygon polygon) {
        this(polygon.x, polygon.y);
    }

    public void draw() {/*...*/}
    public void rotate(float deg) {/*...*/}
}
