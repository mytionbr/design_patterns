package Chain_of_responsibility1;

public class SemImposto implements Imposto{

	@Override
	public double calcula(Tributario tributario) {
		return 0;
	}

	@Override
	public void setProximo(Imposto imposto) {
				
	}

}
