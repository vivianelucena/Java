package Polimorfismo;

public class Cavalos extends Animal{
	
		public void Cavalos(String nome) {
			this.nome = nome;
		}
		
		public void Comer(String comida) {
			System.out.printf("Está comendo %s", comida);
		}
		
		public void Comer(String nome, String comida) {
			System.out.printf("%s está comendo %s", nome, comida);
		}
	
		

	

}
