package com.mb.code;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class HelloWorld {

	static Logger logger = Logger.getLogger(HelloWorld.class);
	
	public static void main(String[] args) {
		 BasicConfigurator.configure();
	     logger.info("Hello World");     
	}

}
