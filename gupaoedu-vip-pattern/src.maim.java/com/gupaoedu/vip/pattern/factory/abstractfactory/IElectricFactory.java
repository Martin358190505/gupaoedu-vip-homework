package com.gupaoedu.vip.pattern.factory.abstractfactory;

import com.gupaoedu.vip.pattern.factory.ITelevision;

public interface IElectricFactory {
	IFridge createFridge();
	ITelevision createTelevision();
}
