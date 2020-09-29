package Chain_of_responsibility;

public class Teste {
	public static void main(String[] args) {
		Item item1 = new Item("Estojo", 200.0);
		Item item2 = new Item("Chapinha",500);
		
		Orcamento orcamento = new  Orcamento(200);
		orcamento.adicionaItem(item1);
		orcamento.adicionaItem(item2);
		
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		
		double resultado = calculador.calcula(orcamento);
		
		System.out.println(resultado);
	}
}
