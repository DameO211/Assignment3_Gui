import java.util.Scanner;

public class Converter {
    Scanner scan = new Scanner(System.in);
    private double input = scan.nextDouble();


    public Converter() {
        input = Double.NaN;
    }

    public Converter(double input) {
        this.input = input;
    }

    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }

    public double convert(double input){
        return input;
    }
}


/*
*
* Converter class which includes:
 Private attribute for input of data type double
 Default constructor with no parameter which sets input to Double.NaN
 Overloaded constructor with input for parameter
 Get and set methods for input attribute
 Method convert() which returns input value

*
*
*
* */