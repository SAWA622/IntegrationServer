package com.tietoevry.teis.pe.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigBean {
	
	
	@Value("${teis.component.key}")
	private String componentKey;
	
	@Value("${server.port}")
	private String serverPort;
	
	@Value("${activemq.broker-url}")
	private String brokerUrl;

	
	public String getKey( ) {
		return this.componentKey;
	}

	public String getPort() {
		return this.serverPort;
	}
	
	public String getBrokerUrl() {
		return this.brokerUrl;
	}
	 
}
