package com.tietoevry.teis.pe.common;

import com.tietoevry.teis.pe.model.v3.ExecutorData;

public interface ICache {
	ExecutorData get(String taskId) ;
    boolean remove(String taskId);
	boolean add(String taskId, ExecutorData v) ;
	int size();

}
