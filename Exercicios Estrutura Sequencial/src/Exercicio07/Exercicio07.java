package Exercicio07;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double quadrado = 0;
		System.out.print("Digite o valor do lado do quadrado:");
		quadrado = entrada.nextDouble();
		
		double area = quadrado * quadrado;
		System.out.println("Valor da Área do Circulo: "+area);
		
		entrada.close();		
	}
}
