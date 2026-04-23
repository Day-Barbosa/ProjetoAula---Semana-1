package entradaEsaida;

import java.util.Scanner;

public class AulaOperadores {

	public static void main(String[] args) {
	
		//Declaração de variaveis
		float Celsius, Fahrenheit;
		Scanner leia = new Scanner (System.in);
		
		//Entrada de Dados
		System.out.println ("Insira a temperatura em celsius: ");
		Celsius = leia.nextFloat();

		//Processamento
		Fahrenheit =  Celsius * 1.8f + 32;
		
		//Saida de dados
		System.out.println ("A temperatura em Fahrenheit é: " + Fahrenheit);
	}

}
