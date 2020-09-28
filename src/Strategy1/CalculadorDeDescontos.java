package Strategy1;

public class CalculadorDeDescontos {
	public void realizaDesconto(Livro livro, Desconto desconto) {
		double resultado = desconto.calcula(livro);
		System.out.println(resultado);
	}
}
