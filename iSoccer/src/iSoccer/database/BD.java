package iSoccer.database;

import java.util.ArrayList;

import iSoccer.negocio.CentroTreinamento;
import iSoccer.negocio.Estadio;
import iSoccer.negocio.Funcionario;
import iSoccer.negocio.Jogador;
import iSoccer.negocio.Onibus;
import iSoccer.negocio.SocioTorcedor;
import iSoccer.negocio.Tecnico;

public class BD {
	public ArrayList<Funcionario> funcionarios = new ArrayList<>();
	public ArrayList<SocioTorcedor> socios = new ArrayList<>();
	public ArrayList<Onibus> onibus = new ArrayList<>();
	public ArrayList<Estadio> estadios = new ArrayList<>();
	public ArrayList<CentroTreinamento> centros = new ArrayList<>();
	
	public void cadastrarFuncionario(Funcionario f) {
		funcionarios.add(f);
		System.out.println("Funcionário cadastrado com sucesso!");	
	}
	
	public void cadastrarSocioTorcedor(SocioTorcedor s) {
		socios.add(s);
		System.out.println("Sócio torcedor cadastrado com sucesso!");
	}
	
	public SocioTorcedor buscarSocioTorcedor(String cpf) {
		SocioTorcedor resultado = null;
		
		for(SocioTorcedor s : socios) {
			if(s.getCpf().equals(cpf)) {
				resultado = s;
			}
		}
		
		return resultado;
	}
	
	public ArrayList<SocioTorcedor> buscarSociosAdimplentes() {
		ArrayList<SocioTorcedor> socios = this.socios;
		ArrayList<SocioTorcedor> sociosAdimplentes = new ArrayList<>();
		
		for(SocioTorcedor s : socios) {
			if(s.isEstadoPagamento()==true) {
				sociosAdimplentes.add(s);
			}
		}
		
		return sociosAdimplentes;
	}
	
	public ArrayList<SocioTorcedor> buscarSociosInadiplentes() {
		ArrayList<SocioTorcedor> socios = this.socios;
		ArrayList<SocioTorcedor> sociosInadiplentes = new ArrayList<>();
		
		for(SocioTorcedor s : socios) {
			if(s.isEstadoPagamento()==false) {
				sociosInadiplentes.add(s);
			}
		}
		
		return sociosInadiplentes;
	}
	
	
	public Tecnico buscarTreinador() {
		Tecnico resultado = null;
		
		for(Funcionario f : funcionarios) {
			if(f.getTipo() == 3) {
				resultado = (Tecnico) f;
			}
		}
		return resultado;
	}
	
	public ArrayList<Jogador> buscarJogadores() {
		ArrayList<Jogador> jogadores = new ArrayList<>();
		
		for(Funcionario f : funcionarios) {
			if(f.getTipo() == 8) {
				jogadores.add((Jogador)f);
			}
		}
		
		return jogadores;
	}
	
	public ArrayList<Jogador> buscarJogadoresAptos() {
		ArrayList<Jogador> jogadores = this.buscarJogadores();
		ArrayList<Jogador> jogadoresAptos = new ArrayList<>();
		
		for(Jogador j : jogadores) {
			if(j.isAptidao()==true) {
				jogadoresAptos.add(j);
			}
		}
		
		return jogadoresAptos;
	}
	
	public ArrayList<Jogador> buscarJogadoresNaoAptos() {
		ArrayList<Jogador> jogadores = this.buscarJogadores();
		ArrayList<Jogador> jogadoresNaoAptos = new ArrayList<>();
		
		for(Jogador j : jogadores) {
			if(j.isAptidao()==false) {
				jogadoresNaoAptos.add(j);
			}
		}
		
		return jogadoresNaoAptos;
	}
	
	
	//Onibus	
	public void addOnibus(Onibus o) {
		onibus.add(o);
		System.out.println("Ônibus adicionado com sucesso!");
	}
	
	public Onibus buscarOnibus(String placa) {
		Onibus resultado = null;
		
		for(Onibus o : onibus) {
			if(o.getPlaca().equals(placa)) {
				resultado = o;
			}
		}		
		return resultado;
	}
	
	//Estadio
	public void addEstadio(Estadio e) {
		estadios.add(e);
		System.out.println("Estádio adicionado com sucesso!");
	}
	
	public Estadio buscarEstadio(String nome) {
		Estadio resultado = null;
		
		for(Estadio e : estadios) {
			if(e.getNome().equals(nome)) {
				resultado = e;
			}
		}		
		return resultado;
	}
	
	//Centro
	public void addCentro(CentroTreinamento c) {
		centros.add(c);
		System.out.println("Centro de treinamento adicionado com sucesso!");
	}
	
	public CentroTreinamento buscarCentro(String nome) {
		CentroTreinamento resultado = null;
		
		for(CentroTreinamento c : centros) {
			if(c.getNome().equals(nome)) {
				resultado = c;
			}
		}		
		return resultado;
	}
}
