package br.com.leonardobatistacarias.strategy.worker.strategies.work;

public class PilotStrategy implements WorkStrategy {

	@Override
	public void work() {
		System.out.println("I pilot airplanes to earn a lot of money");
	}

}
