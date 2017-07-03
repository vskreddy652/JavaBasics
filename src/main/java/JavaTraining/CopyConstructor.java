package JavaTraining;

class Complex {
 
    private double re, im;
     
    // A normal parametrized constructor 
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
        System.out.println("Complex(double re, double im) called");
    }
     
    // copy constructor
    Complex(Complex c) {
        System.out.println("Copy constructor called");
        re = c.re;
        im = c.im;
    }
      
    // Overriding the toString of Object class
    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}
 
public class CopyConstructor {
 
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);
         
        // Following involves a copy constructor call
        Complex c2 = new Complex(c1);   
 
        // Note that following doesn't invoke a copy constructor call as 
        // non-primitive variables are just references.
        Complex c3 = c2;   
 
        System.out.println(c2); // toString() of c2 is called here
    }
}