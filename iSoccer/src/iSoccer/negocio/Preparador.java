package iSoccer.negocio;

public class Preparador extends Funcionario{

	public Preparador() {
		super();
	}

	public Preparador(String nome, String email, int tipo, String cpf, String telefone, double salario) {
		super(nome, email, tipo, cpf, telefone, salario);
	}	
	
	@Override
	public String toString() {
		return "--------Dados do preparador---------\n"
				+ "Nome: " + getNome() + "		E-mail: " + getEmail() + "\nCPF: " + getCpf() + "		Telefone: " + getTelefone() + "\n"
						+ "Salário: " + getSalario()+"\n";
	}
	

}
