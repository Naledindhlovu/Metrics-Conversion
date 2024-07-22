package intotojava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class IntoToJava {
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        String status  = "Y";
        
        JOptionPane.showMessageDialog(null, "Welcome Naledi");
        
        while(status.equals("Y"))
        {
            System.out.print("A unit you want to convert from (Feet/Pounds/Fahrenheit):");
            String convertFrom = keyboard.nextLine();

            System.out.print("A unit you want to convert to (Meters/Kgs/Celsius):");
            String convertTo = keyboard.nextLine();

            System.out.print("Quantity to be convert :");
            Double quantity = keyboard.nextDouble();
            keyboard.nextLine();
            if(convertFrom.equalsIgnoreCase("Feet"))
            {
                double x = FeettoMeters(quantity);
                String feet = "Feet";
                String meters = "Meters";
                Display(x,feet,meters);
            }
            else if(convertFrom.equalsIgnoreCase("Pounds"))
            {
                double x = PoundstoKgs(quantity);
                String Pounds = "Pounds";
                String Kgs = "Kgs";
                Display(x, Pounds, Kgs);
            }
            else if(convertFrom.equalsIgnoreCase("Fahrenheit"))
            {
                double x = FahrenheittoCelsius(quantity);
                 String Fahrenheit = "Fahrenheit";
                String Celsius = "Celsius";
                Display(x, Fahrenheit, Celsius);
            }
            else
            {
                System.out.println("\n========================================");
                System.out.println("Invalid input");
                System.out.println("==========================================");
            }
            System.out.print("Do you still want to continue ? [Y/N]:");
            status = keyboard.nextLine().toUpperCase();
        }
        
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>THANK YOU<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        
    }
    public static double FeettoMeters(double quantity)
    {
        return quantity*0.305;
    }
    public static double PoundstoKgs(double quantity)
    {
        return quantity*0.454;
    }
    public static double FahrenheittoCelsius(double quantity)
    {
        return (quantity-32)/1.8;
    }
    public static void Display(double quantity,String value1, String value2)
    {
        System.out.println("\n=============================================================");
        System.out.println("Convertins from :"+value1);
        System.out.println("Convertion to :"+value2);
        System.out.println("Answer :"+quantity);
        System.out.println("=============================================================");
    }
    
}
