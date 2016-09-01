package com.soaptest;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.soaptest.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}