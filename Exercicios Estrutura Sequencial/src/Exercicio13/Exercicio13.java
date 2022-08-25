package Exercicio13;
import java.util.Scanner;


public class Exercicio13 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float pesopeixe = 0;
		System.out.print("Informe o Peso Peixe: ");
		pesopeixe = entrada.nextFloat();
		
		float excesso = 0;
		float multa = 0;
		if (pesopeixe > 50) {
			excesso = pesopeixe - 50;
			multa = excesso*4;
			System.out.println("Ouve um excedente de "+excesso+"KG");
			System.out.println("O valor da sua multa é: "+multa+" reais");
			
		} else {
			excesso = 50 - pesopeixe;
			System.out.println("Não ouve excesso de peso, ainda faltam: "+excesso+"KG para chegar no limite");
			System.out.println("Multa: "+multa+" reais");
		}
		
		entrada.close();
	}
}
