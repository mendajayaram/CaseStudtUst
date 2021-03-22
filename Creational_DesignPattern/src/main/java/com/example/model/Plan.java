package com.example.model;

public abstract class Plan 
{
double rate;

public abstract void getRate();

public  void calculate(int units)
{
	System.out.println("rate==="+this.rate);
	System.out.println("unit==="+units);
	System.out.println("calc==="+units*this.rate);
}
}
