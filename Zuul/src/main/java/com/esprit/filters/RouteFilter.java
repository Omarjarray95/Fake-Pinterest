package com.esprit.filters;

import com.netflix.zuul.ZuulFilter;

public class RouteFilter extends ZuulFilter
{
	@Override
	public boolean shouldFilter() 
	{
		return true;
	}

	@Override
	public String filterType() 
	{
		return "Route";
	}

	@Override
	public int filterOrder() 
	{
		return 1;
	}
	
	
	@Override
	public Object run()
	{
		System.out.println("Inside Route Filter !");
		
		return null;
	}
}
