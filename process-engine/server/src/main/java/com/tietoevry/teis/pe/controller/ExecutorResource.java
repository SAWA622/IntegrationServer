package com.tietoevry.teis.pe.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tietoevry.teis.pe.exception.TeisException;
import com.tietoevry.teis.pe.model.BooleanResult;
import com.tietoevry.teis.pe.model.ErrorMessageReqData;
import com.tietoevry.teis.pe.model.ExecutorParamData;
import com.tietoevry.teis.pe.model.ExecutorStatusData;
import com.tietoevry.teis.pe.model.IdentifierData;
import com.tietoevry.teis.pe.model.ParamData;
import com.tietoevry.teis.pe.model.StringResult;
import com.tietoevry.teis.pe.model.TaskInfoData;
import com.tietoevry.teis.pe.model.TriggerDetails;
import com.tietoevry.teis.pe.model.TriggerStatusList;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/executor")
@Validated
public class ExecutorResource {

    @RequestMapping(path = "/getIdentifier/{triggerId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public StringResult getIdentifier(@PathVariable(name = "triggerId") @NotNull @NotBlank @Size(max = 40) String triggerId) throws TeisException {
        return null;
    }

    @RequestMapping(path = "/startTrigger", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public TriggerStatusList startTrigger(@Valid @RequestBody TriggerDetails t) {
        return null;
    }

    @RequestMapping(path = "/updateExecuteStatus", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public BooleanResult updateExecuteStatus(@Valid @RequestBody ExecutorStatusData data) {
        return null;
    }

    @RequestMapping(path = "/updateParameters", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public BooleanResult updateParameters(@Valid @RequestBody ExecutorParamData data) {
        return null;
    }

    @RequestMapping(path = "/attachIntegration", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public BooleanResult attachIntegration(@Valid @RequestBody IdentifierData data) {
        return null;
    }

    @RequestMapping(path = "/createObject", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public StringResult createObject() {
        return null;
    }

    @RequestMapping(path = "/activate/{taskId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public BooleanResult startTrigger(@PathVariable(name = "taskId") @NotNull @NotBlank @Size(max = 200) String taskId) throws TeisException {
        return null;
    }

    @RequestMapping(path = "/getTaskStatus/{workspaceId}/{taskId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public StringResult getTaskStatus(@PathVariable(name = "workspaceId") @NotNull Integer workspaceId, @PathVariable(name = "taskId") @NotNull @NotBlank @Size(max = 200) String taskId) {
        return null;
    }

    @RequestMapping(path = "/removeErrorflag/{taskId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public BooleanResult removeErrorflag(@PathVariable(name = "taskId") @NotNull @NotBlank @Size(max = 200) String taskId) {
        return null;
    }

    @RequestMapping(path = "/attachId/{parentId}/{childId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public BooleanResult attachId(@PathVariable(name = "parentId") @NotNull @NotBlank @Size(max = 200) String parentId, @PathVariable(name = "childId") @NotNull @NotBlank @Size(max = 200) String childId) {
        return null;
    }

    @RequestMapping(path = "/getParameters/{taskId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ParamData> getParameters(@PathVariable(name = "taskId") @NotNull @NotBlank @Size(max = 200) String taskId) throws TeisException {
        return null;
    }

    @RequestMapping(path = "/getParameter/{taskId}/{paramName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ParamData getParameter(@PathVariable(name = "taskId") @NotNull @NotBlank @Size(max = 200) String taskId, @PathVariable(name = "paramName") @NotNull @NotBlank @Size(max = 200) String paramName) throws TeisException {
        return null;
    }

    @RequestMapping(path = "/setMsgPendingDelay/{taskId}/{delay}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public BooleanResult setMsgPendingDelay(@PathVariable(name = "taskId") @NotNull @NotBlank @Size(max = 200) String taskId, @PathVariable(name = "delay") @NotNull Integer delay) {
        return null;
    }

    @RequestMapping(path = "/addErrorMsgToTask", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public BooleanResult addErrorMsgToTask(@Valid @RequestBody ErrorMessageReqData data) throws TeisException {
        return null;
    }

    @RequestMapping(path = "/removeErrorMsg/{taskId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public BooleanResult removeErrorMsg(@PathVariable(name = "taskId") @NotNull @NotBlank @Size(max = 200) String taskId) throws TeisException {
        return null;
    }

    @RequestMapping(path = "/quit/{taskId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public BooleanResult quit(@PathVariable(name = "taskId") @NotNull @NotBlank @Size(max = 200) String taskId) throws TeisException {
        return null;
    }

    @RequestMapping(path = "/getTaskInfo/{taskId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public TaskInfoData getTaskInfo(@PathVariable(name = "taskId") @NotNull @NotBlank @Size(max = 200) String taskId) {
        return null;
    }

    @RequestMapping(path = "/getData/{taskId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<Object> getData(@PathVariable(name = "taskId") @NotNull @NotBlank @Size(max = 200) String taskId) {
        return null;
    }

    @Operation(summary = "setData method will be used to set data & will be available in task execution in process execution")
    @RequestMapping(path = "/setData", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public BooleanResult setData(@RequestParam("file") @NotNull @NotBlank MultipartFile file) {
        return null;
    }
}
