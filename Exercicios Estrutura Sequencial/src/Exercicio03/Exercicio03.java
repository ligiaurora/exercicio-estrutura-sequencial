package Exercicio03;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeroum = 0;
		System.out.print("Informe um número:");
		numeroum = entrada.nextInt();
		
		int numerodois = 0;
		System.out.print("Informe um outro número:");
		numerodois = entrada.nextInt();
		
		int soma = numeroum + numerodois;
		System.out.println("A soma dos números: "+soma);
		
		entrada.close();		
	}
}
