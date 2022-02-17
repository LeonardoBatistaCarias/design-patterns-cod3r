package br.com.leonardobatistacarias.factory.apple.after.factory;

import br.com.leonardobatistacarias.factory.apple.after.model.IPhone;
import br.com.leonardobatistacarias.factory.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
