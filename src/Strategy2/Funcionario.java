package Strategy2;

public class Funcionario {
	private String nome;
	private Strategy cargo;
	
	Funcionario(String nome, Strategy cargo){
		this.nome = nome;
		this.cargo = cargo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Strategy getCargo() {
		return cargo;
	}
	
	
}
