package com.learning.pattern.template.method.imposto.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private final double valor;
    private List<Item> itens = new ArrayList<>();
	
    public Orcamento(double valor){
	this.valor = valor;
    }
	
    public double getValor() {
	return valor;
    }
    
    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }
    
    public void adicionaItem(Item item){
	itens.add(item);
    }
}
