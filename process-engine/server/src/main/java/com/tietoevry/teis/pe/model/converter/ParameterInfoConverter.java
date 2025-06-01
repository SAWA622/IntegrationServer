package com.tietoevry.teis.pe.model.converter;

import com.tietoevry.teis.pe.client.v3.vo.ParameterInfo;
import com.tietoevry.teis.pe.common.IConveter;
import com.tietoevry.teis.pe.model.ParamRequestData;

public enum ParameterInfoConverter implements IConveter<ParamRequestData,ParameterInfo>{
	Instance;

	@Override
	public ParameterInfo convert(ParamRequestData v) {
		ParameterInfo r = new ParameterInfo();
		 r.setParameterName(v.getName());
		 r.setParameterValue(v.getValue());
		 r.setTaskId(v.getTaskId());
		 r.setWorkspaceId(String.valueOf(v.getWorkspaceId()));
		return r;
	}

	@Override
	public ParamRequestData invert(ParameterInfo v) {
		// TODO Auto-generated method stub
		return null;
	}

}
