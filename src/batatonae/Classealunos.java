package batatonae;

public class Classealunos {
	String nomeAt; // Abaixo da classs é atributo e não variável
	float notaAt;
	String cursoAt;
	
	//Método
	public void MostrarNomeMet() {
		System.out.println(this.nomeAt);
	}
	public void MostrarNotaMet() {
		System.out.println(this.notaAt);
	}
	public void MostrarCursoMet() {
		System.out.println(this.cursoAt);
	}
	public void ReceberNomeMet(String nomePar) {
		this.nomeAt = nomePar;
	}
	public void ReceberNotaMet(float notaPar) {
		this.notaAt = notaPar;
	}
	public void ReceberCursoMet(String cursoPar) {
		this.cursoAt = cursoPar;
	}
}
