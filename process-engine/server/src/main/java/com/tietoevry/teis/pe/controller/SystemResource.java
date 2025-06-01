package com.tietoevry.teis.pe.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
import com.tietoevry.teis.pe.model.FileRequestData;
import com.tietoevry.teis.pe.model.ParamRequestData;
import com.tietoevry.teis.pe.model.SecureKeyData;
import com.tietoevry.teis.pe.model.StringResult;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/system")
@Validated
public class SystemResource {

	@RequestMapping(path = "/createTempFile", method = RequestMethod.POST)
	public StringResult createTempFile(@Valid @RequestBody FileRequestData data) throws TeisException {
		return null;
	}

	@RequestMapping(path = "/getGlobalParameterValue/{paramName}", method = RequestMethod.GET)
	public StringResult getGlobalParameterValue(
			@PathVariable(name = "paramName", required = true) @NotNull @NotBlank @Size(max = 40) String paramName)
			throws TeisException {
		return null;
	}

	@RequestMapping(path = "/getTempDirectory", method = RequestMethod.GET)
	public StringResult getTempDirectory() {
       return null;
	}

	@RequestMapping(path = "/updateGlobalParameter", method = RequestMethod.POST)
	public BooleanResult updateGlobalParameter(@Valid @RequestBody ParamRequestData data) throws TeisException {
		return null;
	}

	@RequestMapping(path = "/getApplicationParameterValue", method = RequestMethod.POST)
	public StringResult getApplicationParameter(@Valid @RequestBody ParamRequestData data) throws TeisException {
		return null;
	}

	@RequestMapping(path = "/getSecureKey/{workspaceId}/{keyName}", method = RequestMethod.GET)
	public SecureKeyData getSecureKey(
			@PathVariable(name = "workspaceId", required = true) @NotNull @NotBlank @Size(max = 40) Integer workspaceId,
			@PathVariable(name = "keyName", required = true) @NotNull @NotBlank @Size(max = 200) String keyName)
			throws TeisException {
		return null;
	}

	@Operation(summary = "applyAddOn API will be consumed by the server to deploy an add-on.")
	@RequestMapping(path = "/applyAddOn", method = RequestMethod.POST)
	public BooleanResult applyAddOn(@RequestParam("file") @NotNull @NotBlank MultipartFile file) {
		return null;
	}

	@Operation(summary = "removeAddOn API will be used to remove an add-on from the process engine.")
	@RequestMapping(path = "/removeAddOn/{name}", method = RequestMethod.DELETE)
	public BooleanResult removeAddOn(
			@PathVariable(name = "name", required = true) @NotNull @NotBlank @Size(max = 40) String name) {
		return null;
	}
}
