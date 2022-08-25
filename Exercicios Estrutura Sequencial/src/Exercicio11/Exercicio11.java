package Exercicio11;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float altura = 0;
		System.out.print("Informe a sua altura:");
		altura = entrada.nextFloat();

		float peso_ideal = (float) ((altura * 72.7) - 58);
		System.out.println("Peso Ideal: "+peso_ideal);
		
		entrada.close();		
	}
} 