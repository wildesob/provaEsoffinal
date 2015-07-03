package br.edu.iftm.prova;

public class imposto {
	private double aliquotaimposto = 60/100;
	private double cotacaodolar;
	private double valorimposto;
	public double getAliquotaimposto() {
		return aliquotaimposto;
	}
	public void setAliquotaimposto(double aliquotaimposto) {
		this.aliquotaimposto = aliquotaimposto;
	}
	public double getCotacaodolar() {
		return cotacaodolar;
	}
	public void setCotacaodolar(double cotacaodolar) {
		this.cotacaodolar = cotacaodolar;
	}
	public double getValorimposto() {
		return valorimposto;
	}
	public void setValorimposto(double valorimposto) {
		this.valorimposto = valorimposto;
	}

}
