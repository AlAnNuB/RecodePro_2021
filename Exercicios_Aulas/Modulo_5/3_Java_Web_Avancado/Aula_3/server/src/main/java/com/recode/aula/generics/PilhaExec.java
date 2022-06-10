package com.recode.aula.generics;

public class PilhaExec {

	public static void main(String args[]) {
		Pilha<String> pilha1 = new Pilha<>();
		Pilha<Integer> pilha2 = new Pilha<>();
		
		pilha1.empilhar("UM");
		pilha1.empilhar("DOIS");
		pilha1.empilhar("TRES");
		
		pilha2.empilhar(1);
		pilha2.empilhar(2);
		pilha2.empilhar(3);
		
		String valor;
		while((valor=pilha1.desempilhar())!=null)
			System.out.println(valor);
		
	}
}
