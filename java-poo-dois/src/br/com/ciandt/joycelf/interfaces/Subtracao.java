package br.com.ciandt.joycelf.interfaces;

public class Subtracao implements OperacaoMatematica {
	public Subtracao(int primeiroNumero, int segundoNumero) {
		calcula(primeiroNumero, segundoNumero);
	}
	
	@Override
	public void calcula(int primeiroNumero, int segundoNumero) {
		System.out.println(primeiroNumero - segundoNumero);
	}
}
