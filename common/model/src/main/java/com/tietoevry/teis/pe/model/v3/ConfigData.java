package com.tietoevry.teis.pe.model.v3;

import java.io.Serializable;
import java.util.List;

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
    
}
