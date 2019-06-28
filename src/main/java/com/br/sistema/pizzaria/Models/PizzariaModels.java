package com.br.sistema.pizzaria.Models;

public class PizzariaModels {
	
	private String sabor;
	private String massa;
	private String tipoDeBorda;
	private int valor;
	
	public PizzariaModels() {
		
	}
	
	public PizzariaModels(String sabor, String massa, String tipoDeBorda, int valor) {
		this.sabor = sabor;
		this.massa = massa;
		this.tipoDeBorda = tipoDeBorda;
		this.valor = valor;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getMassa() {
		return massa;
	}
	public void setMassa(String massa) {
		this.massa = massa;
	}
	public String getTipoDeBorda() {
		return tipoDeBorda;
	}
	public void setTipoDeBorda(String tipoDeBorda) {
		this.tipoDeBorda = tipoDeBorda;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	@Override 
	public String toString() {
		StringBuilder modelo = new StringBuilder(); 
		modelo.append("/nSabor : " + this.sabor);
		modelo.append("/nMassa : " + this.massa);
		modelo.append("Tipo de Borda :" + this.tipoDeBorda);
		modelo.append("Valor : " + this.valor);
		
		return modelo.toString();
		
		
	}

}
