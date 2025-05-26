package Interfacedemo;

import java.util.Scanner;

public class SMS implements Messaging
{
   public String getMessage() 
   {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter SMS message: ");
        return scanner.nextLine();
    }
public String getRecipient() 
   {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter mobile number: ");
        String number = scanner.nextLine();

        if (number.matches("\\d{10}")) 
        {
            return number;
        } 
        else 
        {
            return "Invalid mobile number";
        }
   }
public void print() 
   {
        String message = getMessage();
        String recipient = getRecipient();
        System.out.println("SMS to " + recipient + ": " + message);
   }
}
    