package com.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MavenSonar {

	private static Logger logger = LogManager.getLogger(MavenSonar.class);

		    public static void main( String[] args )
		    {
		        
		        
		        logger.info("This is info");
		        logger.error("This is error");
		        logger.warn("This is Warning");
		    }
		}
