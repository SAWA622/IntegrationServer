package com.tietoevry.teis.pe.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tietoevry.teis.pe.model.BooleanResult;
import com.tietoevry.teis.pe.model.TaskData;


/** This controller class will be use by 4.x version for accepting task execution
 * in new design
 */
@RestController
@RequestMapping("/task")
@Validated
public class TaskResource {

	@RequestMapping(path = "/v1/execute", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	public BooleanResult execute(@Valid @RequestBody TaskData data) {
		return new BooleanResult(true);
	}

	@RequestMapping(path = "/v1/killTask/{taskId}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public BooleanResult killTask(
			@PathVariable(name = "taskId", required = true) @NotNull @NotBlank @Size(max = 40) String taskId) {
		return new BooleanResult(true);
	}

}
