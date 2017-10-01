package com.log4jtesting;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class test {
	

public static void main(String args[]){
	Logger logger1 = LogManager.getLogger("logger1");
	Logger logger2 = LogManager.getLogger("logger2");
	Logger logger3 = LogManager.getLogger("logger3");
	FileAppender appender = new FileAppender();
	appender.setFile("abc.txt");
	appender.setLayout(new SimpleLayout());
	
	logger1.addAppender(appender);
	appender.activateOptions();
		BasicConfigurator.configure();
		logger1.info("first logger");
		logger2.info("Second logger");
		logger3.info("third logger");
		Logger rootlog = LogManager.getRootLogger();
			
		Logger root1 = Logger.getRootLogger();
		
		if(root1.equals(rootlog)){
			root1.info("same");
		}
		else root1.info("different");

}
}
