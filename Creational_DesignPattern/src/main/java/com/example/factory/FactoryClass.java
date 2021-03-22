package com.example.factory;

import com.example.model.CommercialPlan;
import com.example.model.DomesticPlan;
import com.example.model.InstituionalPlan;
import com.example.model.Plan;

public class FactoryClass 
{

	public Plan getPlan(String plan_type)
	{
	if(plan_type==null)
	{
	return null;	
	}
	else if(plan_type.equalsIgnoreCase("DomesticPlan"))
	{
		return new DomesticPlan();
	}
	else if(plan_type.equalsIgnoreCase("CommercialPlan"))
	{
		return new CommercialPlan();
	}
	else if(plan_type.equalsIgnoreCase("InstituionalPlan"))
	{
		return new InstituionalPlan();
	}
	
	else
	{
		return null;	
	}

}
}
