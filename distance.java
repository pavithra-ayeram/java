package distanceconverter;
import java.util.*;

// Class to convert distances
public class distance{
    double kilometer;
    double meter;
    double miles;

    Scanner scanner = new Scanner(System.in);

    // Method to convert kilometer to meter
    public void km_to_m(){
        System.out.println("Enter the distance in Kilo Meters: ");
        kilometer = scanner.nextInt();
        meter = kilometer*1000;
        System.out.println("Kilo Meter = "+kilometer+"\nMeter = "+meter);
    }

    // Method to convert kilometer to miles
    public void km_to_miles(){
        System.out.println("Enter the distance in Kilo Meters: ");
        kilometer = scanner.nextInt();
        miles = kilometer*0.6213;
        System.out.println("Kilo Meter = "+kilometer+"\nMiles = "+miles);
    }

    // Method to convert miles to kilometer
    
    public void miles_to_km(){
        System.out.println("Enter the distance in Miles: ");
        miles = scanner.nextInt();
        kilometer = miles/0.6213;
        System.out.println("Miles = "+miles+"\nKilo Meter = "+kilometer);
    }

    //Method to convert meter to kilometer
    public void meter_to_km(){
        System.out.println("Enter the distance in Meter: ");
        meter = scanner.nextInt();
        kilometer = meter/1000;
        System.out.println("Meters = "+meter+"\nKilo Meter = "+kilometer);
    }
}