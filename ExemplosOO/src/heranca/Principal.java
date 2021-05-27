package heranca;

public class Principal {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.setId(1);
		livro.setTitulo("Orientação a Objetos");
		livro.setEdicao(1);
		livro.setPaginas(450);
		livro.setEditora("Diogo Deconto");
		livro.setAutor("José da Silva");
		livro.setIsbn("1231-43131-421");
		
		System.out.println(livro);

	}

}
