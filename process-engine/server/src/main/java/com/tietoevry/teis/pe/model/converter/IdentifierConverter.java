package com.tietoevry.teis.pe.model.converter;

import com.tietoevry.teis.pe.client.v3.vo.IdentifierRequest;
import com.tietoevry.teis.pe.common.IConveter;
import com.tietoevry.teis.pe.model.IdentifierData;

public enum IdentifierConverter implements IConveter<IdentifierData,IdentifierRequest>{
	Instance;

	@Override
	public IdentifierRequest convert(IdentifierData v) {
		IdentifierRequest r = new IdentifierRequest();
		r.setTriggerTaskId(v.getTriggerTaskId());
		r.setTaskId(v.getTaskId());
		r.setIdentifierdetails(v.getIdentifierdetails());
		r.setWorkspaceId(String.valueOf(v.getWorkspaceId()));
		r.setTriggerTaskId(v.getParentTaskId());
		return r;
	}

	@Override
	public IdentifierData invert(IdentifierRequest v) {
		// TODO Auto-generated method stub
		return null;
	}

}
