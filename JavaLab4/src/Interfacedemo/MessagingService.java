package Interfacedemo;

public class MessagingService 
{
   public static void main(String[] args) 
   {
        Messaging sms = new SMS();
        sms.printConnection();
        sms.print();

        System.out.println(); // Blank line

        Messaging email = new Email();
        email.printConnection();
        email.print();
    }

}
