package AtividadePrática;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		float N1, N2, N3, N4, MÉDIA;
		
        System.out.print("Nota 1: ");
        N1 = leia.nextFloat();
        System.out.print("Nota 2: ");
        N2 = leia.nextFloat();
        System.out.print("Nota 3: ");
        N3 = leia.nextFloat();
        System.out.print("Nota 4: ");
        N4 = leia.nextFloat();
        
        MÉDIA = (N1 + N2 + N3 + N4)/4;
        System.out.println("Média final: " + MÉDIA);
        
	}

}
