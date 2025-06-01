package com.tietoevry.teis.pe.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "ScriptParameterData")
public class ScriptParameterData {

	private static final long serialVersionUID = 1L;
	private String id;
	private String parameterName;
	private String value;
	private String scriptId;
	private boolean config;
	private String type;
	private boolean optionProtected;
	private boolean inParameter;
	private boolean outParameter;

	private boolean autoComplete;
	private boolean storedValue;
	private String dataType;
	private String description;
	private String parameterTypes;
	private String lastUpdated;
	private String updatedBy;
	private String securityLevel;

	public boolean isInParameter() {
		return inParameter;
	}

	public void setInParameter(boolean inParameter) {
		this.inParameter = inParameter;
	}

	public boolean isOutParameter() {
		return outParameter;
	}

	public void setOutParameter(boolean outParameter) {
		this.outParameter = outParameter;
	}

	public boolean isOptionProtected() {
		return optionProtected;
	}

	public void setOptionProtected(boolean optionProtected) {
		this.optionProtected = optionProtected;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isConfig() {
		return config;
	}

	public void setConfig(boolean config) {
		this.config = config;
	}

	public String getScriptId() {
		return scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public String getId() {
		return id;
	}

	public void setId(String scriptID) {
		this.id = scriptID;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isAutoComplete() {
		return autoComplete;
	}

	public void setAutoComplete(boolean autoComplete) {
		this.autoComplete = autoComplete;
	}

	public boolean isStoredValue() {
		return storedValue;
	}

	public void setStoredValue(boolean storedValue) {
		this.storedValue = storedValue;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getParameterTypes() {
		return parameterTypes;
	}

	public void setParameterTypes(String parameterTypes) {
		this.parameterTypes = parameterTypes;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getSecurityLevel() {
		return securityLevel;
	}

	public void setSecurityLevel(String securityLevel) {
		this.securityLevel = securityLevel;
	}

	@Override
	public String toString() {
		return "ScriptParameterData [id=" + id + ", parameterName=" + parameterName + ", value=" + value + ", scriptId="
				+ scriptId + ", config=" + config + ", type=" + type + ", optionProtected=" + optionProtected
				+ ", inParameter=" + inParameter + ", outParameter=" + outParameter + ", autoComplete=" + autoComplete
				+ ", storedValue=" + storedValue + ", dataType=" + dataType + ", description=" + description
				+ ", parameterTypes=" + parameterTypes + ", lastUpdated=" + lastUpdated + ", updatedBy=" + updatedBy
				+ ", securityLevel=" + securityLevel + "]";
	}

}
