package com.tietoevry.teis.pe.model.converter;

import com.tietoevry.teis.pe.client.v3.vo.SecureKeyDetails;
import com.tietoevry.teis.pe.common.IConveter;
import com.tietoevry.teis.pe.model.SecureKeyData;

public enum SecureKeyConverter implements IConveter<SecureKeyDetails, SecureKeyData> {
	Instance;

	@Override
	public SecureKeyData convert(SecureKeyDetails v) {
		SecureKeyData r = new SecureKeyData();
		r.setAlgorithm(v.getCryptoAlgorithm());
		r.setKey(v.getSecureKey());
		return r;
	}

	@Override
	public SecureKeyDetails invert(SecureKeyData v) {
		// TODO Auto-generated method stub
		return null;
	}

}
