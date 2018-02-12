package com.learning.pattern.template.method.imposto.impl;

import com.learning.pattern.template.method.imposto.models.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
	return orcamento.getValor() * 0.05;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
	return orcamento.getValor() * 0.07;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
	if (orcamento.getValor() >= 500) return true;
	return false;
    }

}
