package src;

public class Fidelidade {
	
	String numero;
	int pontos;
	String nivel;
	
	// 1° MÁXIMA DO 0.0 = ENCAPSULAMENTO
	public Fidelidade() {
		setNumero("");
		setPontos(0);
		setNivel("");
	}
	//2º MÁXIMA DO 0.0 = SOBRECARGA
	public Fidelidade(String numero, int pontos, String nivel) {
		setNumero(numero);
		setPontos(pontos);
		setNivel(nivel);
	}
	
	// Métodos modificadores
	public void setNumero(String numero) {
		this.numero = numero;
	} // Fim do setNumero
	public String getNumero() {
		return this.numero;
	} // Fim do getNumero
	
	public void setPontos(int pontos) {
		this.pontos = pontos;
	} // Fim do setPontos
	public int getPontos() {
		return this.pontos;
	} // Fim do getPontos
	
	public void setNivel(String nivel) {
		this.nivel = nivel;
	} // Fim do setNivel
	public String nivel() {
		return this.nivel;
	} // Fim do getNivel

} // Fim da classe
