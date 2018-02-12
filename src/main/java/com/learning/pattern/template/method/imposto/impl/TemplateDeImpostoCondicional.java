package com.learning.pattern.template.method.imposto.impl;

import com.learning.pattern.template.method.imposto.Imposto;
import com.learning.pattern.template.method.imposto.models.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto{

    public double calcula(Orcamento orcamento) {
	 if(deveUsarMaximaTaxacao(orcamento)) {
	     return maximaTaxacao(orcamento);
	 } else {
	     return minimaTaxacao(orcamento);
	 }
    }

    public abstract double minimaTaxacao(Orcamento orcamento);
    public abstract double maximaTaxacao(Orcamento orcamento);
    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
