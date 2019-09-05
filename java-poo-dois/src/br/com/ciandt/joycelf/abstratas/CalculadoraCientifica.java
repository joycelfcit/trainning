package br.com.ciandt.joycelf.abstratas;

public class CalculadoraCientifica extends Calculadora {
	
	public double potencia(double numero, double expoente) {
		return Math.pow(numero, expoente);
	}
	
	public double raizQuadrada(double numero) {
		return Math.sqrt(numero);
	}
}
