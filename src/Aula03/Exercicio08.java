package Aula03;

public class Exercicio08 {
	public static void main(String[] args) {
		double soma3 = 0, soma5 = 0, somatotal = 0;
		for (int a = 1; a <= 20; a ++) {
			soma3 += a%3==0 ? a : 0;
			soma5 += a%5==0 ? a : 0;
			
		}
		somatotal = soma3 + soma5;
		System.out.printf("A soma dos múltiplos de 3: " + soma3 + "A soma dos múltiplos de 5: " + soma5 + "A soma total deles é: " + somatotal);
		

}
}
