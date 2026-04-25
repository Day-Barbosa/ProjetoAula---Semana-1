package AtividadePratica4;

import java.util.Scanner;

public class Exercicio2_Vetores {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int[] vetor = new int[10];

		
		for (int contador = 0; contador < vetor.length; contador++) {
			System.out.print("Digite o " + (contador + 1) + "º número: ");
			vetor[contador] = leia.nextInt();
		}

		
		// Elementos nos índices ímpares
		System.out.println("\nElementos nos índices ímpares:");
		for (int contador = 0; contador < vetor.length; contador++) {
			if (contador % 2 != 0) {
				System.out.print(vetor[contador] + " ");
			}
		}

		// Elementos pares
		System.out.println("\n\nElementos pares:");
		for (int contador = 0; contador < vetor.length; contador++) {
			if (vetor[contador] % 2 == 0) {
				System.out.print(vetor[contador] + " ");
			}
		}

		// Soma e Média
		int soma = 0;
		for (int contador = 0; contador < vetor.length; contador++) {
			soma += vetor[contador];
		}

		double media = (double) soma / vetor.length;

		System.out.println("\n\nSoma: " + soma);
		System.out.printf("Média: %.2f%n", media);

	}
}