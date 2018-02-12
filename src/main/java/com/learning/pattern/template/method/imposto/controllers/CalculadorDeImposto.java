package com.learning.pattern.template.method.imposto.controllers;

import com.learning.pattern.template.method.imposto.Imposto;
import com.learning.pattern.template.method.imposto.models.Orcamento;

public class CalculadorDeImposto {

    public double realizaCalculo(Orcamento orcamento, Imposto imposto){
	double valor = imposto.calcula(orcamento);
	return valor;
    }
}
