package com.learning.pattern.template.method.imposto.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.learning.pattern.template.method.imposto.models.Item;
import com.learning.pattern.template.method.imposto.models.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional{

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
	return calculaPorcentagemPorItem(orcamento);
    }

    private double calculaPorcentagemPorItem(Orcamento orcamento) {
	System.out.println("Aplicando taxação para cada item");
	double total = 0;
	for(Item item : orcamento.getItens()){
	    total = total + (item.getValor() * 0.01);
    	}
	return total;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
	System.out.println("Aplicando máxima taxação por itens com mesmo nome");
	return (orcamento.getValor() * 0.13) + 100.0;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
	if(possuiDoisItensComMesmoNome(orcamento)) return true;
	return false;
    }

    private boolean possuiDoisItensComMesmoNome(Orcamento orcamento) {
	Set<String> nomesSemRepetir = new HashSet<>(); 
	List<Item> itens = orcamento.getItens();
	itens.stream().forEach(item -> {
	    nomesSemRepetir.add(item.getNome());
	});
	if(nomesSemRepetir.size() < itens.size()) return true;
	return false;
    }
    
   

}
