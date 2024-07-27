import java.util.*;
import currencyconverter.currency;
import distanceconverter.distance;
import timeconverter.time;


public class converter{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        int ch, choice;

        currency c = new currency();
        distance d = new distance();
        time t = new time();

        do{
            System.out.println("\nMENU: \n1. Currency Converter\n2. Distance Converter\n3. Time Converter\n4. Exit\nEnter your choice: ");
            ch = scanner.nextInt();
            switch(ch){
                case 1:
                    do{
                        System.out.println("\nMENU: \n1. INR to USD\n2. INR to Euro\n3. INR to Yen\n4. USD to INR\n5. Euro to INR\n6. Yen to INR\n7. Exit\nEnter your choice: ");
                        choice = scanner.nextInt();
                        switch(choice){
                            case 1:
                                c.inr_to_usd();
                                break;
                            
                            case 2:
                                c.inr_to_euro();
                                break;
                            
                            case 3:
                                c.inr_to_yen();
                                break;
                            
                            case 4:
                                c.usd_to_inr();
                                break;
                            
                            case 5:
                                c.euro_to_inr();
                                break;
                            
                            case 6:
                                c.yen_to_inr();
                                break;

                            case 7:
                                System.out.println("Exiting...");
                                break;
                            
                            default:
                                System.out.println("Enter valid choice!");
                                break;
                            
                        }
                    }while(choice!=7);
                    break;
                
                case 2:
                    do{
                        System.out.println("\nMENU: \n1. Kilometer to Meter\n2. Kilometer to Miles\n3. Meter to Kilometer\n4. Miles to Kilometer\n5. Exit\nEnter your choice: ");
                        choice = scanner.nextInt();
                        switch(choice){
                            case 1:
                                d.km_to_m();
                                break;
                             
                            case 2:
                                d.km_to_miles();
                                break;
                            
                            case 3:
                                d.meter_to_km();
                                break;
                               
                            case 4:
                                d.miles_to_km();
                                break;

                            case 5:
                                System.out.println("Exiting...");
                                break;
                                
                            default:
                                System.out.println("Enter valid choice!");
                                break;
                                
                        }
                    }while(choice!=5);
                    break;
                    
                case 3:
                    do{
                        System.out.println("\nMENU: \n1. Hours to minutes\n2. Hours to seconds\n3. Minutes to Hours\n4. Seconds to hours\n5. Exit\nEnter your choice: ");
                        choice = scanner.nextInt();
                        switch(choice){
                            case 1:
                                t.hour_to_min();
                                break;
                              
                            case 2:
                                t.hour_to_second();
                                break;
                                
                            case 3:
                                t.min_to_hour();
                                break;
                             
                            case 4:
                                t.sec_to_hour();
                                break;

                            case 5:
                                System.out.println("Exiting...");
                                break;
                                
                            default:
                                System.out.println("Enter valid choice!");
                                break;
                        }                                
                    }while(choice!=5);
                    break;
                    
                case 4:
                    System.out.println("Exiting...");
                    break;
                
                default:
                    System.out.println("Enter a Valid Choice: ");
                    break;
            }
        }while(ch!=4);

        scanner.close();
    }
}