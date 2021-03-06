package Chain_of_responsibility;

public class CalculadorDeDescontos {
	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorMaisDeCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto semDesconto = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(semDesconto);
		return d1.desconta(orcamento);
	}
}
