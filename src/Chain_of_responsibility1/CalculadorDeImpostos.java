package Chain_of_responsibility1;

public class CalculadorDeImpostos {
	public double calcula(Tributario tributario) {
		Imposto i1 = new ImpostoDeTributoComMaisDeSeiscentos();
		Imposto i2 = new ImpostoDeTributoComMaisDeCincoCompras();
		Imposto semImpostos = new SemImposto();
		
		i1.setProximo(i2);
		i2.setProximo(semImpostos);
		
		return i1.calcula(tributario);
		
		
	}
}
