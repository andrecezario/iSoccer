package iSoccer.negocio;

public class Estadio {
	private String nome;
	private int numTorcedores;
	private int numBanheiros;
	private int numLanchonetes;
	private boolean disponibilidade;
	
	public Estadio() {
		
	}
	
	public Estadio(String nome, int numTorcedores, int numBanheiros, int numLanchonetes,
			boolean disponibilidade) {
		super();
		this.nome = nome;
		this.numTorcedores = numTorcedores;
		this.numBanheiros = numBanheiros;
		this.numLanchonetes = numLanchonetes;
		this.disponibilidade = disponibilidade;
	}
	
	@Override
	public String toString() {
		return "--------Dados do estádio---------\n"
			+ "Nome: "+nome+"\nNº de torcedores: " + numTorcedores+"\nNº de banheiros: " + numBanheiros
			+"\nNº de lanchonetes: " + numLanchonetes+ "\nDisponibilidade: " + disponibilidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumTorcedores() {
		return numTorcedores;
	}
	public void setNumTorcedores(int numTorcedores) {
		this.numTorcedores = numTorcedores;
	}
	public int getNumBanheiros() {
		return numBanheiros;
	}
	public void setNumBanheiros(int numBanheiros) {
		this.numBanheiros = numBanheiros;
	}
	public int getNumLanchonetes() {
		return numLanchonetes;
	}
	public void setNumLanchonetes(int numLanchonetes) {
		this.numLanchonetes = numLanchonetes;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	

}
