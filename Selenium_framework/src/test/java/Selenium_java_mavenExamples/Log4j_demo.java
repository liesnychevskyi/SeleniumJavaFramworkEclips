package Selenium_java_mavenExamples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j_demo
{
	private static Logger logger = LogManager.getLogger(Log4j_demo.class);

	public static void main(String[] args)
	{
		System.out.println(" \n Hello World....!!!!   \n");
		logger.trace("This is trace level");
		logger.info("This is information message");
		logger.error("This is an error message");
		logger.warn("This is an warning message");
		logger.fatal("This is an fatal message");
		System.out.println("Test complete");

	}

}

// https://springframework.guru/log4j-2-configuration-using-properties-file/ -- property file
// https://howtodoinjava.com/log4j2/log4j-2-xml-configuration-example/  -- xml example
// https://stackoverflow.com/questions/22485074/log4j-2-doesnt-support-log4j-properties-file-anymore -- article useful









