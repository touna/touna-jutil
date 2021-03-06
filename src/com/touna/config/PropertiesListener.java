package com.touna.config;

import java.io.File;
import java.util.Map;

import com.touna.common.PropertiesUtils;

public abstract class PropertiesListener implements FileListener {

	@Override
	public void onChanged(File changed) {
		if(changed.exists()) {
			Map<String, String> conf = PropertiesUtils.load(changed) ;
			proccessChanged(conf);
		}
	}

	
	
	protected abstract void proccessChanged(Map<String, String> conf) ;
}
