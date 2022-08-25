package Exercicio02;
import java.util.Scanner;


public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		System.out.print("Informe um número:");
		numero = entrada.nextInt();
		
		System.out.println("O número informado foi: "+numero);
		entrada.close();
	}
}
