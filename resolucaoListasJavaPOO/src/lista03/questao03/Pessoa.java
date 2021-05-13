package lista03.questao03;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
	Scanner sc = new Scanner(System.in);
	private String nome;
	private String email;
	private String telefone;
	private int matricula = 1;
	char op;
	boolean validado;
	Pessoa pessoa;
	ArrayList<Pessoa> pessoas = new ArrayList<>();
	
	public void cadastrarCliente() {
		do {
			pessoa = new Pessoa();
			System.out.println("--- Cadastro de cliente ---");
			System.out.print("Nome: ");
			pessoa.setNome(sc.nextLine());
			System.out.print("E-mail: ");
			pessoa.setEmail(sc.nextLine());
			System.out.print("Telefone: ");
			pessoa.setTelefone(sc.nextLine());
			pessoa.matricula = this.matricula++;
			pessoas.add(pessoa);
			
			System.out.println("Deseja cadastrar outro cliente? (S/N)");	
			op = sc.next().charAt(0);
			sc.nextLine();
		}while(op == 's' || op == 'S');
	}
	
	public void listaDeClientes() {
		System.out.println("--- Clientes cadastrados ---");
		for(Pessoa p: pessoas) {
			System.out.printf("\n[Nome: %s | E-mail: %s | Telefone: %s | Matricula: %d]\n", p.getNome(), 
							  p.getEmail(), p.getTelefone(), p.getMatricula());
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getMatricula() {
		return matricula;
	}
	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}
}