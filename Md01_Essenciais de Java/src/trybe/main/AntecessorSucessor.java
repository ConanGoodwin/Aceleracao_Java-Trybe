package trybe.main;

import java.util.Scanner;

public class AntecessorSucessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

	    System.out.println("Digite um número:");
	    int numero = scan.nextInt();

	    // Seu código aqui
	    int antecessor = numero - 1;
	    int sucessor = numero + 1;

	    // Imprime a saída no console. OBS: descomente a próxima linha
	    System.out.println("O número " + numero + " tem " + antecessor + " como seu antecessor e "
	        + sucessor + " como seu sucessor.");
	}

}
