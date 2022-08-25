package Exercicio16;
import java.util.Scanner;

public class Exercicio16 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double area = 0;
		System.out.print("Informe o tamanho em metros quadrados da area a ser pintada: ");
		area = entrada.nextDouble();
		
		double litros = area/6;
		int latatinta = (int) (litros / 18);
		
			if (latatinta == 0) {
				latatinta = 1;
			}
				
		double preco18 = latatinta*80;
		
		int latatinta36 = (int) (litros / 3.6);
		
			if (latatinta36 == 0) {
				latatinta36 = 1;
			}
				
		double preco36 = (double) (latatinta36 *25);

		if (latatinta == 1) {
			System.out.println("1 lata de 18l é o suficinte para "+area+" metros quadrados");
			System.out.println("O total a pagar (Latas 18litros): "+preco18);
		} else {			
			System.out.println(latatinta+" latas de 18litros são o suficiente para "+area+"metros quadrados");
			System.out.println("total a pagar (Latas 18litros): "+preco18);
		}
		
		if (latatinta36 == 1) {
			System.out.println("1 lata de 3,6litros é o suficinte para "+area+"metros quadrados");
			System.out.println("total a pagar (Latas 3,6litros): "+preco36);
		} else {			
			System.out.println(latatinta36+" latas de 3,6litros são o suficiente para "+area+"metros quadrados");
			System.out.println("total a pagar (Latas 3,6litros): "+preco36);
		}
		entrada.close();
	}
}
