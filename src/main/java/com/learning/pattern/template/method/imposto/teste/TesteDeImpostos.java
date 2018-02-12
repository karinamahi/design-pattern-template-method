package com.learning.pattern.template.method.imposto.teste;

import com.learning.pattern.template.method.imposto.Imposto;
import com.learning.pattern.template.method.imposto.controllers.CalculadorDeImposto;
import com.learning.pattern.template.method.imposto.impl.ICPP;
import com.learning.pattern.template.method.imposto.impl.IHIT;
import com.learning.pattern.template.method.imposto.impl.IKCV;
import com.learning.pattern.template.method.imposto.models.Item;
import com.learning.pattern.template.method.imposto.models.Orcamento;

public class TesteDeImpostos {

    
    public static void main(String[] args) {
	Imposto ikcv = new IKCV();
	Imposto icpp = new ICPP();
	Imposto ihit = new IHIT();
	
	Orcamento orcamento = new Orcamento(500.0);
	CalculadorDeImposto calculador = new CalculadorDeImposto();
	double resultadoIkcv = calculador.realizaCalculo(orcamento, ikcv);
	double resultadoIcpp = calculador.realizaCalculo(orcamento, icpp);
	
	System.out.println("Resultado ICKV: " + resultadoIkcv);
	System.out.println("Resultado ICPP: " + resultadoIcpp);
	
	Item bicicleta = new Item("bicicleta", 400.0);
	Item bicicleta2 = new Item("bola", 400.0);
	
	orcamento.adicionaItem(bicicleta );
	orcamento.adicionaItem(bicicleta2);
	
	double resultadoIhit = calculador.realizaCalculo(orcamento, ihit);
	System.out.println("Resultado IHIT: " + resultadoIhit);
    }
}
