package iSoccer.negocio;

public class Cozinheiro extends Funcionario{

	public Cozinheiro() {
		super();
	}

	public Cozinheiro(String nome, String email, int tipo, String cpf,  String telefone, double salario) {
		super(nome, email, tipo, cpf, telefone, salario);
	}
	
	@Override
	public String toString() {
		return "--------Dados do cozinheiro---------\n"
				+ "Nome: " + getNome() + "		E-mail: " + getEmail() + "\nCPF: " + getCpf() + "		Telefone: " + getTelefone() + "\n"
						+ "Salário: " + getSalario()+"\n";
	}
	
	

}
