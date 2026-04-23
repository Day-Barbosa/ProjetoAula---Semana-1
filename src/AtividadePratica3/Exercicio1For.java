package AtividadePratica3;

import java.util.Scanner;

public class Exercicio1For {
	
		    public static void main(String[] args) {

		        Scanner leia = new Scanner(System.in);

		        int inicio, fim;

		        System.out.print("Digite o primeiro número: ");
		        inicio = leia.nextInt();

		        System.out.print("Digite o último número: ");
		        fim = leia.nextInt();

		        if (inicio >= fim) {
		            System.out.println("Intervalo inválido!");
		        } else {
		            for (int i = inicio; i <= fim; i++) {
		                if (i % 3 == 0 && i % 5 == 0) {
		                    System.out.println(i + " é múltiplo de 3 e 5");
		                }
		            }
		        }
		    }
		
	}