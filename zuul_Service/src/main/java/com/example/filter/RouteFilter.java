package com.example.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class RouteFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		System.out.println("we are using route filter");
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "Route";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
