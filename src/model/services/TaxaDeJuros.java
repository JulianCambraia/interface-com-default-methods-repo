package model.services;

import java.security.InvalidParameterException;

public interface TaxaDeJuros {

	double getTaxa();

	default double pagamento(double quantia, int mes) {
		if (mes < 1) {
			throw new InvalidParameterException("O mês deve ser maior que zero!");
		}
		return quantia * Math.pow(1 + getTaxa() / 100, mes);
	}
}
