package com.esprit.filters;

import com.netflix.zuul.ZuulFilter;

public class PostFilter extends ZuulFilter
{
	@Override
	public boolean shouldFilter() 
	{
		return true;
	}

	@Override
	public String filterType() 
	{
		return "POST";
	}

	@Override
	public int filterOrder() 
	{
		return 1;
	}
	
	
	@Override
	public Object run() 
	{
		System.out.println("Inside Response Filter !");
		
		return null;
	}
}
