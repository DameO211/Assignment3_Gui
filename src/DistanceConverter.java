public class DistanceConverter extends Converter {
    public DistanceConverter() {
    }

    public DistanceConverter(double input) {
        super(input);
    }

    @Override
    public double convert(double input) {
        double M = this.getInput();
        double KM;
        KM = M * 1.609;
        return super.convert(input);
    }


}


/*
*KM = M * 1.609
* DistanceConverter class which is a child of Converter and includes:
 Constructors which call parent constructors
 Overridden convert() method to convert input (distance in miles) to distance
in kilometers and returns the value. If the instance has no input value, it
should return Double.NaN
*
*
*
* */