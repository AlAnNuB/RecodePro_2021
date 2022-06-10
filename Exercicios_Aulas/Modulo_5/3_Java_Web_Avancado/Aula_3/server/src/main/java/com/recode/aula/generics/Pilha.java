package com.recode.aula.generics;

public class Pilha<T> {
	
	class NoPilha<T>{
		T dado;
		NoPilha<T> proximo;
	}
	
	NoPilha<T> topo = null;
	
	public void empilhar(T dado) {
		NoPilha<T> novo = new NoPilha<>();
		novo.dado = dado;
		novo.proximo = topo;
		topo = novo;		
	}
	
	public T desempilhar() {
		if(topo==null)
			return null;
		T dado = topo.dado;
		topo = topo.proximo;
		return dado;
	}

}
