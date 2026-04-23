package AtividadePrática2;

import java.util.Scanner;

public class Ex01Soma {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		 
        System.out.print("Digite o número A: ");
        int a = leia.nextInt();
 
        System.out.print("Digite o número B: ");
        int b = leia.nextInt();
 
        System.out.print("Digite o número C: ");
        int c = leia.nextInt();
 
        int soma = a + b;
 
        if (soma > c) {
            System.out.println(a + " + " + b + " = " + soma + " > " + c);
            System.out.println("A Soma de A + B é Maior do que C");
        } else if (soma < c) {
            System.out.println(a + " + " + b + " = " + soma + " < " + c);
            System.out.println("A Soma de A + B é Menor do que C");
        } else {
            System.out.println(a + " + " + b + " = " + soma + " = " + c);
            System.out.println("A Soma de A + B é Igual a C");
		
	}
		
	}

}
