package br.com.ciandt.joycelf.interfaces;

import java.util.Scanner;

public class OperacaoMatematicaMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int primeiroNumero, segundoNumero;
		
		System.out.println("Vamos somar! digite o primeiro e o segundo valor:");
		primeiroNumero = sc.nextInt();
		segundoNumero = sc.nextInt();
		Soma soma = new Soma(primeiroNumero, segundoNumero);
		
		System.out.println("Vamos subtrair! digite o primeiro e o segundo valor:");
		primeiroNumero = sc.nextInt();
		segundoNumero = sc.nextInt();
		Subtracao subtracao = new Subtracao(primeiroNumero, segundoNumero);
		
		System.out.println("Vamos multiplicar! digite o primeiro e o segundo valor:");
		primeiroNumero = sc.nextInt();
		segundoNumero = sc.nextInt();
		Multiplicacao multiplicacao = new Multiplicacao(primeiroNumero, segundoNumero);
		
		System.out.println("Vamos Dividir! digite o primeiro e o segundo valor:");
		primeiroNumero = sc.nextInt();
		segundoNumero = sc.nextInt();
		Divisao divisao = new Divisao(primeiroNumero, segundoNumero);
	}
}
