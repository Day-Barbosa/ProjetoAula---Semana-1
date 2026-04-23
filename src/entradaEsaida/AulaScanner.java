package entradaEsaida;

import java.util.Scanner;

public class AulaScanner {

	public static void main(String[] args) {

		//Declaração de Variaveis
		Scanner leia = new Scanner (System.in);
		String nome;
		
		//Entrada de Dados
		System.out.println ("Digite seu nome: ");
		
		//Processamento
		nome = leia.nextLine ();
		
		// Saída de Dados
		System.out.println ("Bom dia, " + nome);  // (+) concatenar

	}

}
