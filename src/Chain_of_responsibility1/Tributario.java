package Chain_of_responsibility1;

import java.util.ArrayList;
import java.util.List;

public class Tributario {
	private double valor;
	private List<Compra> compras = new ArrayList<>();
	
	public void adicionaLista(List<Compra> compras) {
		this.compras.addAll(compras);
		calculaValor();
	}
	public void adiciona(Compra compra) {
		compras.add(compra);
		calculaValor();
	}
	
	public void calculaValor() {
		this.valor = compras.stream().mapToDouble(Compra::getPreco).sum();
	}
	
	public double getValor() {
		return valor;
	}	
	public List<Compra> getCompras() {
		return compras;
	}
	
}
