package Chain_of_responsibility1;

public class ImpostoDeTributoComMaisDeCincoCompras implements Imposto{
	private Imposto proximo;
	
	@Override
	public double calcula(Tributario tributario) {
		if(tributario.getCompras().size() > 4)
			return tributario.getValor() * 0.5;
		else
			return proximo.calcula(tributario);
	}

	@Override
	public void setProximo(Imposto imposto) {
		this.proximo = imposto;
		
	}

}
