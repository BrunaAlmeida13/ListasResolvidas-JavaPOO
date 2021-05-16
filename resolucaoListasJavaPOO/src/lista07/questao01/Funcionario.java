package lista07.questao01;

import java.util.Scanner;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	char opTipoFuncionario;
	Professor professor;
	Administrativo adm;
	Scanner sc = new Scanner(System.in);
	
	public Funcionario() {}
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public void registraFuncionario() {
		System.out.println("--- Resgistro ---");
		System.out.print("Nome: ");
		this.setNome(sc.nextLine());
		System.out.print("CPF: ");
		this.setCpf(sc.next());
		System.out.print("Salário: R$ ");
		this.setSalario(sc.nextDouble());
		System.out.printf("Qual o tipo de funcionário está sendo registrado?"
				+ "\nP - Professor\nA - Administrativo\n> ");
		do {
			opTipoFuncionario = sc.next().toUpperCase().charAt(0);
			switch (opTipoFuncionario) {
			case 'P': {
				professor = new Professor();
				professor.registraProfessor();
				break;
			}
			case 'A': {
				adm = new Administrativo();
				adm.registraAdministrativo();
				break;
			}
			default:
				System.out.println("Opção inválida");
				break;
			}
		} while(opTipoFuncionario != 'P' && opTipoFuncionario != 'A');
	}
	
	public void apresentaFuncionario() {
		System.out.println("\n--- Apresentação ---");
		System.out.println("Nome: " + this.getNome() + "\nCPF: " + this.getCpf() 
							+ "\nSalário: " + this.getSalario());
		if(opTipoFuncionario == 'P') {
			
			String apr = professor.getImpostoRenda(this.getSalario());
			System.out.println("Titulação: " + professor.getTitulacao() + apr);
			
		} else if (opTipoFuncionario == 'A') {
			
			String apr = adm.getContribuicaoSindical(this.getSalario());
			System.out.println("Dependentes: " + adm.getDependentes() + apr);
			
		}
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	
}