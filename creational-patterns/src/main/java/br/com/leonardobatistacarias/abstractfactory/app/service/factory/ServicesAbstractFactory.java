package br.com.leonardobatistacarias.abstractfactory.app.service.factory;

import br.com.leonardobatistacarias.abstractfactory.app.service.services.CarService;
import br.com.leonardobatistacarias.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
