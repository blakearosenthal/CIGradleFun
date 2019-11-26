public class Fraction {
    int numerator;
    int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator cannot be zero");
            this.numerator = 0;
            this.denominator = 1;
        } else if (numerator < 0 && denominator < 0) {
            this.numerator = -1 * numerator;
            this.denominator = -1 * denominator;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public double getRealValue() {
        return 0.0 + (numerator / denominator);
    }

    public Fraction reduce(int num1, int num2) {
        int num1Copy = num1;
        int num2Copy = num2;
        int remainder = 0;
        while (num2 != 0) {
            remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return new Fraction(num1Copy / num1, num2Copy / num1);
    }

    public Fraction add(Fraction that) {
        int sumN = this.denominator * that.numerator + this.numerator * that.denominator;
        int sumD = this.denominator * that.denominator;
        return reduce(sumN, sumD);
    }

    public boolean equals(Fraction that) {
        return reduce(this.numerator, this.denominator) == reduce(that.numerator, that.denominator);
    }

//    public int compareTo(Fraction fraction) {
//        return 0;
//    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
