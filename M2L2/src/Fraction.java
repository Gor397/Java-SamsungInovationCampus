public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        assert denominator != 0;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static void main(String[] args) {
        Fraction f = new Fraction(2, 0);
        System.out.println(
            "numerator " + f.numerator +
            " / denominator " + f.denominator
        );
    }
}
