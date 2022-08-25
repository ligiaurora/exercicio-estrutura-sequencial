package Exercicio05;
import java.util.Scanner;


public class Exercicio05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float num = 0;
		System.out.print("Digitar o número em metros:");
		num = entrada.nextFloat();
		
		float cm = num * 100;
		System.out.println("O número em centimetros: "+cm+"cm");
		entrada.close();
	}
}
