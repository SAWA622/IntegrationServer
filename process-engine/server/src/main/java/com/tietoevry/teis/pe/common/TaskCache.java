package com.tietoevry.teis.pe.common;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.tietoevry.teis.pe.model.v3.ExecutorData;

public class TaskCache implements ICache {
	
	private Map<String, ExecutorData> cache = null;
	
	private static TaskCache _instance = null;
	
	private TaskCache() {
		this.cache = new ConcurrentHashMap<String, ExecutorData>(10);
	}
	
	public static ICache getInstance() {
		if(_instance == null) {
			synchronized (TaskCache.class) {
				if(_instance == null) {
					_instance = new TaskCache();
				}
			}
		}
		return _instance;
	}
	
	public ExecutorData get(String taskId) {
	  return cache.get(taskId);
	}
	
	public boolean remove(String taskId) {
		return (taskId != null) ?
		 cache.remove(taskId) != null : false;
	}
	public boolean add(String taskId, ExecutorData v) {
		return cache.put(taskId,v) != null;
	}

	@Override
	public int size() {
		return cache.size();
	}

}
