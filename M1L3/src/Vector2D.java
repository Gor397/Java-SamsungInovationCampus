import java.util.Locale;
import java.util.Vector;

public class Vector2D {
    public double vX, vY;
    public Vector2D() {
        vX = vY = 1;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
    }

    public Vector2D(Vector2D vector2d) {
        this.vX = vector2d.vX;
        this.vY = vector2d.vY;
    }

    public void print() {
        System.out.println(String.format(Locale.US, "(%.2f, %.2f)", vX, vY));
    }

    public double length() {
        double length = Math.sqrt(vX*vX + vY*vY);
        return length;
    }

    public void add(Vector2D vector) {
        this.vX += vector.vX;
        this.vY += vector.vY;
    }

    public void sub(Vector2D vector) {
        this.vX -= vector.vX;
        this.vY -= vector.vY;
    }

    public void scale(double scaleFactor) {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }
}
