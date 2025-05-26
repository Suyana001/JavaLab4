package Interfacedemo;

interface Messaging {

   
    public String getMessage();

    public void print();

    public String getRecipient();

 
    default void printConnection() {
        System.out.println("Connection is successful");
    }
}
