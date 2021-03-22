package com.example;

public class Acknowledged implements PackageState 
{
    //Singleton
    private static Acknowledged instance = new Acknowledged();
 
    private Acknowledged() {}
 
    public static Acknowledged instance() {
        return instance;
    }
     
    //Business logic and state transition
    public void updateState(DeliveryContext ctx) 
    {
        System.out.println("Package is acknowledged !!");
        ctx.setCurrentState(Shipped.instance());
    }
}
