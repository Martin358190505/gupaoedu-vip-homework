package com.gupaoedu.vip.pattern.factory.abstractfactory;

import com.gupaoedu.vip.pattern.factory.ITelevision;
import com.gupaoedu.vip.pattern.factory.TCLTelevision;

public class TCLFactory implements IElectricFactory{

	@Override
	public IFridge createFridge() {
		return new TCLFridge();
	}

	@Override
	public ITelevision createTelevision() {
		return new TCLTelevision();
	}

}
