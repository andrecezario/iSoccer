package iSoccer.negocio;

public class Medico extends Funcionario {
	private int crm;
	
	public Medico(String nome, String email, int tipo, String cpf,  String telefone, double salario,int crm) { 
		super(nome, email, tipo, cpf, telefone, salario);
		this.crm = crm;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}
	
	@Override
	public String toString() {
		return "--------Dados do médico---------\n"
				+ "Nome: " + getNome() + "		E-mail: " + getEmail() + "\nCPF: " + getCpf() + "		Telefone: " + getTelefone() + "\n"
						+ "Salário: " + getSalario()+"		CRM: "+crm+"\n";
	}
	
}
