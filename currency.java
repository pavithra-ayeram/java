package currencyconverter;
import java.util.*;

// Class to convert currencies
public class currency{
    double inr;
    double usd;
    double euro;
    double yen;

    Scanner scanner = new Scanner(System.in);

    // Method to convert inr to euro
    public void inr_to_euro(){
        System.out.println("Enter the currency in Rupees: ");
        inr = scanner.nextInt();
        euro = inr*0.0110;
        System.out.println("Inr = "+inr+"\nEuro = "+euro);
    }
    
    // Method to convert inr to usd
    public void inr_to_usd(){
        System.out.println("Enter the currency in Rupees: ");
        inr = scanner.nextInt();
        usd = inr*0.0119;
        System.out.println("Inr = "+inr+"\nDollar = "+usd);
    }
    
    // Method to convert inr to yen
    public void inr_to_yen(){
        System.out.println("Enter the currency in Rupees: ");
        inr = scanner.nextInt();
        yen = inr*1.8493;
        System.out.println("Inr = "+inr+"\nYen = "+yen);
    }

    // Method to convert euro to inr
    public void euro_to_inr(){
        System.out.println("Enter the currency in Euro: ");
        euro = scanner.nextInt();
        inr = euro/0.0110;
        System.out.println("Euro = "+euro+"\nInr = "+inr);
    }

    //Method to convert usd to inr
    public void usd_to_inr(){
        System.out.println("Enter the currency in Dollars: ");
        usd = scanner.nextInt();
        inr = usd/0.0119;
        System.out.println("Dollars = "+usd+"\nInr = "+inr);
    }

    // Method to convert yen to inr
    public void yen_to_inr(){
        System.out.println("Enter the currency in Yen: ");
        yen = scanner.nextInt();
        inr = yen/1.8493;
        System.out.println("Yen = "+yen+"\nInr = "+inr);
    }
}