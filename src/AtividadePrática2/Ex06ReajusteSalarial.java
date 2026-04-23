package AtividadePrática2;

import java.util.Scanner;

public class Ex06ReajusteSalarial {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.print("Nome do colaborador: ");
		String nome = leia.nextLine();

		System.out.print("Cargo: ");
		int codigoCargo = leia.nextInt();

		System.out.print("Salário: R$ ");
		float salario = leia.nextFloat();

		String cargo = "";
		double reajuste = 0.0;

		switch (codigoCargo) {
			case 1 -> { cargo = "Gerente";        reajuste = 0.10; }
			case 2 -> { cargo = "Vendedor";       reajuste = 0.07; }
			case 3 -> { cargo = "Supervisor";     reajuste = 0.09; }
			case 4 -> { cargo = "Motorista";      reajuste = 0.06; }
			case 5 -> { cargo = "Estoquista";     reajuste = 0.05; }
			case 6 -> { cargo = "Técnico de TI";  reajuste = 0.08; }
			default -> {
				System.out.println("Código de cargo inválido!");
				leia.close();
				return;
			}
		}

		double novoSalario = salario + (reajuste * salario);

		System.out.println("Nome do colaborador: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.printf("Salário: R$ %.2f%n", novoSalario);

		leia.close();
	}
}