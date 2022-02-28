package br.com.leonardobatistacarias.strategy.person.strategies.work;

import br.com.leonardobatistacarias.strategy.person.strategies.work.WorkStrategy;

public class NoWorkStrategy implements WorkStrategy {

	@Override
	public void work() {
		System.out.println("I have no job. Dou you have some money?");
	}

}
