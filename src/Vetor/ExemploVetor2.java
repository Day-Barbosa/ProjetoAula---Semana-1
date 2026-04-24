package Vetor;

import java.util.Scanner;

public class ExemploVetor2 {

	public static void main(String[] args) {
	
		int vetorNumeros [] = new int [3];
		Scanner leia = new Scanner(System.in);
		
		for (int indice = 0; indice <3; indice++) {
			System.out.println("Digite um número: ");
			vetorNumeros [indice] = leia.nextInt();
			
		for (int indice1 = 0; indice1 <3; indice1++) {
			  System.out.println((indice1 + 1) + ("º elemento: " + vetorNumeros[indice1]));
		}
			
		}
		
		
		
	}

}
