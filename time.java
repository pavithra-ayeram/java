package timeconverter;
import java.util.*;

// Class to convert time
public class time{
    double hour;
    double minute;
    double second;

    Scanner scanner = new Scanner(System.in);

    // Method to convert hour to minutes
    public void hour_to_min(){
        System.out.println("Enter the time in hours: ");
        hour = scanner.nextInt();
        minute = hour*60;
        System.out.println("Hour = "+hour+"\nMinutes = "+minute);
    }

    // Method to convert hour to minutes
    public void hour_to_second(){
        System.out.println("Enter the time in hours: ");
        hour = scanner.nextInt();
        second = hour*3600;
        System.out.println("Hour = "+hour+"\nSeconds = "+second);
    }

    // Method to convert hour to minutes
    public void min_to_hour(){
        System.out.println("Enter the time in minutes: ");
        minute = scanner.nextInt();
        hour = minute/60;
        System.out.println("Minutes = "+minute+"\nHours = "+hour);
    }

    // Method to convert hour to minutes
    public void sec_to_hour(){
        System.out.println("Enter the time in seconds: ");
        second = scanner.nextInt();
        hour = second/3600;
        System.out.println("Seconds = "+second+"\nHours = "+hour);
    }
}