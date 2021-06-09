package heranca;

public class Livro extends MidiaFisica{

	public Livro(String dono) {
		super(dono);
	}
	
	private String autor;
	private String isbn;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return super.toString() +
				"Autor: " + getAutor() + 
				"\nISBN: " + getIsbn();
	}

	@Override
	public String retornarTipo() {
		return super.retornarTipo() + "Tipo Livro";
	}

	@Override
	public void obrigarImplementaçãoClasseFilha() {
		// TODO Auto-generated method stub
		
	}
	
}









