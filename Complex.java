/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

/**
 *
 * @author kk892515
 */
/**
 *
 * Complex number class
 *
 * @author (c) KexinKang, Ohio University EECS, 2017
 */
public class Complex {

    private final double real;
    private final double imag;

    // full service c-tor
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex(double real) {
        this.real = real;
        this.imag = 0;
    }

    // specialilzed to string method. Ordered pair style output
    public String toStringOP() {
        return "(" + real + ", " + imag + ")";
    }

    public String toStringI() {
        if (imag > 0) {
            return real + "+" + imag + "i";
        } else {
            return real + "" + imag + "i";
        }
    }

    // use toStringOP for default toString method.
    @Override
    public String toString() {
        return toStringOP();
    }

    // a.plus(b) returns complex number equal to a + b.
    public Complex plus(Complex rhs) {
        return new Complex(real + rhs.real, imag + rhs.imag);
    }

    public Complex mult(Complex rhs) {
        return new Complex((real * rhs.real - imag * rhs.imag), (real * rhs.imag + imag * rhs.real));
    }

    // use main method to test each method in class.
    public static void main(String[] args) {
        System.out.println("Kexin Kang");
        System.out.println("10/18/2017");

        Complex aa = new Complex(3, 4);
        Complex bb = new Complex(4, -5);
        // test full service c-tor and toStringOP
        System.out.println(aa.toStringI());
        System.out.println(bb.toStringI());
        System.out.println(aa + aa.toStringI());
        System.out.println(aa + aa.toStringOP());
        //System.out.println(aa+aa);
        System.out.println(aa + "+" + bb + "=" + aa.plus(bb));
        System.out.println(aa + "*" + bb + "=" + aa.mult(bb));

    }
}
