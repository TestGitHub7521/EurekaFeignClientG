package com.fedex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableFeignClients
public class EurekaFeignClientGApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignClientGApplication.class, args);
	}
	
	
	@Autowired
	private RemoteCallService remoteCallService;
	
	@RequestMapping("/hii")
	  public String hello() {
		try{
			String hello = remoteCallService.sayHello();
			System.out.println(hello);
			return hello;
		}
	    catch (Exception e){
	    	
	    }
		return null;
	  }
	
	
	
	}
