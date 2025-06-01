package com.tietoevry.teis.pe.client.v3.vo;

public class TemporaryFilesInputDetails {
   
    private String taskId;
    
    private String fileExtension;
    
    private boolean autoDelete;

    public boolean isAutoDelete() {
        return autoDelete;
    }

    public void setAutoDelete(boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
    
    
    
}
