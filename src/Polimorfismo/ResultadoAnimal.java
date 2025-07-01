package Polimorfismo;

public class ResultadoAnimal {
	public static void main(String[] args) {
		Cavalos cavalo1 = new Cavalos();
		
		cavalo1.nome = "Zinho ";
		
		System.out.printf(cavalo1.nome);
		cavalo1.Comer("capim");
		System.out.println();
		cavalo1.Comer("Alfred", "capim");
	}

}
