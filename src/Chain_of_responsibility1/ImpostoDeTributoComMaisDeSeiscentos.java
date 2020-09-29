package Chain_of_responsibility1;

public class ImpostoDeTributoComMaisDeSeiscentos implements Imposto{
	private Imposto proximo;
	
	@Override
	public double calcula(Tributario tributario) {
		if(tributario.getValor() >600)
			return tributario.getValor() * 0.1;
		else
			return proximo.calcula(tributario);
	}

	@Override
	public void setProximo(Imposto imposto) {
		this.proximo = imposto;
		
	}

}
