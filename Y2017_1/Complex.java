
package Y2017_1;

public class Complex {
    protected double real;
    protected double imag;

    public Complex() {
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex addComplexNum(Complex b){
        Complex c = new Complex();
        c.real = b.real + real;
        c.imag = b.imag + imag;
        return c;
    }
    public Complex subtractComplexNum(Complex b){
        Complex c = new Complex();
        c.real = real - b.real;
        c.imag = imag - b.imag;
        return c;
    }
    @Override
    public String toString(){
        return "(" + (int) real + " + " + (int) imag + "i)";
    }
}
