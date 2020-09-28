package Strategy2;

public class Teste03 {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Matheus Sousa de Jesus", Cargo.GERENTE);
		
		Venda venda = new Venda(2000,funcionario);
		
		venda.save();
	}
}
