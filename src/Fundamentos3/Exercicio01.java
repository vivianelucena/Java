package Fundamentos3;

public class Exercicio01 {
	public static void main(String[] args) {
		String s = new String();
		/*char caracteres[] = {"a", "b"};*/
		String str = "Hewwo!";
		String resultado = str.replace("w", "l");
		System.out.println(resultado);
		
		
		
		String oi = "Oi";
		String mundo = "Mundo!";
		
		String finall = oi + " " + mundo;
		System.out.println(finall);
		System.out.printf(oi + " " + mundo);
		
		
		System.out.println();
		
		String subS = "Hello World";
		String result = subS.substring(6);
		System.out.println(result);
		String resul = subS.substring(3, 8);
		System.out.println(resul);
		
		System.out.println(subS.toUpperCase());
		System.out.println(subS.toLowerCase());
	}

}
