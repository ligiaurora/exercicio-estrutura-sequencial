package Exercicio14;
import java.util.Scanner;

public class Exercicio14 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double entradahora = 0;
		System.out.print("Digite o horário de entrada no serviço:");
		entradahora = entrada.nextDouble();
		
		double saidahora = 0;
		System.out.print("Digite o horário de saida no serviço:");
		saidahora = entrada.nextDouble();
	
		double salario = ((saidahora-entradahora)*30);
		System.out.println("Seu sálario bruto em um mês é equivalente: "+salario+" reais");
		
		double iRenda = (salario/100)*11;
		double inss = (salario/100)*8;
		double sindicado = (salario/100)*5;
			System.out.println("Descontando para Imposto de Renda um total de: "+iRenda+" reais");
			System.out.println("Descontando para INSS um total de: "+inss+" reais");
			System.out.println("Descontando para Sindicato um total de: "+sindicado+" reais");
		
		double salariodescont = ((salario - iRenda)-inss)-sindicado;
			System.out.println("Salário com descontos é equivalente: "+salariodescont+" reais");
		entrada.close();		
	}

}
