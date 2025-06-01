package com.tietoevry.teis.executor.vo;

import java.io.Serializable;
import java.util.List;

public class ConfigVo implements Serializable{
    
    private String id;
    private List<ScriptParameterVo> scriptParameterList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ScriptParameterVo> getScriptParameterList() {
        return scriptParameterList;
    }

    public void setScriptParameterList(List<ScriptParameterVo> scriptParameterList) {
        this.scriptParameterList = scriptParameterList;
    }
    
}
