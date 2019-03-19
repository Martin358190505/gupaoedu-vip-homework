package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.HaierTelevision;
import com.gupaoedu.vip.pattern.factory.ITelevision;

public class HaierTvFactory implements ITelevisionFactory{

	@Override
	public ITelevision create() {
		return new HaierTelevision();
	}

}
