package JavaPOO;

public class Pessoa {
		String nome;
		int idade;
		double altura;
		String genero;
		
		
		public void comer() {
			System.out.println("Começou a comer!");
		
		}
		
		public void comendo(String comida) {
			System.out.printf("%s está comendo %s", nome, comida);
		}
		
		public void exibir() {
			System.out.printf("%s tem %s anos, %s de altura e é do gênero %s\n", nome, idade, altura, genero);
			
			System.out.printf("Nome: %s\n"
					+ "Idade: %d \n"
					+ "Altura: %.2f \n"
					+ "Gênero: %s\n", nome, idade, altura, genero);
		}
}