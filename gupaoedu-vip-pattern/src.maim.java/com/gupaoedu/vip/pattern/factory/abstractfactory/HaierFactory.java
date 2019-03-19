package com.gupaoedu.vip.pattern.factory.abstractfactory;

import com.gupaoedu.vip.pattern.factory.HaierTelevision;
import com.gupaoedu.vip.pattern.factory.ITelevision;

public class HaierFactory implements IElectricFactory{

	@Override
	public IFridge createFridge() {
		return new HaierFridge();
	}

	@Override
	public ITelevision createTelevision() {
		return new HaierTelevision();
	}

}
