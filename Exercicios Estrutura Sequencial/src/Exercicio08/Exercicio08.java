package Exercicio08;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double entradahora = 0;
		System.out.print("Digite o hor�rio de entrada no servi�o:");
		entradahora = entrada.nextDouble();
		
		double saidahora = 0;
		System.out.print("Digite o hor�rio de saida no servi�o:");
		saidahora = entrada.nextDouble();
	
		double salario = ((saidahora-entradahora)*30);
		System.out.println("Seu s�lario em um m�s � equivalente: "+salario+" reais");
		
		entrada.close();		
	}
}
