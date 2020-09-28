package Strategy2;

public class Venda {
	private double valorVenda;
	private Funcionario funcionario;
	
	Venda(double valorVenda, Funcionario funcionario){
		this.valorVenda = valorVenda;
		this.funcionario = funcionario;
	}
	
	public void save() {
		double valorComissionado = this.funcionario.getCargo().caulculaComissao(this.valorVenda);
		System.out.println(valorComissionado);
	}
	
}
