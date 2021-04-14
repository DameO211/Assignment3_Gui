public class TemperatureConverter extends Converter {
    public TemperatureConverter() {

    }

    public TemperatureConverter(double input) {
        super(input);
    }

    @Override
    public double convert(double input) {
        double f = this.getInput();

        double c;

        c = ((f-32)*5.0)/9.0;
        return super.convert(input);
    }
}


/*
*
* TemperatureConverter class which is a child of Converter and includes:
 Constructors which call parent constructors
 Overridden convert() method to convert input (Fahrenheit temperature) to
Celsius and returns the value. If the instance has no input value, it should
return Double.NaN
 Use the following formula for conversion: C = ((F-32)*5)/9
*
*
*
*
* */