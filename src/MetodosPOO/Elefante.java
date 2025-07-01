package MetodosPOO;

public class Elefante {
	String cor;
	String nome; //Static String nome -> ultimo valor atribuido subescreve tudo (Floresta Amazonica) -> result: "zinho"
	public Elefante() {
		
	}
	public Elefante(String nome) {
		this.nome = nome;
	}
	final void comer() {
		System.out.println("Meu elefante");
	}

}
