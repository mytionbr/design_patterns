package Strategy1;

public class LoteDesconto implements Desconto{

	@Override
	public double calcula(Livro livro) {
		return livro.getPreco() * 0.1;
	}
	
}
