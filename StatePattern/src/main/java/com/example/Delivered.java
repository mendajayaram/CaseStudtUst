package com.example;

public class Delivered implements PackageState 
{
    //Singleton
    private static Delivered Deliveredinstance = new Delivered();
 
    private Delivered() {}
 
    public static Delivered Deliveredinstance() {
        return Deliveredinstance;
    }
     
 
    public void updateState(DeliveryContext ctx) 
    {
        System.out.println("Package is delivered!!");
    }
}