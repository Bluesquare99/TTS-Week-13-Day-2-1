import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertTest {

    @Test
    public void convertLength() {
        //Create an instance of Conversion, as the method is non static
        Convert testing = new Convert();

        //Set our parameters up
        double length = 240;
        String unit = "inches";
        //Save the result of the method to a variable named result
        double result = testing.convertLength(length, unit);
        //Check to see if the answer is what we expected
        assertEquals(100.0, result, 0.0);
    }

    @Test
    public void convertVolume() {
        //Create an instance of Conversion, as the method is non static
        Convert testing = new Convert();

        //Set our parameters up
        double amount = 24;
        String unit = "ounces";
        //Save the result of the method to a variable named result
        double result = testing.convertVolume(amount, unit);
        //Check to see if the answer is what we expected
        assertEquals(709, result, 5.0);
    }

    @Test
    public void convertTemperature() {
        Convert testing = new Convert();

        double amount = 5;
        String unit = "Celsius";
        double result = testing.convertTemp(amount, unit);
        assertEquals(41, result, 0.0);
    }
}