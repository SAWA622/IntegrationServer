package com.tietoevry.teis.pe.common;

public interface IConveter<FROM, TO> {
	TO convert(FROM aFromObject);
	FROM invert(TO aToObject);
}
