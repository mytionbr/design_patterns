package Chain_of_responsibility1;

import java.util.Arrays;

public class Teste {
	public static void main(String[] args) {
	
		Compra compra1 = new Compra("Lapis", 2.00);
		Compra compra2 = new Compra("Compra do mês", 200.00);
		Compra compra3 = new Compra("Lapis", 200.00);
		
		
		Tributario tributario = new Tributario();
		
		tributario.adicionaLista(Arrays.asList(compra1,compra2,compra3,compra3,compra3,compra3));
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		double resultado = calculador.calcula(tributario);
		
		System.out.println(resultado);
		
	}
}
