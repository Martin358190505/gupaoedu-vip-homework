package com.gupaoedu.vip.pattern.factory.simplefactory;

import com.gupaoedu.vip.pattern.factory.ITelevision;

public class TelevisionFactory {
	public ITelevision create(Class<? extends ITelevision> clazz) {
		
		try {
			return clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}
}
