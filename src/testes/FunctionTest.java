package testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<String,Integer> func = x -> x.length();
		
		Function<String,ArrayList> listaNome = n ->
			new ArrayList(Arrays.asList(n.split(" ")));
		
		Function<String,Boolean> ehValido = x ->  (x.length() > 0 ) ? true:false;
														
		
		Integer apply = func.apply("Matheus Sousa de Jesus");
		ArrayList nomes = listaNome.apply("Matheus Sousa de Jesus");
		Boolean nomeEhValido = NomesBolados.ehValido.apply("");
		
		System.out.println(apply);
		System.out.println(nomes);
		System.out.println(nomeEhValido);
	}
}

class NomesBolados{
	private String nome;
	public static Function<String,Boolean> ehValido = x ->  (x.length() > 0 ) ? true:false;
}
