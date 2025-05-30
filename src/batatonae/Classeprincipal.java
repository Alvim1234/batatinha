package batatonae;

public class Classeprincipal {

	public static void main(String[] args) {

		Classealunos batataObj = new Classealunos(); // Objeto 1
		Classealunos cenouraObj = new Classealunos(); // Objeto 2
		
		// Funciona, mas está errado
		batataObj.nomeAt = "Mikael";
		batataObj.cursoAt = "Informática";
		batataObj.notaAt = 8.5F;
		
		System.out.println(batataObj.nomeAt); // sysout CTRL + SPACE
		System.out.println(batataObj.cursoAt);
		System.out.println(batataObj.notaAt);
	}

}
