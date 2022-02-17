package br.com.leonardobatistacarias.abstractfactory.apple.factory.abstractFactory;

import br.com.leonardobatistacarias.abstractfactory.apple.model.certificate.Certificate;
import br.com.leonardobatistacarias.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
