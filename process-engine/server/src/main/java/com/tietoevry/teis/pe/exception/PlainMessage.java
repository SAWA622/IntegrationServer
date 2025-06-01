package com.tietoevry.teis.pe.exception;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;


@Schema(name="PlainMessage")
public class PlainMessage {

    private List<String> errors;

    public PlainMessage() {
    }

    public PlainMessage(List<String> errors) {
        this.errors = errors;
    }

    public PlainMessage(String error) {
        this(Collections.singletonList(error));
    }

    public PlainMessage(String ... errors) {
        this(Arrays.asList(errors));
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}