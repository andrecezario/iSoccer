package iSoccer.ui;

import java.util.ArrayList;
import java.util.Scanner;

import iSoccer.database.BD;
import iSoccer.negocio.Advogado;
import iSoccer.negocio.CentroTreinamento;
import iSoccer.negocio.Cozinheiro;
import iSoccer.negocio.Estadio;
import iSoccer.negocio.Funcionario;
import iSoccer.negocio.Jogador;
import iSoccer.negocio.Medico;
import iSoccer.negocio.Motorista;
import iSoccer.negocio.Onibus;
import iSoccer.negocio.Preparador;
import iSoccer.negocio.Presidente;
import iSoccer.negocio.SocioTorcedor;
import iSoccer.negocio.Tecnico;

public class Main {
	static BD banco = new BD();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("------------------------------\n"
					+ "	     "+"iSoccer\n"
					+ "------------------------------\n");
			
			System.out.print("Login: ");
			String login = scanner.next();
			System.out.print("Senha: ");
			String senha = scanner.next();
			
			if(login.equals("admin") && senha.equals("admin")) {
					System.out.println("Login efetuado com sucesso!");
			
				while(true) {
						System.out.print("------------------------------\n"
								+"Escolha uma opção:\n"
								+ "------------------------------\n"
								+ "1 - Adicionar funcionário\n"
								+ "2 - Adicionar sócio torcedor\n"
								+ "3 - Atualizar estado de pagamento sócio-torcedor\n"
								+ "4 - Gerenciar recursos físicos\n"
								+ "5 - Solicitar relatório\n"
								+ "6 - Sair\n");
						int opcao = scanner.nextInt();
						
						switch(opcao) {
						case 1:
							try {
								System.out.print("------------------------------\n"
										+ "	"+"Adicionar Funcionário\n"
										+ "------------------------------\n");
								System.out.println("Digite o nome: ");
								scanner.nextLine();
								String nome = scanner.nextLine();
								
								System.out.println("Digite o e-mail: ");
								String email = scanner.nextLine();
								
								System.out.println("Digite o telefone: ");
								//scanner.nextLine();
								String telefone = scanner.nextLine();
								
								System.out.println("Digite o cpf: ");
								//scanner.nextLine();
								String cpf = scanner.nextLine();
								
								System.out.println("Digite o salário: ");
								String sal = scanner.next();
								double salario = Double.parseDouble(sal);
								
								System.out.println("Digite o tipo de funcionário\n"
										+ "1 - Presidente\n"
										+ "2 - Médico\n"
										+ "3 - Técnico\n"
										+ "4 - Preparador físico\n"
										+ "5 - Motorista\n"
										+ "6 - Cozinheiro\n"
										+ "7 - Advogado\n"
										+ "8 - Jogador");
								
								int tipo = scanner.nextInt();
								
								switch(tipo) {
									case 1:
										Funcionario presidente = new Presidente(nome,email,tipo,cpf,telefone,salario);
										banco.cadastrarFuncionario(presidente);
										break;
										
									case 2:
										System.out.println("Digite o crm: ");
										int crm = scanner.nextInt();
										Medico medico = new Medico(nome,email,tipo,cpf,telefone,salario,crm);
										banco.cadastrarFuncionario(medico);
										break;
										
									case 3:
										Funcionario tecnico = new Tecnico(nome,email,tipo,cpf,telefone,salario);
										banco.cadastrarFuncionario(tecnico);
										break;
										
									case 4:
										Funcionario preparador = new Preparador(nome,email,tipo,cpf,telefone,salario);
										banco.cadastrarFuncionario(preparador);
										break;
										
									case 5:
										System.out.println("Digite o nº de habilitação: ");
										int numHabilitacao = scanner.nextInt();
										Funcionario motorista = new Motorista(nome,email,tipo,cpf,telefone,salario,numHabilitacao);
										banco.cadastrarFuncionario(motorista);
										break;
										
									case 6:
										Funcionario cozinheiro = new Cozinheiro(nome,email,tipo,cpf,telefone,salario);
										banco.cadastrarFuncionario(cozinheiro);
										break;
									
									case 7:
										Funcionario advogado = new Advogado(nome,email,tipo,cpf,telefone,salario);
										banco.cadastrarFuncionario(advogado);
										break;
										
									case 8:
										System.out.println("Digite o tipo de jogador (volante, zagueiro, meia, goleiro, atacante, lateral esquerdo, lateral direito): ");
										scanner.nextLine();
										String tipoJogador = scanner.nextLine();
										System.out.println("Digite se o jogador está apto ou não para jogar\n"
												+ "1 - SIM\n2 - NÃO");
										int apt = scanner.nextInt();
										boolean aptidao;
										if(apt==1) {
											aptidao = true;
										}
										else {
											aptidao = false;
										}
										Funcionario jogador  = new Jogador(nome,email,tipo,cpf,telefone,salario,tipoJogador,aptidao);
										banco.cadastrarFuncionario(jogador);
										break;
								}
							
							} catch(Exception e) {
								System.out.println("Ocorreu algum um erro!");
							}
							
							break;
						
						case 2:
							try {
									
								System.out.print("------------------------------\n"
										+ "	"+"Adicionar sócio torcedor\n"
										+ "------------------------------\n");
								System.out.println("Digite o nome: ");
								scanner.nextLine();
								String nome = scanner.nextLine();
								
								System.out.println("Digite o e-mail: ");
								String email = scanner.nextLine();
								
								System.out.println("Digite o telefone: ");
								String telefone = scanner.nextLine();
								
								System.out.println("Digite o cpf: ");
								String cpf = scanner.nextLine();
								
								System.out.println("Digite o endereço: ");
								String endereco = scanner.nextLine();
								
								System.out.println("Digite o valor da contribuição: ");
								String valor = scanner.next();
								double contribuicao = Double.parseDouble(valor);
								
								System.out.println("Digite o tipo de sócio\n"
										+ "1 - Júnior\n"
										+ "2 - Sênior\n"
										+ "3 - Elite");
								int tipo = scanner.nextInt();
								
								SocioTorcedor socio = new SocioTorcedor(nome,email,cpf,endereco,telefone,tipo,
										contribuicao);
								banco.cadastrarSocioTorcedor(socio);
							} catch(Exception e) {
								System.out.println("Ocorreu algum um erro!");
							}
							break;
						
						case 3:
							System.out.print("------------------------------\n"
									+ ""+"Atualizar estado sócio\n"
									+ "------------------------------\n");
							System.out.println("Digite o cpf do sócio torcedor: ");
							String cpf = scanner.next();
							SocioTorcedor socio = banco.buscarSocioTorcedor(cpf);
							
							if(socio!=null) {
								System.out.println("Atualizar sócio torcedor para:\n"
										+ "1 - Adimplente\n"
										+ "2 - Inadimplente");
								int estado = scanner.nextInt();
								if(estado==1) {
									socio.setEstadoPagamento(true);
								}
								else {
									socio.setEstadoPagamento(false);
								}
								System.out.println("Estado de pagamento atualizado com sucesso!");
							}
							else {
								System.out.println("Sócio torcedor não encontrado.");
							}
							break;
							
						case 4:
							System.out.print("------------------------------\n"
									+ "	"+"Gerenciar recursos\n"
									+ "------------------------------\n");
							System.out.println("Digite o tipo de recurso que quer gerenciar\n"
									+ "1 - Ônibus\n"
									+ "2 - Estádio\n"
									+ "3 - Centro de treinamento");
							int recurso = scanner.nextInt();
							switch(recurso) {
							case 1:
								System.out.print("------------------------------\n"
										+ "	"+"Ônibus\n"
										+ "------------------------------\n");
								System.out.println("Escolha uma operação:\n"
										+ "1 - Adicionar\n"
										+ "2 - Verificar\n"
										+ "3 - Ver disponibilidade");
								int op = scanner.nextInt();
								
								switch(op) {
								case 1:
									System.out.print("------------------------------\n"
											+ "	"+"Adicionar ônibus\n"
											+ "------------------------------\n");
									System.out.println("Digite a placa do ônibus: ");
									scanner.nextLine();
									String placa = scanner.nextLine();
									
									System.out.println("Digite a disponibilidade\n"
											+ "1 - Disponível\n"
											+ "2 - Indisponível");
									int disp = scanner.nextInt();
									boolean disponibilidade;
									
									if(disp==1) {
										disponibilidade = true;
									}
									else {
										disponibilidade = false;
									}
									Onibus bus = new Onibus(placa,disponibilidade);
									
									banco.addOnibus(bus);
									break;
									
								case 2:
									System.out.print("------------------------------\n"
											+ "	"+"Verificar ônibus\n"
											+ "------------------------------\n");
									System.out.println("Digite a placa do ônibus que deseja verificar: ");
									scanner.nextLine();
									String placaBus = scanner.nextLine();
									Onibus onibus = banco.buscarOnibus(placaBus);
									
									if(onibus!=null) {
										System.out.println(onibus);
									}
									else {
										System.out.println("Ônibus não encontrado.");
									}
									
									break;
								case 3:
									System.out.print("------------------------------\n"
											+ "	"+"Ver disponibilidade ônibus\n"
											+ "------------------------------\n");
									System.out.println("Digite a placa do ônibus que deseja ver: ");
									scanner.nextLine();
									String placaB = scanner.nextLine();
									Onibus oni = banco.buscarOnibus(placaB);
									
									if(oni!=null) {
										if(oni.getDisponibilidade()==true) {
											System.out.println("Ônibus disponível! Deseja alterar disponibilidade?\n"
													+ "1 - SIM\n"
													+ "2 - NÃO");
											int alter = scanner.nextInt();
											
											if(alter==1) {
												oni.setDisponibilidade(false);
												System.out.println("Disponibilidade alterada com sucesso!");
											}
										}
										
										else {
											System.out.println("Ônibus não está disponível!");
										}
									}
									else {
										System.out.println("Ônibus não encontrado.");
									}
									break;
								}
								
								break;
							case 2:
								System.out.print("------------------------------\n"
										+ "	"+"Estádio\n"
										+ "------------------------------\n");
								System.out.println("Escolha uma operação:\n"
										+ "1 - Adicionar\n"
										+ "2 - Buscar\n"
										+ "3 - Ver disponibilidade\n"
										+ "4 - Alterar");
								int opc = scanner.nextInt();
								
								switch(opc) {
								case 1:
									System.out.print("------------------------------\n"
											+ "	"+"Adicionar estádio\n"
											+ "------------------------------\n");
									System.out.println("Digite o nome do estádio: ");
									scanner.nextLine();
									String nome = scanner.nextLine();
									
									System.out.println("Digite o nº de torcedores suportado:");
									int numTorcedores = scanner.nextInt();
									
									System.out.println("Digite o nº de banheiros: ");
									int numBanheiros = scanner.nextInt();
									
									System.out.println("Digite o nº de lanchonetes");
									int numLanchonetes = scanner.nextInt();
									
									System.out.println("Digite a disponibilidade\n"
											+ "1 - Disponível\n"
											+ "2 - Indisponível");
									int disp = scanner.nextInt();
									boolean disponibilidade;
									
									if(disp==1) {
										disponibilidade = true;
									}
									else {
										disponibilidade = false;
									}
									Estadio estadio = new Estadio(nome,numTorcedores, numBanheiros, numLanchonetes,
											disponibilidade);
									
									banco.addEstadio(estadio);
									break;
									
								case 2:
									System.out.print("------------------------------\n"
											+ "	"+"Buscar estádio\n"
											+ "------------------------------\n");
									System.out.println("Digite o nome do estádio que deseja buscar: ");
									scanner.nextLine();
									String nomeEstadio = scanner.nextLine();
									Estadio estad = banco.buscarEstadio(nomeEstadio);
									
									if(estad!=null) {
										System.out.println(estad);
									}
									else {
										System.out.println("Estádio não encontrado.");
									}
									break;
								
								case 3:
									System.out.print("------------------------------\n"
											+ "	"+"Ver disponibilidade estádio\n"
											+ "------------------------------\n");
									System.out.println("Digite o nome do estádio que deseja ver: ");
									scanner.nextLine();
									String nomeE = scanner.nextLine();
									Estadio estd = banco.buscarEstadio(nomeE);
									
									if(estd!=null) {
										if(estd.isDisponibilidade()==true) {
											System.out.println("Estádio disponível! Deseja alterar disponibilidade?\n"
													+ "1 - SIM\n"
													+ "2 - NÃO");
											int alter = scanner.nextInt();
											
											if(alter==1) {
												estd.setDisponibilidade(false);
												System.out.println("Disponibilidade alterada com sucesso!");
											}
										}
										
										else {
											System.out.println("Estádio não está disponível!");
										}
									}
									else {
										System.out.println("Estádio não encontrado.");
									}
									break;
									
								case 4:
									System.out.print("------------------------------\n"
											+ "	"+"Alterar informações\n"
											+ "------------------------------\n");
									System.out.println("Digite o nome do estádio que deseja ver: ");
									scanner.nextLine();
									String nomeEs = scanner.nextLine();
									Estadio est = banco.buscarEstadio(nomeEs);
									
									if(est!=null) {
										System.out.println("Escolha o atributo que deseja alterar: \n"
												+ "1 - Nº de participantes\n"
												+ "2 - Nº de banheiros\n"
												+ "3 - Nº de lanchonetes");
										int atri = scanner.nextInt();
										
										if(atri==1) {
											System.out.println("Digite o novo n° de participantes: ");
											int nPart = scanner.nextInt();
											est.setNumTorcedores(nPart);
											
										}
										else if(atri==2) {
											System.out.println("Digite o novo n° de banheiros: ");
											int nBan = scanner.nextInt();
											est.setNumBanheiros(nBan);
										}
										else if(atri==3) {
											System.out.println("Digite o novo n° de lanchonetes: ");
											int nLan = scanner.nextInt();
											est.setNumLanchonetes(nLan);
										}
									}
									else {
										System.out.println("Estádio não encontrado.");
									}
									
									break;
									
								}
									
								break;
							case 3:
								System.out.print("------------------------------\n"
										+ "	"+"Centro de treinamento\n"
										+ "------------------------------\n");
								System.out.println("Escolha uma operação:\n"
										+ "1 - Adicionar\n"
										+ "2 - Buscar\n"
										+ "3 - Ver disponibilidade\n");
								int opca = scanner.nextInt();
								
								switch(opca) {
								case 1:
									System.out.print("------------------------------\n"
											+ ""+"Adicionar centro treinamento\n"
											+ "------------------------------\n");
									System.out.println("Digite o nome do centro: ");
									scanner.nextLine();
									String nomeCentro = scanner.nextLine();
									
									System.out.println("Digite o nº de dormitórios:");
									int numDormitorios = scanner.nextInt();
									
									System.out.println("Digite a disponibilidade\n"
											+ "1 - Disponível\n"
											+ "2 - Indisponível");
									int disp = scanner.nextInt();
									boolean disponibilidade;
									
									if(disp==1) {
										disponibilidade = true;
									}
									else {
										disponibilidade = false;
									}
									CentroTreinamento centro = new CentroTreinamento(nomeCentro,numDormitorios,disponibilidade);
									
									banco.addCentro(centro);
									break;
									
								case 2:
									System.out.print("------------------------------\n"
											+ "	"+"Buscar centro\n"
											+ "------------------------------\n");
									System.out.println("Digite o nome do centro que quer buscar: ");
									scanner.nextLine();
									String nome = scanner.nextLine();
									CentroTreinamento centroT = banco.buscarCentro(nome);
									
									if(centroT!=null) {
										System.out.println(centroT);
									}
									else {
										System.out.println("Centro de treinamento não encontrado.");
									}
									
									break;
								case 3:
									System.out.print("------------------------------\n"
											+ "	"+"Ver disponibilidade centro\n"
											+ "------------------------------\n");
									System.out.println("Digite o nome do centro que deseja ver: ");
									scanner.nextLine();
									String nomeC = scanner.nextLine();
									CentroTreinamento centroTr = banco.buscarCentro(nomeC);
									
									if(centroTr!=null) {
										if(centroTr.isDisponibilidade()==true) {
											System.out.println("Centro disponível! Deseja alterar disponibilidade?\n"
													+ "1 - SIM\n"
													+ "2 - NÃO");
											int alter = scanner.nextInt();
											
											if(alter==1) {
												centroTr.setDisponibilidade(false);
												System.out.println("Disponibilidade alterada com sucesso!");
											}
										}
										
										else {
											System.out.println("Centro de treinamento não está disponível!");
										}
									}
									else {
										System.out.println("Centro de treinamento não encontrado.");
									}
									break;
								}
								
								break;
							}
							
							break;
							
						case 5:
							System.out.print("------------------------------\n"
									+ "	"+"Solicitar relatório\n"
									+ "------------------------------\n");
							System.out.println("Deseja saber relatório de: \n"
									+ "1 - Funcionários\n"
									+ "2 - Recursos físicos\n"
									+ "3 - Sócio-torcedores");
							int tipoRel = scanner.nextInt();
							
							switch(tipoRel) {
							case 1:
								System.out.print("------------------------------\n"
										+ "	"+"Relatório funcionários\n"
										+ "------------------------------\n");
								System.out.println("Deseja ver sobre: \n"
										+ "1 - Time\n"
										+ "2 - Serviços gerais");
								int opFun = scanner.nextInt();
								
								if(opFun==1) {
									System.out.print("------------------------------\n"
											+ "	"+"Relatório Time\n"
											+ "------------------------------\n");
									System.out.println("Deseja ver sobre: \n"
											+ "1 - Informações técnico e jogadores\n"
											+ "2 - Buscar jogadores por aptidão");
									int opT = scanner.nextInt();
									
									if(opT==1) {
										Tecnico tecnico = banco.buscarTreinador();
										ArrayList<Jogador> jogadores = banco.buscarJogadores();
										if(tecnico!=null) {
											System.out.println(tecnico);
										}
										else {
											System.out.println("Sem técnico no momento.");
										}
										int cont = 1;
										for(Jogador j: jogadores) {
											System.out.println("Jogador "+cont);
											System.out.println(j);
											cont++;
										}
										if(cont==1) {
											System.out.println("Sem jogadores no momento.");
										}
									}
									else if(opT==2) {
										System.out.println("Deseja ver jogadores que estão: \n"
												+ "1 - Aptos\n"
												+ "2 - Inaptos");
										int opA = scanner.nextInt();
										ArrayList<Jogador> jogadoresAptos = banco.buscarJogadoresAptos();
										ArrayList<Jogador> jogadoresInaptos = banco.buscarJogadoresNaoAptos();
										
										if(opA==1) {
											System.out.println("Jogadores aptos");
											int cont = 1;
											for(Jogador j: jogadoresAptos) {
												System.out.println("Jogador "+cont);
												System.out.println(j);
												cont++;
											}								
										}
										
										else if(opA==2) {
											System.out.println("Jogadores inaptos");
											int cont = 1;
											for(Jogador j: jogadoresInaptos) {
												System.out.println("Jogador "+cont);
												System.out.println(j);
												cont++;
											}	
										}
									}								
									
								}
								
								else if(opFun==2) {
									ArrayList<Funcionario> funcionarios = banco.funcionarios;
									
									System.out.println("\nPresidente");
									for(Funcionario f : funcionarios) {
										if(f.getTipo() == 1) {
											System.out.println((Presidente) f);
										}
									}
									
									System.out.println("\nLista de médicos");
									for(Funcionario f : funcionarios) {
										if(f.getTipo() == 2) {
											System.out.println((Medico)f);
										}
									}
									
									System.out.println("\nTécnico");
									for(Funcionario f : funcionarios) {
										if(f.getTipo() == 3) {
											System.out.println((Tecnico)f);
										}
									}
									
									System.out.println("\nLista de preparadores");
									for(Funcionario f : funcionarios) {
										if(f.getTipo() == 4) {
											System.out.println((Preparador)f);
										}
									}
									
									System.out.println("\nLista de motoristas");
									for(Funcionario f : funcionarios) {
										if(f.getTipo() == 5) {
											System.out.println((Motorista)f);
										}
									}
									
	
									System.out.println("\nLista de cozinheiros");
									for(Funcionario f : funcionarios) {
										if(f.getTipo() == 6) {
											System.out.println((Cozinheiro)f);
										}
									}
									
									System.out.println("\nLista de advogados");
									for(Funcionario f : funcionarios) {
										if(f.getTipo() == 7) {
											System.out.println((Advogado)f);
										}
									}
									
									System.out.println("\nLista de jogadores");
									for(Funcionario f : funcionarios) {
										if(f.getTipo() == 8) {
											System.out.println((Jogador)f);
										}
									}
								}				
															
								break;
								
							case 2:
								System.out.print("------------------------------\n"
										+ "	"+"Relatório recursos físicos\n"
										+ "------------------------------\n");
								System.out.println("Deseja ver sobre: \n"
										+ "1 - Transporte\n"
										+ "2 - Centro de treinamento\n"
										+ "3 - Estádio");
								int opR = scanner.nextInt();
								
								switch(opR) {
								case 1:
									System.out.print("------------------------------\n"
											+ "	"+"Ônibus\n"
											+ "------------------------------\n");
									ArrayList<Onibus> bus = banco.onibus;
									
									int cont = 1;
									for(Onibus o: bus) {
										System.out.println("Ônibus "+cont);
										System.out.println(o);
										cont++;
									}
									if(cont==1) {
										System.out.println("Não há ônibus cadastrados.");
									}
									break;
									
								case 2:
									try {
										System.out.print("------------------------------\n"
												+ "	"+"Centro de treinamento\n"
												+ "------------------------------\n");
										CentroTreinamento centro = banco.centros.get(0);
										if(centro==null) {
											System.out.println("Não há nenhum centro de treinamento cadastrado.");
										}
										System.out.println(centro);
									} catch(Exception e) {
										System.out.println("Ocorreu algum erro!");
									}								
									
									break;
									
								case 3:
									try {
										System.out.print("------------------------------\n"
												+ "	"+"Estádio\n"
												+ "------------------------------\n");
										Estadio estadio = banco.estadios.get(0);
										if(estadio==null) {
											System.out.println("Não há nenhum estádio cadastrado.");
										}
										System.out.println(estadio);
									} catch(Exception e) {
										System.out.println("Ocorreu algum erro!");
									}
									
									break;
								}
								
								break;
								
							case 3:
								System.out.print("------------------------------\n"
										+ "	"+"Relatório sócio-torcedor\n"
										+ "------------------------------\n");
								System.out.println("Quantidade: "+banco.socios.size());
								
								System.out.println("\nADIMPLENTE\n");
								ArrayList<SocioTorcedor> sociosAdimplentes = banco.buscarSociosAdimplentes();
								for(SocioTorcedor s: sociosAdimplentes) {
									System.out.println(s);
								}
								
								System.out.println("INADIMPLENTE\n");
								ArrayList<SocioTorcedor> sociosInadiplentes = banco.buscarSociosInadiplentes();
								for(SocioTorcedor s: sociosInadiplentes) {
									System.out.println(s);
								}
								
								System.out.println("Lista com dados individuais\n");
								for(SocioTorcedor s: banco.socios) {
									System.out.println(s);
								}
								
								break;
							}
							
							break;		
							
						case 6:
							main(args);
							break;
							
						}
					
					}
			}
			
			else {
				System.out.println("Login ou senha inválidos! Login e senha são admin!");
			}
		}
	}
}
