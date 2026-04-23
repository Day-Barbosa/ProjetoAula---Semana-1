package AtividadePrática;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
        float n1, n2, n3, n4, resultado;

        System.out.print("Número 1: ");
        n1 = leia.nextFloat();

        System.out.print("Número 2: ");
        n2 = leia.nextFloat();

        System.out.print("Número 3: ");
        n3 = leia.nextFloat();

        System.out.print("Número 4: ");
        n4 = leia.nextFloat();

        resultado = (n1 * n2) - (n3 * n4);

        System.out.println("Diferença: " + resultado);
		
	}

}
