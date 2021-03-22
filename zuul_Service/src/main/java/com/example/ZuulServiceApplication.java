package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.filter.ErrorFilter;
import com.example.filter.PostFilter;
import com.example.filter.PreFilter;
import com.example.filter.RouteFilter;

@SpringBootApplication
//@EnableEurekaClient
@EnableZuulProxy
public class ZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServiceApplication.class, args);
		System.out.println("this is zuullllll");
	}
	
	@Bean
	
	public PreFilter prefilter()
	{
		System.out.println("pre filter");
		return new PreFilter();
	}
@Bean
	
	public ErrorFilter errorfilter()
	{
		System.out.println("error filter");
		return new ErrorFilter();
	}
@Bean

public PostFilter postfilter()
{
	System.out.println("post filter");
	return new PostFilter();
}
@Bean

public RouteFilter routefilter()
{
	System.out.println("route filter");
	return new RouteFilter();
}

}
