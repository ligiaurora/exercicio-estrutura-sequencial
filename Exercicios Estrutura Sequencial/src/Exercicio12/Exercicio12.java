package Exercicio12;
import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float altura = 0;
		System.out.print("Informe a sua altura:");
		altura = entrada.nextFloat();

		float peso = 0;
		System.out.print(" Digite o seu peso atual:");
		peso = entrada.nextFloat();

		boolean sexo;
		System.out.print(" Voc� � mulher?(true or false):");
		sexo = entrada.nextBoolean();

		float peso_idealf = 0;
		float peso_idealm = 0;

		if (sexo == true) {
			peso_idealf = (float) ((altura * 62.1) - 44.7);

		System.out.print(" Voc� � do sexo feminino, sua altura � de: " + altura + " seu peso atual �:" + peso);

		if (peso_idealf > peso) {
			System.out.print(" Voc� est� acima do seu peso ideal");

		} else if (peso_idealf < peso) {
			System.out.print(" Voc� est� abaixo do seu peso ideal");
		} else
				System.out.print(" Voc� est� no seu peso ideal!");
		} else { 
			peso_idealf = (float) ((altura * 72.7) - 58);
			
		System.out.print(" Voc� � do sexo masculino, sua altura � de: " + altura + " seu peso atual �:" + peso);
		if (peso_idealm>peso) {
			System.out.print(" Voc� est� acima do seu peso ideal");
		} else if (peso_idealf < peso) {
			System.out.print(" Voc� est� abaixo do seu peso ideal");
		} else 
			System.out.print(" Voc� est� no seu peso ideal!");
		}
	entrada.close();
	}
}
