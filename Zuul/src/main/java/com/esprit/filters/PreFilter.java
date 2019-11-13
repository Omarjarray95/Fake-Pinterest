package com.esprit.filters;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class PreFilter extends ZuulFilter 
{
	@Override
	public boolean shouldFilter() 
	{
		return true;
	}

	@Override
	public String filterType() 
	{
		return "Pre";
	}

	@Override
	public int filterOrder() 
	{
		return 1;
	}
	
	
	@Override
	public Object run()
	{
		RequestContext RC = RequestContext.getCurrentContext();
		HttpServletRequest HSR = RC.getRequest();
		
		System.out.println("Request Method : " + HSR.getMethod());
		System.out.println("Request URL : " + HSR.getRequestURL().toString());
		
		return null;
	}
}
