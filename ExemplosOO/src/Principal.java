
public class Principal {
	
	static Livro livro1;
//	lista de livros
	
	public static void main(String[] args) {
				
		livro1 = new Livro();
		
		livro1.setAno(2020);
		livro1.setAutor("Diogo Deconto");
		livro1.setEdicao("1");
		livro1.setGenero("Tecnologia");
		livro1.setIsbn("111-1-11-111111-1");
		livro1.setNome("Orientação a Objetos");
		livro1.setPaginas(350);
		System.out.println(livro1);
		
		livro1 = new Livro();
//		System.out.println(livro1);
		
		Livro livro2 = new Livro();
		livro2.setAno(2020);
		livro2.setAutor("Diogo Deconto");
		livro2.setEdicao("1");
		livro2.setGenero("Tecnologia");
		livro2.setIsbn("111-1-11-111111-1");
		livro2.setNome("Orientação a Objetos");
		livro2.setPaginas(350);
		
//		System.out.println(livro1.equals(livro2));
//		System.out.println(livro1.getAno() == livro2.getAno());
		
	}
	
	public void teste(String nome, double salario) {
		
	}
	
	public void teste(double salario, String nome) {
		
	}

}












