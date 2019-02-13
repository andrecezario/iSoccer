package iSoccer.negocio;

public class Presidente extends Funcionario {

	public Presidente() {
		super();
	}

	public Presidente(String nome, String email, int tipo, String cpf, String telefone, double salario) {
		super(nome, email, tipo, cpf, telefone, salario);
	}

	@Override
	public String toString() {
		return "--------Dados do presidente---------\n"
				+ "Nome: " + getNome() + "		E-mail: " + getEmail() + "\nCPF: " + getCpf() + "		Telefone: " + getTelefone() + "\n"
						+ "Salário: " + getSalario()+"\n";
	}
	
	

}
