package src;

public class Salas {
	
	int numero;
	int capacidade;
	String recursos;
	
	// 1° MÁXIMA DO 0.0 = ENCAPSULAMENTO
	public Salas() {
		setNumero(0);
		setCapacidade(0);
		setRecursos("");
	}
	
	//2º MÁXIMA DO 0.0 = SOBRECARGA
	public Salas(int numero, int capacidade, String recursos) {
		setNumero(numero);
		setCapacidade(capacidade);
		setRecursos(recursos);	
	}
	
	// Métodos modificadores
	
	public void setNumero(int numero) {
		this.numero = numero;
	} // Fim do setNumero
	public int getNumero() {
		return this.numero;
	} // Fim do getNumero
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	} // Fim so setCapacidade
	public int getCapacidade() {
		return this.capacidade;
	} // Fim do getCapacidade
	
	public void setRecursos(String recursos) {
		this.recursos = recursos;
	} // Fim do setRecursos
	public String recursos() {
		return this.recursos;
	} // Fim do getRecursos

}
