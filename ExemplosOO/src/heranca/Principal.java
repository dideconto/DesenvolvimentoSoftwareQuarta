package heranca;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		
		Livro livro = new Livro("Diogo Deconto");
		livro.setId(1);
		livro.setAutor("Diogo Deconto");
		livro.setTitulo("Orientação a Objetos");
		livro.setEdicao(1);
		livro.setEditora("Deconto");
		livro.setPaginas(450);
		livro.setIsbn("13ASD@1CDG");
		
		System.out.println(livro.retornarTipo());
		System.out.println("\n" + livro);

		System.out.println("\n=======================================\n");
		
		Revista revista = new Revista("José da Silva");	
		revista.setId(1);	
		revista.setTitulo("Revista de Orientação a Objetos");
		revista.setEdicao(135);
		revista.setEditora("Deconto Steinke");
		revista.setPaginas(67);
		revista.setReportagem("Herança na prática!");
		
		System.out.println(revista.retornarTipo());
		System.out.println("\n" + revista);		
		
		ArrayList<Midia> midias = new ArrayList<Midia>();
		midias.add(livro);
		midias.add(revista);

		for (Midia midia : midias) {
			System.out.println("\n=======================================\n");
			System.out.println(midia.retornarTipo());
		}		

	}

}
