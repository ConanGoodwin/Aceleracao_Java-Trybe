package trybe.main;

import java.util.Locale;
import java.util.Scanner;

public class ConverteBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ler a entrada de um número pelo console
	    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

	    System.out.println("Digite um número:");
	    byte valor = scan.nextByte();

	    // Seu código aqui
	    int qtdBits = valor * 8;
			
	    // Imprime a saída no console. OBS: descomente a próxima linha
	    System.out.println(valor + " bytes correspondem a " + qtdBits + " bits");
	}

}
