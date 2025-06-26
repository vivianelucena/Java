package JavaPOO;

public class TestePessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.nome = "Ana";
		p1.altura = 1.7;
		p1.genero = "feminino";
		p1.idade = 25;
		
		p1.exibir();
		
		p1.comer();
		p2.comer();
		
		p1.comendo("Empadão");
		System.out.println();
		
		p2.nome = "Paulo";
		p2.altura = 1.9;
		p2.genero = "não binário";
		p2.idade = 35;
		
		p2.exibir();
	}
}
