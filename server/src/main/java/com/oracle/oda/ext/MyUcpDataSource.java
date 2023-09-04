/***************************************************************************
 *
 * This document contains confidential and proprietary information 
 * subject to non-disclosure agreements with Hysun He. This information 
 * shall not be distributed or copied without written permission from 
 * Hysun He.
 *
 ***************************************************************************/

package com.oracle.oda.ext;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;

import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;

import oracle.jdbc.replay.OracleDataSourceFactory;

/***************************************************************************
 * <PRE>
 *  Project Name    : bot-gateway-springboot
 * 
 *  Package Name    : com.oracle.oda.ext.dao
 * 
 *  File Name       : FoodsMapper.java
 * 
 *  Creation Date   : 2023年5月30日
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
@Configuration
public class MyUcpDataSource {
	private static final Logger LOGGER = LoggerFactory.getLogger(MyUcpDataSource.class);

	@Bean("ds_shard")
	@ConfigurationProperties("spring.datasource.shardsg")
	@Primary
	public DataSource ds_shard() throws SQLException {
		LOGGER.info("*** Initialize datasource ds_shard_gsm.");
		return OracleDataSourceFactory.getOracleDataSource();
	}
}