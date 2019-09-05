package br.com.ciandt.joycelf.abstratas;

public abstract class Calculadora {
	
	public int soma(int PrimeiroNumero, int SegundoNumero) {
		return PrimeiroNumero + SegundoNumero;
	}
	
	public int subtracao(int PrimeiroNumero, int SegundoNumero) {
		return PrimeiroNumero - SegundoNumero;
	}
	
	public int divisao(int PrimeiroNumero, int SegundoNumero) {
		return PrimeiroNumero / SegundoNumero;
	}
	
	public int multiplicaçao(int PrimeiroNumero, int SegundoNumero) {
		return PrimeiroNumero * SegundoNumero;
	}
}
