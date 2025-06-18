package Aula03;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		int numA[] = new int[4];
		int numB[] = new int[4];
		int numC[] = new int[4];
		int numD[] = new int[4];
		Scanner entrada = new Scanner(System.in);
		int tamanho = numA.length;
		
		for (int x = 0; x < tamanho; x++) {
			System.out.println("Digite o valor de A: ");
			numA[x] = entrada.nextInt();
			System.out.println("Digite o valor de B: ");
			numB[x] = entrada.nextInt();
			System.out.println("Digite o valor de C: ");
			numC[x] = entrada.nextInt();
			System.out.println("Digite o valor de D: ");
			numD[x] = entrada.nextInt();
		}
		entrada.close();

}
}