package Aula04;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		double notas[] = new double[5];
		Scanner entrada = new Scanner(System.in);
		double media = 0;
		double soma = 0;
		
		for (int x = 0; x < notas.length; x++) {
		System.out.printf("Informe a %d nota: ", x + 1);
		notas[x] = entrada.nextDouble();
		
		}
		
		for (double nota: notas) {
			soma += nota;
		}
		
		media = soma / 5;
		System.out.printf("A média é: " + media);
		
		
		
		
		
	}

}
