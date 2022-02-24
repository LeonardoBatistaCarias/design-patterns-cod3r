package br.com.leonardobatistacarias.mediator.translate.model;

import br.com.leonardobatistacarias.mediator.translate.mediator.Mediator;

public class EnglishUser extends User {

	public EnglishUser(String name, Mediator mediator) {
		super(name, mediator, Language.ENGLISH);
	}
	
}
