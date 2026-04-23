package AtividadePratica3;

import java.util.Scanner;

public class Exercicio2For {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero, pares = 0, impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = leia.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

    }
}