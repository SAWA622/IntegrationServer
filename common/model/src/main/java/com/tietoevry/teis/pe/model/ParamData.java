package com.tietoevry.teis.pe.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name="ParamData")
public class ParamData {
	
	private String name;
	private String value;
	private String securityLevel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getSecurityLevel() {
		return securityLevel;
	}
	public void setSecurityLevel(String securityLevel) {
		this.securityLevel = securityLevel;
	}
	@Override
	public String toString() {
		return "ParamData [name=" + name + ", value=" + value + ", securityLevel=" + securityLevel + "]";
	}
	
	

}
