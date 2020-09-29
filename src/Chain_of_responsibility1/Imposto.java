package Chain_of_responsibility1;

public interface Imposto {
	double calcula(Tributario tributario);
	void setProximo(Imposto imposto);
}
