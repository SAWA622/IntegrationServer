package com.tietoevry.teis.pe.controller;

import javax.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.tietoevry.teis.pe.exception.TeisException;
import com.tietoevry.teis.pe.model.BooleanResult;
import com.tietoevry.teis.pe.model.MutexData;

@RestController
@RequestMapping("/task/mutex")
@Validated
public class MutexResource {

    @RequestMapping(path = "/createmutex", method = RequestMethod.POST)
    public BooleanResult createTempFile(@Valid @RequestBody MutexData data) throws TeisException {
        return null;
    }

    @RequestMapping(path = "/releasemutex", method = RequestMethod.POST)
    public BooleanResult releasemutex(@Valid @RequestBody MutexData data) throws TeisException {     
        return null;
    }

    @RequestMapping(path = "/ismutex", method = RequestMethod.POST)
    public BooleanResult ismutex(@Valid @RequestBody MutexData data) throws TeisException {
        return null;
    }
}
