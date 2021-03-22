package com.shopping;

import java.util.Random;

public class FlipCart{
private Courier courier;



public void setCourier(Courier courier) {
	this.courier = courier;
}


public String shopping(String str)
{
	Random r=new Random();
	
	  int order_id = r.nextInt(1000);
	  
	  String msg=courier.deliver_id(order_id);
	  
	  return msg;
}

	}


