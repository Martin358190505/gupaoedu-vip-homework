package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.ITelevision;
import com.gupaoedu.vip.pattern.factory.TCLTelevision;

public class TCLTvFactory implements ITelevisionFactory{

	@Override
	public ITelevision create() {
		return new TCLTelevision();
	}

}
