package com.tietoevry.teis.mw.service;

import java.util.List;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;
import com.tietoevry.teis.pe.model.LogRequestData;

@Service
public class MessageListenerService {

	@JmsListener(destination = "${teis.jms.logqueue}")
	public void receiveMessages(List<LogRequestData> logRequests) {
	    for (LogRequestData request : logRequests) {
	        System.out.println("Processing log request: " + request);
	    }
	}
}