package Exercicio10;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1 = 0;
		System.out.print("Digite o hor�rio de entrada no servi�o:");
		num1 = entrada.nextInt();
		
		int num2 = 0;
		System.out.print("Digite o hor�rio de saida no servi�o:");
		num2 = entrada.nextInt();
		
		float num3 = 0;
		System.out.print("Digite o hor�rio de saida no servi�o:");
		num3 = entrada.nextFloat();
	
		float produto = ((num2*3)+ num3);
		System.out.print("Valor do Produto:"+produto);
		produto = entrada.nextFloat();
		
		float soma = ((num1*2)*(num2/2));
		System.out.print("Valor da soma:"+soma);
		soma = entrada.nextFloat();
		
		float cubo = (num3*num3*num3);
		System.out.print("Valor do terceiro numero ao cubo:"+cubo);
		cubo = entrada.nextFloat();
	
		entrada.close();		
	}
}
