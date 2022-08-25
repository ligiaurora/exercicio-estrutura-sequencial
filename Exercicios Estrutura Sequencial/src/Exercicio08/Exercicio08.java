package Exercicio08;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double entradahora = 0;
		System.out.print("Digite o horário de entrada no serviço:");
		entradahora = entrada.nextDouble();
		
		double saidahora = 0;
		System.out.print("Digite o horário de saida no serviço:");
		saidahora = entrada.nextDouble();
	
		double salario = ((saidahora-entradahora)*30);
		System.out.println("Seu sálario em um mês é equivalente: "+salario+" reais");
		
		entrada.close();		
	}
}
