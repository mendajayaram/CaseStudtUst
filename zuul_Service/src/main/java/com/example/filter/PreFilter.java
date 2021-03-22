package com.example.filter;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PreFilter extends ZuulFilter
{

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		
		RequestContext ctx=RequestContext.getCurrentContext();
		HttpServletRequest req=ctx.getRequest();
		System.out.println("Request Method=="+req.getMethod()+"Request Url==="+req.getRequestURI().toString());
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "Pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
