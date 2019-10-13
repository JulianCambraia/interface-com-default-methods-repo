package model.services;

public class UsaTaxaDeJurosService implements TaxaDeJuros {
	private Double taxaDeJuros;

	public UsaTaxaDeJurosService() {
		super();
	}

	public UsaTaxaDeJurosService(Double taxaDeJuros) {
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
