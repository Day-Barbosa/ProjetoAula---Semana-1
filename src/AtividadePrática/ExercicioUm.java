package AtividadePrática;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		float Salario, Abono, NovoSal;
		
		System.out.println ("Digite seu salário: ");
		Salario = leia.nextFloat();
		
		System.out.println ("Digite o abono: ");
		Abono = leia.nextFloat();

		NovoSal = Salario + Abono;
		System.out.println ("O novo salário é: R$ " + NovoSal);

		
				
		
	}

}
