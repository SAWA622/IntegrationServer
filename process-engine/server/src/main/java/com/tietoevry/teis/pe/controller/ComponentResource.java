package com.tietoevry.teis.pe.controller;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tietoevry.teis.pe.model.BooleanResult;
import com.tietoevry.teis.pe.model.ComponentData;

@RestController
@RequestMapping("/component")
@Validated
public class ComponentResource {

	@RequestMapping(path = "/v1/handshake", method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
	public BooleanResult handshake(@Valid @RequestBody ComponentData data) {
		return new BooleanResult(true);
	}
}