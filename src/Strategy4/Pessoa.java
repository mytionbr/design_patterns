package Strategy4;

public class Pessoa {
	private String nome;
	private Comissao cargo;
	
	Pessoa(String nome, Comissao cargo){
		this.nome = nome;
		this.cargo = cargo;
	}
	
	public Comissao getCargo() {
		return cargo;
	}
	
	public String getNome() {
		return nome;
	}
}
