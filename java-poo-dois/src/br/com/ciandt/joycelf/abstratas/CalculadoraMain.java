package br.com.ciandt.joycelf.abstratas;

public class CalculadoraMain {
	public static void main(String[] args) {
		CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();
		
		System.out.println(calculadoraCientifica.raizQuadrada(4));
		System.out.println(calculadoraCientifica.soma(5, 10));
		System.out.println(calculadoraCientifica.divisao(5, 5));
		System.out.println(calculadoraCientifica.potencia(5, 2));
		System.out.println(calculadoraCientifica.subtracao(5, 2));
	}
}
