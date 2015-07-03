package br.edu.iftm.prova;

import java.util.Scanner;

public class ProgImposto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double aliquotaimposto = 60;
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Informe o valor do produto importado: ");
		double valorprodutodolar = Double.parseDouble(entrada.nextLine());
		
		System.out.println("informe o valor do dolar:");
		double cotacaodolar = Double.parseDouble(entrada.nextLine());
		
		double valorprodutoreais=valorprodutodolar * cotacaodolar;
		
		if (valorprodutodolar<50){
			System.out.println("produto não tributado");
		}
		else
			{
						
			double valorimposto = valorprodutoreais * aliquotaimposto /100 ;
			System.out.println("o valor do imposto em reais é  : R$ "+valorimposto);
		}
		
	}
}
		
		

	

