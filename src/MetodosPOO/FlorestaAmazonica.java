package MetodosPOO;

public class FlorestaAmazonica {
	
	public static void main(String[] args) {
		
		Elefante e1 = new Elefante();
		e1.nome = "tinho";
		Elefante e2 = new Elefante("binho");
		Elefante e3 = new Elefante("zinho");
		
		System.out.println(e1.nome);
		System.out.println(e2.nome);
		System.out.println(e3.nome);
		
		
	}

}
