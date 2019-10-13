package model.services;

public class BrasilTaxaDeJurosService implements TaxaDeJuros {
	private Double taxaDeJuros;

	public BrasilTaxaDeJurosService() {
		super();
	}

	public BrasilTaxaDeJurosService(Double taxaDeJuros) {
		super();
		this.taxaDeJuros = taxaDeJuros;
	}

	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}

	@Override
	public double getTaxa() {
		// TODO Auto-generated method stub
		return taxaDeJuros;
	}
	
}
