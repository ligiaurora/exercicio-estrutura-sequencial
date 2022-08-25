package Exercicico06;

import java.util.Scanner;

public class Exercicico06 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double raio = 0;
		System.out.print("Digite o raio do circulo:");
		raio = entrada.nextDouble();
		
		double area = 3.14 * raio * raio;
		System.out.println("Valor da Área do Circulo: "+area);
		
		entrada.close();		
	}
}
