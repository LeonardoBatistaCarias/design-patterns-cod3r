package br.com.leonardobatistacarias.abstractfactory.apple.factory.abstractFactory;

import br.com.leonardobatistacarias.abstractfactory.apple.model.certificate.BrazilianCertificate;
import br.com.leonardobatistacarias.abstractfactory.apple.model.certificate.Certificate;
import br.com.leonardobatistacarias.abstractfactory.apple.model.packing.BrazilianPacking;
import br.com.leonardobatistacarias.abstractfactory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
