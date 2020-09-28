package Strategy1;

public class DiaDesconto implements Desconto{

	@Override
	public double calcula(Livro livro) {
		return livro.getPreco() * 0.05;
	}
	
}
