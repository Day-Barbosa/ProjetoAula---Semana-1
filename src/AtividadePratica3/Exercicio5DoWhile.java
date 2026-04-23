package AtividadePratica3;

import java.util.Scanner;

public class Exercicio5DoWhile {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero, soma = 0, contador = 0;
        String continuar = "S";

        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();

            if (numero > 0) {
                soma += numero;
            }

            contador++;

            if (contador >= 2) {
                System.out.print("Deseja continuar? (S/N): ");
                continuar = leia.next();
            }

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("\nA soma dos números positivos é: " + soma);

    }
}