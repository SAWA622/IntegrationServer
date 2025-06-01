//package com.tietoevry.teis.pe.jms;
//
//import javax.jms.JMSException;
//import javax.jms.Queue;
//import javax.jms.Session;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.stereotype.Service;
//
//import com.tietoevry.teis.pe.exception.SystemErrorCode;
//import com.tietoevry.teis.pe.exception.TeisException;
//import com.tietoevry.teis.pe.model.LogRequestData;
//
//@Service
//public class MessageSender {
//
//	@Autowired
//	JmsTemplate jmsTemplate;
//	
//	
//	@Value("${teis.jms.logqueue}")
//	private String logQueueName;
//	
//
//	public boolean sendLog(LogRequestData[] r) throws TeisException {
//		try {
//			Queue logQueue = jmsTemplate.getConnectionFactory().createConnection()
//			         .createSession(false,Session.AUTO_ACKNOWLEDGE).createQueue(logQueueName);
//			jmsTemplate.convertAndSend(logQueue, r, m -> {
//				 m.setStringProperty("se-id", "pa1");
//				return m;
//			});
//		} catch (JMSException e) {
//			TeisException.throwError(SystemErrorCode.JMSCommunication, e);
//		}catch (Exception e) {
//			TeisException.throwError(SystemErrorCode.InternalError,"error in send log to message queue", e);
//		}
//		return true;
//	}
//
//}
package com.tietoevry.teis.pe.jms;

import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.tietoevry.teis.pe.exception.SystemErrorCode;
import com.tietoevry.teis.pe.exception.TeisException;
import com.tietoevry.teis.pe.model.LogRequestData;

@Service
public class MessageSender {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${teis.jms.logqueue}")
    private String logQueueName;

    public boolean sendLog(LogRequestData[] logRequests) throws TeisException {
        try {
            for (LogRequestData logRequest : logRequests) {
                jmsTemplate.convertAndSend(logQueueName, logRequest, message -> {
                    message.setStringProperty("se-id", "pa1");
                    return message;
                });
            }
            return true;
        } catch (JmsException e) {
            throw new TeisException(SystemErrorCode.JMSCommunication, e);
        }
    }
}