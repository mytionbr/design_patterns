package Strategy4;

public class Teste {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Matheus", Cargo.MUSICO);
		
		Show show = new Show(30000, pessoa);
		
		System.out.println("O " + pessoa.getCargo().toString() + " " + pessoa.getNome()+ " ganhou " 
				+ show.calculaComissao() + " de comissão");
	}
}
