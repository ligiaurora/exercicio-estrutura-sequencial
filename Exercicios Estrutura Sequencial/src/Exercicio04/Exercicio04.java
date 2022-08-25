package Exercicio04;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1 = 0;
		System.out.print("Informe a primeira nota:");
		nota1 = entrada.nextDouble();
		
		double nota2 = 0;
		System.out.print("Informe a segunda nota:");
		nota2 = entrada.nextDouble();
		
		double nota3 = 0;
		System.out.print("Informe a terceira nota:");
		nota3 = entrada.nextDouble();
		
		double nota4 = 0;
		System.out.print("Informe a quarta nota:");
		nota4 = entrada.nextDouble();

		double media = nota1 + nota2 + nota3 + nota4;
		System.out.println("A média do aluno(a): "+media/4);
		
		entrada.close();		
	}
}
