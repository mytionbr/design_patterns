package Strategy;

public class Teste01 {
	public static void main(String[] args) {
		Imposto ISS = new ISS();
		Imposto ICMS = new ICMS();
		
		Orcamento orcamento = new Orcamento(2000.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento, ISS);
		calculador.realizaCalculo(orcamento, ICMS);
		
	}
}
