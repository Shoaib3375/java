package com.example.helloworld.ObjectAndClass;

public class ComplexNumber {
    private final double re; // the real part
    private final double im; // the imaginary parts

    public ComplexNumber(double re, double im){
        this.re = re;
        this.im = im;
    }
    public ComplexNumber plus(ComplexNumber b){
        double real = this.re + b.re;
        double imag = this.im + b.im;

        return new ComplexNumber(real, imag);
    }

    public ComplexNumber minus(ComplexNumber b){
        double real = this.re - b.re;
        double imag = this.im - b.im;
        return new ComplexNumber(real, imag);
    }

    public String toString(){
        if (im == 0) {
            return re + "";
        }
        if (re == 0){
            return im + "i";
        }
        if (!(im < 0)){
            return re + " + " + im + "i";
        }
        return re + " - " + (-im) + "i";
    }
}
