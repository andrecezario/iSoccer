package iSoccer.negocio;

public class SocioTorcedor {

	private String nome;
	private String email;
	private String cpf;
	private String endereco;
	private String telefone;
	private int tipo;
	private double contribuicao;
	private boolean estadoPagamento = false;
	
	public SocioTorcedor() {
		
	}
	
	public SocioTorcedor(String nome, String email, String cpf, String endereco, String telefone, int tipo,
			double contribuicao) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.tipo = tipo;
		this.contribuicao = contribuicao;
	}
	
	@Override
	public String toString() {
		return "--------Dados do sócio-torcedor---------\n"
				+ "Nome: " + getNome() + "		E-mail: " + getEmail() + "\nCPF: " + getCpf() + "		Telefone: " + getTelefone() + "\n"
						+ "Endereço: " + getEndereco()+ "		Tipo: " + getTipo()+"\nContribuição: " + getContribuicao()+ "		Estado de pagamento: " + isEstadoPagamento()+"\n";
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getContribuicao() {
		return contribuicao;
	}
	public void setContribuicao(double contribuicao) {
		this.contribuicao = contribuicao;
	}
	public boolean isEstadoPagamento() {
		return estadoPagamento;
	}
	public void setEstadoPagamento(boolean estadoPagamento) {
		this.estadoPagamento = estadoPagamento;
	}
	
}
