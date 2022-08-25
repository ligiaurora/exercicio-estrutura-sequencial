package Exercicio09;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double f = 0;
		System.out.print("Digite temperatura em Farenheit:");
		f = entrada.nextDouble();
		
		double c = (5 *(f-32) / 9);
		System.out.print("A temperatura em Celsius:" +c+"° graus");
		entrada.close();		
	}
}
