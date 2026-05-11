package src;

public class Filme {
	
	String titulo;
	String genero;
	Float duracao; 
	int classificacaoIndicativa;
	
	//1° MÁXIMA DO 0.0 = ENCAPSULAMENTO
	public Filme() {
	setTitulo("");
	setGenero("");
	setDuracao(0f);
	setClassificacaoIndicativa(0);
	}
	
	//2º MÁXIMA DO 0.0 = SOBRECARGA
	public Filme(String titulo, String genero, Float duracao, int classificacaoindicativa) {
		setTitulo(titulo);
		setGenero(genero);
		setDuracao(duracao);
		setClassificacaoIndicativa(classificacaoindicativa);
		}
	
	// Métodos modificadores
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	} // Fim do setTitulo
	public String getTitulo() {
		return this.titulo;
		} // Fim do getTitulo
	
	public void setGenero(String genero) {
		this.genero = genero;
	} // Fim do setGenero
	public String getGenero() {
		return this.genero;
	} // Fim do getGenero
	
	public void setDuracao(Float duracao) {
		this.duracao = duracao;
	} // Fim do setDuracao
	public Float getDuracao() {
		return this.duracao;
	} // Fim do getDuracao
	
	public void setClassificacaoIndicativa(int classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	} // Fim do setClassificacaoIndicativa
	public int getClassificacaoIndicativa() {
		return this.classificacaoIndicativa;
	} // Fim do getClassificacaoIndicativa
	
	public String imprimir() {
		return "Titulo: " + getTitulo() +
			   "\nGenero: " + getGenero() +
			   "\nDuracao: " + getDuracao();
	} // Fim do imprimir

} // Fim da classe
