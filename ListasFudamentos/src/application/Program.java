package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		// lista de nomes:

		// a lista não aceita tipos primitivos, ou seja, int vira Integer dentro de <>
		List<String> list = new ArrayList<>();
		// ArrayList é uma classe que é bem otimizada.

		// add para adicionar itens a lista.
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Carlos");
		list.add("Amaury");
		list.add("Alefe");

		// para adicionar um elemento em um local específico da lista.
		list.add(2, "Marco");

		System.out.println("O tamanho da lista é: " + list.size()); // para ver o tamanho da lista.

		for (String x : list) {
			System.out.println(". " + x);
		}

		System.out.println("-----------------------");
		list.remove(1); // para remover um dado da lista. ou list.remove<"Alex">
		list.removeIf(x -> x.charAt(0) == 'M'); // remove os itens x onde a primeira letra é 'M'.

		System.out.println("O tamanho da lista é: " + list.size()); // para ver o tamanho da lista.
		for (String x : list) {
			System.out.println(". " + x);
		}

		System.out.println("-----------------------");
		System.out.println("Posicões retornadas");
		System.out.println("Index of Anna: " + list.indexOf("Anna")); // a lista retorna a posisão do bob.
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // quando o indexof não encontra o elemento ele
																		// retorna -1
		System.out.println("-----------------------");
		// para filtrar apenas nomes com letra A:
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		// criamos uma nova lista, convertemos para String, fazemos a operação lambda e
		// depois voltamos para uma lista.
		System.out.println("Elementos com letra A");
		for (String x : result) {
			System.out.println(". " + x);
		}
		
		System.out.println("-----------------------");
		//o findFirst retorna o primeiro elemento da lista com a letra A. caso não exista retorna null.
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); 
	}

}
