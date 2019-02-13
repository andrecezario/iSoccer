package iSoccer.negocio;

public class Jogador extends Funcionario{
	
	private String tipoJogador;
	private boolean aptidao;
	
	public Jogador() {
		super();
	}

	public Jogador(String nome, String email, int tipo, String cpf,  String telefone, double salario,String tipoJogador, boolean aptidao) {
		super(nome, email, tipo, cpf, telefone, salario);
		this.tipoJogador = tipoJogador;
		this.aptidao = aptidao;
	}

	public String getTipoJogador() {
		return tipoJogador;
	}
	public void setTipoJogador(String tipo) {
		this.tipoJogador = tipo;
	}
	public boolean isAptidao() {
		return aptidao;
	}
	public void setAptidao(boolean aptidao) {
		this.aptidao = aptidao;
	}
	
	@Override
	public String toString() {
		return "--------Dados do jogador---------\n"
				+ "Nome: " + getNome() + "		E-mail: " + getEmail() + "\nCPF: " + getCpf() + "		Telefone: " + getTelefone() + "\n"
						+ "Salário: " + getSalario()+"		Tipo jogador: "+tipoJogador+"\nAptidão: "+aptidao+"\n";
	}
	
	
}
