package heranca;

public class MidiaFisica extends Midia{

	private int paginas;
	private int edicao;
	private String editora;
	
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nEditora: " + getEditora() + 
				"\nP�ginas: " + getPaginas() + 
				"\nEdi��o: " + getEdicao();
	}
	
	
}









