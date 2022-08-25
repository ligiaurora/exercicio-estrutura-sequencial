package Exercicio15;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double area = 0;
		System.out.print("Informe o tamanho em metros quadrados da area a ser pintada: ");
		area = entrada.nextDouble();
		
		double litros = area/3;
		int latatinta = (int) (litros / 18);
		
		if (latatinta == 0) {
			latatinta = 1;
		}
		
		double sobra = (18*latatinta) - litros;
		double preco = latatinta*80;
		
		if (latatinta == 1) {
			System.out.println("1 lata é o suficinte para "+area+"em metros quadrados");
			System.out.println("O total da sobra é de: "+sobra+" Litros");
			System.out.println("O total a pagar: "+preco);
		} else {			
			System.out.println(latatinta+" são o suficiente para "+area+" metros quadrados");
			System.out.println("Sobra um total de: "+sobra+" litros");
			System.out.println("O total a pagar: "+preco);
		}
		entrada.close();
	}
}
