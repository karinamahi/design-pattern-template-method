package com.learning.pattern.template.method.imposto.impl;

import com.learning.pattern.template.method.imposto.models.Item;
import com.learning.pattern.template.method.imposto.models.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional{

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
	return orcamento.getValor() * 0.06;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
	return orcamento.getValor() * 0.10;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
	if(orcamento.getValor() > 500 && possuiItemComValorSuperiorACem(orcamento)) return true;
	return false;
    }

    private boolean possuiItemComValorSuperiorACem(Orcamento orcamento) {
	for(Item item : orcamento.getItens()){
	    if(item.getValor() > 100) return true;
	}
	return false;
    }

}
