package com.tietoevry.teis.pe.model.converter;

import java.util.ArrayList;
import java.util.List;

import com.tietoevry.teis.executor.vo.ConfigVo;
import com.tietoevry.teis.executor.vo.ExecutorVo;
import com.tietoevry.teis.executor.vo.NetUserVo;
import com.tietoevry.teis.executor.vo.ParamVo;
import com.tietoevry.teis.executor.vo.ScriptParameterVo;
import com.tietoevry.teis.pe.common.IConveter;
import com.tietoevry.teis.pe.common.PathUtils;
import com.tietoevry.teis.pe.model.ConfigData;
import com.tietoevry.teis.pe.model.NetUserData;
import com.tietoevry.teis.pe.model.ParamData;
import com.tietoevry.teis.pe.model.ScriptParameterData;
import com.tietoevry.teis.pe.model.v3.ExecutorData;

public enum ExecutorConverter implements IConveter<ExecutorData, ExecutorVo> {

	Instance;
	/*
	 * private static IConveter<ExecutorData, ExecutorVo> _instance = null;
	 * 
	 * private ExecutorConverter() { }
	 * 
	 * public static IConveter<ExecutorData, ExecutorVo> getInstance() { if
	 * (_instance == null) { synchronized (ExecutorConverter.class) { if (_instance
	 * == null) { _instance = new ExecutorConverter(); } } } return _instance; }
	 */

	@Override
	public ExecutorVo convert(ExecutorData d) {
		ExecutorVo v = null;
		try {
			if (d != null) {
				System.out.println(d);
				v = new ExecutorVo();
				v.setConfigDataList(getConfigList(d.getConfigData()));
				v.setExcutablePath(d.getScriptId());
				v.setId(Integer.parseInt(d.getScriptId()));
				v.setItemId(d.getItemId());
				// v.setItemType(d.get());
				v.setNetUsers(getUsers(d.getNetUserDatas()));
				v.setParameters(getParams(d.getParameterDataList()));
				v.setSysLibs(d.getSysLibRef());
				v.setTaskId(d.getTaskId());
				v.setWorkspaceId(Integer.parseInt(d.getWorkspaceId()));
				v.setExcutablePath(getExecutorPath(d.getParameterDataList(), d.getWorkspaceId()));
				v.setItemType(getParamValue(d.getParameterDataList(), "parentType"));
				v.setExecutableName(getParamValue(d.getParameterDataList(),"ScriptName"));
			}
		} catch (Exception e) {
			//TeisException.throwError(ErrorC, e)
		}
		
		return v;
	}

	String getExecutorPath(List<ParamData> params, String wsId) {
		String userDefined = getParamValue(params, "userDefined");
		boolean isUserDefined = userDefined != null && Boolean.getBoolean(userDefined);
		String fileName = getParamValue(params, "fileName");
		return isUserDefined ? PathUtils.getUserScriptPath(fileName, wsId) : PathUtils.getTemplateScriptPath(fileName);
	}

	String getTeisHome() {
		// TODO Auto-generated method stub
		return null;
	}

	String getParamValue(List<ParamData> params, String paramName) {
		if (params != null) {
			ParamData param = params.stream().filter(c -> paramName.equals(c.getName())).findAny().orElse(null);
			if (param != null) {
				return param.getValue();
			}
		}
		return null;
	}

	private List<ParamVo> getParams(List<ParamData> parameterDataList) {
		List<ParamVo> vlist = null;
		if (parameterDataList != null) {
			vlist = new ArrayList<ParamVo>();
			for (ParamData e : parameterDataList) {
				ParamVo v = new ParamVo();
				v.setName(e.getName());
				v.setValue(e.getValue());
				v.setSecurityLevel(e.getSecurityLevel());
				vlist.add(v);
			}
		}
		return vlist;
	}

	private List<NetUserVo> getUsers(List<NetUserData> netUserDatas) {
		List<NetUserVo> vlist = null;
		if (netUserDatas != null) {
			vlist = new ArrayList<NetUserVo>();
			for (NetUserData e : netUserDatas) {
				NetUserVo v = new NetUserVo();
				v.setDomain(e.getDomain());
				v.setId(e.getId());
				v.setName(e.getName());
				v.setPassword(e.getPassword());
				v.setPriorityLevel(e.getPriorityLevel());
				vlist.add(v);
			}
		}
		return vlist;
	}

	private List<ConfigVo> getConfigList(List<ConfigData> configData) {
		List<ConfigVo> vlist = null;
		if (configData != null) {
			vlist = new ArrayList<ConfigVo>();
			for (ConfigData e : configData) {
				ConfigVo v = new ConfigVo();
				v.setId(e.getId());
				v.setScriptParameterList(getScriptParams(e.getScriptParameterList()));
				vlist.add(v);
			}
		}
		return vlist;
	}

	private List<ScriptParameterVo> getScriptParams(List<ScriptParameterData> scriptParameterList) {
		List<ScriptParameterVo> vlist = null;
		if (scriptParameterList != null) {
			vlist = new ArrayList<ScriptParameterVo>();
			for (ScriptParameterData e : scriptParameterList) {
				ScriptParameterVo v = new ScriptParameterVo();
				v.setConfig(e.isConfig());
				v.setAutoComplete(e.isAutoComplete());
				v.setDataType(e.getDataType());
				v.setDescription(e.getDescription());
				v.setId(e.getId());
				v.setInParameter(e.isInParameter());
				v.setLastUpdated(e.getLastUpdated());
				v.setOptionProtected(e.isOptionProtected());
				v.setOutParameter(e.isOutParameter());
				v.setParameterName(e.getParameterName());
				v.setParameterTypes(e.getParameterTypes());
				v.setScriptId(e.getScriptId());
				v.setSecurityLevel(e.getSecurityLevel());
				v.setStoredValue(e.isStoredValue());
				v.setType(e.getType());
				v.setUpdatedBy(e.getUpdatedBy());
				v.setValue(e.getValue());
				vlist.add(v);
			}
		}
		return vlist;
	}

	@Override
	public ExecutorData invert(ExecutorVo v) {
		// TODO Auto-generated method stub
		return null;
	}

}
