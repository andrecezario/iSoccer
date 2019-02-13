package iSoccer.negocio;

public class CentroTreinamento {
	private String nome;
	private int numDormitorios;
	private boolean disponibilidade;
	
	public CentroTreinamento() {
		
	}
	
	public CentroTreinamento(String nome, int numDormitorios, boolean disponibilidade) {
		super();
		this.nome = nome;
		this.numDormitorios = numDormitorios;
		this.disponibilidade = disponibilidade;
	}
	
	@Override
	public String toString() {
		return "--------Dados do centro de treinamento---------\n"
			+ "Nome: "+nome+"\nNº de dormitórios: " + numDormitorios + "\nDisponibilidade: " + disponibilidade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumDormitorios() {
		return numDormitorios;
	}
	public void setNumDormitorios(int numDormitorios) {
		this.numDormitorios = numDormitorios;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
}
