package iSoccer.negocio;

public class Onibus {
	private String placa;
	private boolean disponibilidade;
	
	public Onibus( ) {
		
	}
	
	public Onibus(String placa, boolean disponibilidade) {
		super();
		this.placa = placa;
		this.disponibilidade = disponibilidade;
	}
	
	
	@Override
	public String toString() {
		return "--------Dados do ônibus---------\n"
				+ "Placa: " + placa + "\nDisponibilidade: " + disponibilidade;
	}

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public boolean getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
}
