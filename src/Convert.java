public class Convert {

    public double convertLength(double length, String unit) {
        if(unit.equalsIgnoreCase("centimeters")){
            return (length * 2.4);
        }else{
            return (length / 2.4);
        }
    }

    public double convertVolume (double amount, String unit) {

        if(unit.equalsIgnoreCase("ounces")) {
            return (amount * 29.57);
        } else {
            return (amount / 29.57);
        }
    }

    public double convertTemp (double amount, String unit) {

        if(unit.equalsIgnoreCase("Celsius")) {
            return (amount * 1.8 + 32);
        } else if(unit.equalsIgnoreCase("Fahrenheit")) {
            return ((amount - 32) / 1.8);
        } else {
            return 0.0;
        }
    }
}
