package classificacaoTriangulo;

import java.util.Scanner;

public class ClassificacaoTriangulo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double l1, l2, l3;

		System.out.println("**********CLASSIFICAÇÃO DE UM TRIÂNGULO PELO SEUS LADOS**********");
		System.out.println();
		System.out.println("Qual é a medida do lado 1? ");
		l1 = leitor.nextDouble();

		System.out.println("Qual é a medida do lado 2? ");
		l2 = leitor.nextDouble();

		System.out.println("Qual é a medida do lado 3? ");
		l3 = leitor.nextDouble();

		leitor.close();
		
		System.out.println();
		System.out.println("**********RESULTADO**********");
		System.out.println();
		

		if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {

			if (l1 == l2 && l1 == l3 && l2 == l3) {
				System.out.println("As medidas fornecidas são de um TRIÂNGULO EQUILÁTERO!");
			}

			else if (l1 != l2 && l1 != l3 && l2 != l3) {
				System.out.println("As medidas fornecidas são de um TRIÂNGULO ESCALENO!");
			}

			else {
				System.out.println("As medidas fornecidas são de um TRIÂNGULO ISÓSCELES!");
			}

		} else {
			System.out.println("As medidas informadas não podem formar um triângulo!");
		}
					
		System.out.println("**********FIM**********");
		
	}
}
