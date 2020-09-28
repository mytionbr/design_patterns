package Strategy4;

public class Show {
	private double valor;
	private Pessoa pessoa;
	
	Show(double valor, Pessoa pessoa){
		this.valor = valor;
		this.pessoa = pessoa;
	}
	
	public double calculaComissao() {
		return this.pessoa.getCargo().calcula(this.valor);
	}
}
