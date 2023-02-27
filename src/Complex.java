public class Complex {

    private final double re;
    private final double im;


    public Complex(double real, double image) {
        re = real;
        im = image;
    }

    @Override
    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im < 0) return re + "-" + (-im) + "i";
        return re + "+" + im + "i";
    }

    public double abs() {
        return Math.hypot(re, im);
    }

    public Complex plus(Complex target) {
        return new Complex(this.re + target.re, this.im + target.im);
    }

    public Complex minus(Complex target) {
        return new Complex(this.re - target.re, this.im - target.im);
    }

    public Complex scale(double target) {
        return new Complex(re * target, im * target);
    }

    public Complex product(Complex target) {
        double real = this.re * target.re - this.im * target.im;
        double image = this.re * target.im + this.im * target.re;
        return new Complex(real, image);
    }

    public Complex conjugate() {
        return new Complex(this.re, -this.im);
    }

    public Complex divide(Complex target) {
        return this.product(target.conjugate()).scale(1 / target.abs() * target.abs());
    }
}
