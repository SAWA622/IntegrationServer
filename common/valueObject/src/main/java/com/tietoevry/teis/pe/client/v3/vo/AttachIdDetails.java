package com.tietoevry.teis.pe.client.v3.vo;

public class AttachIdDetails {
    
    private String parentTaskId;
    
    private String childTaskId;

    public String getChildTaskId() {
        return childTaskId;
    }

    public void setChildTaskId(String childTaskId) {
        this.childTaskId = childTaskId;
    }

    public String getParentTaskId() {
        return parentTaskId;
    }

    public void setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
    }
    
    
}
