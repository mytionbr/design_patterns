package Chain_of_responsibility;

public interface Desconto {
	double desconta(Orcamento orcamento);
	void setProximo(Desconto desconto);
}
