package iSoccer.negocio;

public class Advogado extends Funcionario{
	
	public Advogado(String nome, String email, int tipo, String cpf,String telefone, double salario) {
		super(nome, email, tipo, cpf, telefone, salario);
	}	

	@Override
	public String toString() {
		return "--------Dados do advogado---------\n"
				+ "Nome: " + getNome() + "		E-mail: " + getEmail() + "\nCPF: " + getCpf() + "		Telefone: " + getTelefone() + "\n"
						+ "Salário: " + getSalario()+"\n";
	}
	
}
