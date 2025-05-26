package Interfacedemo;

import java.util.Scanner;
public class Email implements Messaging 
{
   public String getMessage() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Email message: ");
        return scanner.nextLine();
    }
    public String getRecipient() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email address: ");
        return scanner.nextLine();
    }
    public void print() {
        String message = getMessage();
        String recipient = getRecipient();
        System.out.println("Email to " + recipient + ": " + message);
    }
}