//package com.tietoevry.teis.pe.controller;
//
//import java.util.Arrays;
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.tietoevry.teis.pe.common.TaskCache;
//import com.tietoevry.teis.pe.exception.TeisException;
//import com.tietoevry.teis.pe.jms.MessageSender;
//import com.tietoevry.teis.pe.model.BooleanResult;
//import com.tietoevry.teis.pe.model.LogRequestData;
//import com.tietoevry.teis.pe.model.v3.ExecutorData;
//
//@RestController
//@RequestMapping("/log")
//@Validated
//public class LogResource {
//
//	@Autowired
//	MessageSender messageSender;
//
//	@RequestMapping(path = "/report", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
//	public BooleanResult report(@Valid @RequestBody LogRequestData[] data) throws TeisException {
//		System.out.println("hi1");
//		if (data != null) {
//			//List<LogRequestData> list = Arrays.asList(data);
//			ExecutorData e = null;
//			for (LogRequestData d : data) {
//				if (d.getTaskId() != null && !d.getTaskId().isEmpty()) {
//					if (e == null) {
//						e = TaskCache.getInstance().get(d.getTaskId());
//					}
//					if (e != null) {
//						d.setItemId(e.getItemId());
//						d.setWorkspaceId(Integer.parseInt(e.getWorkspaceId()));
//					}
//				}
//			}
//		}
//		return new BooleanResult(messageSender.sendLog(data));
//	}
//
//}
package com.tietoevry.teis.pe.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tietoevry.teis.pe.common.TaskCache;
import com.tietoevry.teis.pe.exception.TeisException;
import com.tietoevry.teis.pe.jms.MessageSender;
import com.tietoevry.teis.pe.model.BooleanResult;
import com.tietoevry.teis.pe.model.LogRequestData;
import com.tietoevry.teis.pe.model.v3.ExecutorData;

@RestController
@RequestMapping("/log")
@Validated
public class LogResource {

    @Autowired
    private MessageSender messageSender;

    @RequestMapping(path = "/report", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
    public BooleanResult report(@Valid @RequestBody LogRequestData[] data) throws TeisException {
        System.out.println("Received bulk data with " + data.length + " entries.");
        if (data != null) {
            ExecutorData e = null;
            for (LogRequestData d : data) {
                if (d.getTaskId() != null && !d.getTaskId().isEmpty()) {
                    if (e == null) {
                        e = TaskCache.getInstance().get(d.getTaskId());
                    }
                    if (e != null) {
                        d.setItemId(e.getItemId());
                        d.setWorkspaceId(Integer.parseInt(e.getWorkspaceId()));
                    }
                }
            }
        }
        return new BooleanResult(messageSender.sendLog(data));
    }
}