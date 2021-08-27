package classificacaoTriangulo;

import java.util.Scanner;

public class ClassificacaoTriangulo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double l1, l2, l3;

		System.out.println("**********CLASSIFICA��O DE UM TRI�NGULO PELO SEUS LADOS**********");
		System.out.println();
		System.out.println("Qual � a medida do lado 1? ");
		l1 = leitor.nextDouble();

		System.out.println("Qual � a medida do lado 2? ");
		l2 = leitor.nextDouble();

		System.out.println("Qual � a medida do lado 3? ");
		l3 = leitor.nextDouble();

		leitor.close();
		
		System.out.println();
		System.out.println("**********RESULTADO**********");
		System.out.println();
		

		if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {

			if (l1 == l2 && l1 == l3 && l2 == l3) {
				System.out.println("As medidas fornecidas s�o de um TRI�NGULO EQUIL�TERO!");
			}

			else if (l1 != l2 && l1 != l3 && l2 != l3) {
				System.out.println("As medidas fornecidas s�o de um TRI�NGULO ESCALENO!");
			}

			else {
				System.out.println("As medidas fornecidas s�o de um TRI�NGULO IS�SCELES!");
			}

		} else {
			System.out.println("As medidas informadas n�o podem formar um tri�ngulo!");
		}
					
		System.out.println("**********FIM**********");
		
	}
}
