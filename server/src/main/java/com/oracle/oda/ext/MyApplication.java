/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with Hysun He. This information 
 * shall not be distributed or copied without written permission from 
 * Hysun He.
 *
 ***************************************************************************/

package com.oracle.oda.ext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***************************************************************************
 * <PRE>
 *  Project Name    : bot-gateway-springboot
 * 
 *  Package Name    : com.oracle.oda.ext
 * 
 *  File Name       : Application.java
 * 
 *  Creation Date   : 2019年2月21日
 * 
 *  Author          : hysun
 * 
 *  Purpose         : TODO
 * 
 * 
 *  History         : TODO
 * 
 * </PRE>
 ***************************************************************************/
// equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan.
@SpringBootApplication
public class MyApplication{

	private static final Logger LOGGER = LoggerFactory.getLogger(MyApplication.class);

	public static void main(String[] args) {
		LOGGER.info("*********** Start Application ***********");
		SpringApplication.run(MyApplication.class, args);
	}
}
