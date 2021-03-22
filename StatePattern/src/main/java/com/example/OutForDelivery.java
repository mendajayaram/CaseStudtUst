package com.example;

public class OutForDelivery implements PackageState 
{
    //Singleton
    private static OutForDelivery instance = new OutForDelivery();
 
    private OutForDelivery() {}
 
    public static OutForDelivery instance() {
        return instance;
    }
     

    public void updateState(DeliveryContext ctx) 
    {
        System.out.println("Package is out of delivery !!");
        ctx.setCurrentState(Delivered.Deliveredinstance());
    }
}