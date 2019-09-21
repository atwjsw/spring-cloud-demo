package org.atwjsw.rest.webservices.restfulwebservices.helloworld;

import lombok.Data;

@Data
public class HelloWorldBean {

	private String message;

	public HelloWorldBean(final String message) {
		this.message = message;
	}

}
