package com.tietoevry.teis.pe.model.converter;

import com.tietoevry.teis.pe.common.IConveter;

public enum ConveterFactory {
	
	Instance;
	
	public static IConveter<?,?> get(Type type) {
		return Instance.getCoverter(type);
	}
	
	private IConveter<?, ?> getCoverter(Type t) {
		// TODO Auto-generated method stub
		IConveter<?, ?> c = null;
		switch(t) {
		case executor:
			c = ExecutorConverter.Instance;
			break;
			
		}
		return c;
	}

	public enum Type {
		executor;
	}

}
