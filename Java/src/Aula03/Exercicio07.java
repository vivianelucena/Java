package Aula03;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sala? ");
		int alunos = entrada.nextInt();
		double soma = 0;
		
		for (int a = 0; a < alunos; a++) {
			System.out.println("Digite a nota do aluno: ");
			double nota = entrada.nextInt();
			soma = soma + nota;
			
		}
		
		double media = soma/alunos;
		System.out.println(media);
		
	}

}