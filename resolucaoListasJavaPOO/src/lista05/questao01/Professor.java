package lista05.questao01;

import java.util.ArrayList;
import java.util.Scanner;

public class Professor {
	private String nome;
	private String cpf;
	private int opTitulacao, calcMestres = 0;
	private String titulacao;
	private double salario;
	char op;
	Professor professor;
	ArrayList<Professor> professores = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void cadastrarProfessor() {
		do {
		professor = new Professor();
		System.out.println("--- Cadastro de professor ---");
		System.out.print("Nome: ");
		professor.setNome(sc.nextLine());
		System.out.print("CPF: ");
		professor.setCpf(sc.next());
		System.out.print("Salário: R$ ");
		professor.setSalario(sc.nextDouble());
		System.out.printf("Titulação: \n1 - Doutor \n2 - Mestre \n3 - Especialista  ");
			do {
				this.setOpTitulacao(sc.nextInt());
				switch (this.getOpTitulacao()) {
					case 1: {
						this.setTitulacao("Doutor");
						break;
					}
					case 2: {
						this.setTitulacao("Mestre");
						this.calcMestres++;
						break;
					}
					case 3: {
						this.setTitulacao("Especialista");
						break;
					}
					default: {
						System.out.println("Valor inválido!");
					}
				} 
			}while(this.getOpTitulacao() != 1 && this.getOpTitulacao() != 2 && this.getOpTitulacao() != 3);	

		professores.add(professor);
		
		System.out.println("Deseja cadastrar outro professor? (S/n) ");
		op = sc.next().charAt(0);
		sc.nextLine();
		} while(op == 's' || op == 'S');
	}

	public void mostrarProfessoresCadastrados() {
		System.out.println("\n--- Lista de professores cadastrados ---");
		for (Professor professor : professores) {
			System.out.printf("[Nome: %s | CPF: %s | Titulação: %s]\n", professor.getNome(), professor.getCpf(), professor.getTitulacao());
		}
	}
	
	public void apresentarQntdDeMestres() {
		System.out.println("Quantidade de Mestres cadastrados: " + this.getCalcMestres());
	}
	
	public void calculoArrecadacaoSindicato() {
		double arrecadacaoDoutor = 0, arrecadacaoMestre = 0, arrecadacaoEspecialista = 0;
		double resultadoArrecadacao = 0;
		
		for (Professor professor : professores) {
			if(this.getOpTitulacao() == 1) {
				arrecadacaoDoutor += (professor.getSalario() * 1.6)/100;
			} else if(this.getOpTitulacao() == 2) {
				arrecadacaoMestre += (professor.getSalario() * 1.4)/100;
			} else if(this.getOpTitulacao() == 3) {
				arrecadacaoEspecialista += (professor.getSalario() * 1.2)/100;
			}
		}
		
		resultadoArrecadacao = arrecadacaoDoutor + arrecadacaoMestre + arrecadacaoEspecialista;
		
		System.out.println("Arrecadação do sindicado: " + resultadoArrecadacao);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getOpTitulacao() {
		return opTitulacao;
	}
	public void setOpTitulacao(int opTitulacao) {
		this.opTitulacao = opTitulacao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public int getCalcMestres() {
		return calcMestres;
	}
	public double getSalario() {
		return salario;
	}	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}