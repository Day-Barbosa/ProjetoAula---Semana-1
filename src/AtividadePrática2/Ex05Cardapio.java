package AtividadePrática2;

import java.util.Scanner;

public class Ex05Cardapio {

	public static void main(String[] args) {

	       Scanner leia = new Scanner(System.in);
	       
	        System.out.print("Código do Produto: ");
	        int codigo = leia.nextInt();
	 
	        System.out.print("Quantidade: ");
	        int quantidade = leia.nextInt();
	 
	        String produto = "";
	        double preco = 0.0;
	 
	        switch (codigo) {
            case 1 -> { produto = "Cachorro Quente"; preco = 10.00; }
            case 2 -> { produto = "X-Salada";        preco = 15.00; }
            case 3 -> { produto = "X-Bacon";         preco = 18.00; }
            case 4 -> { produto = "Bauru";           preco = 12.00; }
            case 5 -> { produto = "Refrigerante";    preco =  8.00; }
            case 6 -> { produto = "Suco de laranja"; preco = 13.00; }
            default -> {
                System.out.println("Código de produto inválido!");
                
                return;
                
            }
        }
 
        double total = quantidade * preco;
 
        System.out.println("Produto: " + produto);
        System.out.printf("Valor total: R$ %.2f%n", total);
		
	}

}
