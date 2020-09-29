package Chain_of_responsibility1;

public class Compra {
	private String nome;
	private double preco;
	
	Compra(String nome,double preco){
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}
	
	
}
