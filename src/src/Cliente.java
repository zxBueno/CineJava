package src;

import java.time.LocalDate;

public class Cliente {
	private int codigo;
	private String nome;
	private String CPF;
	private LocalDate dtNascimento;
	
	//1º MÁXIMA DO 0.0 = ENCAPSULAMENTO
	public Cliente(){
		setCodigo(0);
		setNome("");
		setdtNascimento(LocalDate.now());
	}
	
	//2º MÁXIMA DO 0.0 = SOBRECARGA
	public Cliente(int codigo, String nome, String CPF, LocalDate dtNascimento) {
		setCodigo(codigo);
		setNome(nome);
		setCPF(CPF);
		setdtNascimento(dtNascimento);
	}
	
	//METODOS MODIFICADORES
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}//FIM DO SET CODIGO
	public int getCodigo() {
		return this.codigo;
	}//FIM DO GET CODIGO
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}//Fim do set nome
	public String getNome() {
		return this.nome;
	}//fim do get nome
	
	
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}//fim do set CPF
	public String getCPF() {
		return this.CPF;
	}//fim do get CPF
	
	
	public void setdtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}// fim do set nascimento
	public LocalDate getdtNascimento() {
		return this.dtNascimento;
	}
	
	
	public String imprimir() {
		return "Nome" 		+ 	getNome() +
				"CPF"		+	getCPF();
	}// FIM DO IMPRIMIR 
			
} // Fim da classe
