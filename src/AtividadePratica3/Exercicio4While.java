package AtividadePratica3;

import java.util.Scanner;

public class Exercicio4While {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int idade, genero, dev, total = 0, somaIdade = 0;
        int backend = 0, mulheresFrontend = 0, homensMobile40 = 0, nbFullstack30 = 0;

        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {

            System.out.print("Idade: ");
            idade = leia.nextInt();

            System.out.print("Identidade de Gênero (1-6): ");
            genero = leia.nextInt();

            System.out.print("Pessoa Desenvolvedora (1-4): ");
            dev = leia.nextInt();

            total++;
            somaIdade += idade;

            if (dev == 1) {
                backend++;
            }

            if ((genero == 1 || genero == 4) && dev == 2) {
                mulheresFrontend++;
            }

            if ((genero == 2 || genero == 5) && dev == 3 && idade > 40) {
                homensMobile40++;
            }

            if (genero == 3 && dev == 4 && idade < 30) {
                nbFullstack30++;
            }

            System.out.print("Deseja continuar (S/N): ");
            continuar = leia.next();
        }

        System.out.println("\nTotal Backend: " + backend);
        System.out.println("Mulheres Frontend: " + mulheresFrontend);
        System.out.println("Homens Mobile > 40: " + homensMobile40);
        System.out.println("NB FullStack < 30: " + nbFullstack30);
        System.out.println("Total pessoas: " + total);

        if (total > 0) {
            System.out.println("Média de idade: " + (somaIdade / (float) total));
        }

    }
}