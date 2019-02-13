package iSoccer.negocio;

public class Motorista extends Funcionario{
	private int numHabilitacao;
	
	public Motorista(String nome, String email, int tipo, String cpf,  String telefone, double salario,int numHabilitacao) {
		super(nome, email, tipo, cpf, telefone, salario);
		this.numHabilitacao = numHabilitacao;
	}

	public int getNumHabilitacao() {
		return numHabilitacao;
	}

	public void setNumHabilitacao(int numHabilitacao) {
		this.numHabilitacao = numHabilitacao;
	}
	
	@Override
	public String toString() {
		return "--------Dados do motorista---------\n"
				+ "Nome: " + getNome() + "		E-mail: " + getEmail() + "\nCPF: " + getCpf() + "		Telefone: " + getTelefone() + "\n"
						+ "Salário: " + getSalario()+"		Nº habilitação: "+numHabilitacao+"\n";
	}
	
	
}
