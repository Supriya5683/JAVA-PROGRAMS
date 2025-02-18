class Complex {
    double real, imag;

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }

    public static void main(String[] args) {
        Complex num1 = new Complex(3.5, 2.5);
        Complex num2 = new Complex(1.5, 4.5);
        Complex sum = num1.add(num2);
        sum.display();
    }
}
