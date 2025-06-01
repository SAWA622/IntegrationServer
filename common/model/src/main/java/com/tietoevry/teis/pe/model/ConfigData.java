/*
 * Copyright (c) 2011 Tieto India, All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Tieto Sweden. 
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into with Tieto.
 */
package com.tietoevry.teis.pe.model;

import java.io.Serializable;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;


@Schema(name="ConfigData")
public class ConfigData implements Serializable{
    
    private String id;
    private List<ScriptParameterData> scriptParameterList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ScriptParameterData> getScriptParameterList() {
        return scriptParameterList;
    }

    public void setScriptParameterList(List<ScriptParameterData> scriptParameterList) {
        this.scriptParameterList = scriptParameterList;
    }

	@Override
	public String toString() {
		return "ConfigData [id=" + id + ", scriptParameterList=" + scriptParameterList + "]";
	}
    
}
