import java.util.Objects;

public class ComplexCalculator {
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        System.out.println("Performing addition: " + a + " + " + b);
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        System.out.println("Performing multiplication: " + a + " * " + b);
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        System.out.println("Performing division: " + a + " / " + b);
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        return new ComplexNumber(real, imaginary);
    }
}