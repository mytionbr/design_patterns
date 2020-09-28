package Strategy1;

public class Teste02 {
	public static void main(String[] args) {
		Desconto lote = new LoteDesconto();
		Desconto dia = new DiaDesconto();
		
		Livro livro = new Livro("Harry Potter", 50.0);
		
		CalculadorDeDescontos calculadorDeDescontos = new CalculadorDeDescontos();
		
		calculadorDeDescontos.realizaDesconto(livro, lote);
		calculadorDeDescontos.realizaDesconto(livro,dia);
	}
}
