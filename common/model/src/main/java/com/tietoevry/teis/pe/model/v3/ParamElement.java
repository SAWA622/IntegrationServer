package com.tietoevry.teis.pe.model.v3;

import java.io.Serializable;
import java.util.Objects;

public class ParamElement implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String value;
	private String securityLevel;

	public ParamElement() {
		this.securityLevel = "low";
	}

	public ParamElement(String pName, String pValue) {
		this(pName, pValue, "low");
	}

	public ParamElement(String pName, String pValue, String sLevel) {
		this.name = pName;
		this.value = pValue;
		this.securityLevel = (sLevel != null) ? sLevel : "low";
	}

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
	public boolean equals(Object o) {

		if (o == this)
			return true;

		if (!(o instanceof ParamElement)) {
			return false;
		}

		ParamElement data = (ParamElement) o;
		return Objects.equals(name, data.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return "ParamElement [name=" + name + ", value=" + value + ", securityLevel=" + securityLevel + "]";
	}

}
