package iSoccer.negocio;

public abstract class Funcionario {
	private String nome;
	private String email;
	private int tipo;
	private String cpf;
	private String telefone;
	private double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String email, int tipo, String cpf, String telefone, double salario) {
		super();
		this.nome = nome;
		this.email = email;
		this.tipo = tipo;
		this.cpf = cpf;
		this.telefone = telefone;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public  String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
