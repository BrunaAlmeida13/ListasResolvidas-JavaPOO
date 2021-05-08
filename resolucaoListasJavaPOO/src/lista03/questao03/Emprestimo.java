package lista03.questao03;

import java.util.ArrayList;
import java.util.Scanner;

public class Emprestimo {
	Scanner sc = new Scanner(System.in);
	private int idLivro;
	private int matriculaCliente;
	Emprestimo empr;
	ArrayList<Emprestimo> emprestimos;
	Pessoa pessoa = new Pessoa();
	Livro livro = new Livro();
	
	public void emprestimosDeLivros() {
		empr = new Emprestimo();
		emprestimos = new ArrayList<>();
		System.out.println("--- Sistema de empr�stimos ---");
		System.out.print("ID do livro: ");
		empr.idLivro = sc.nextInt();
		
			if(empr.getIdLivro() == livro.getId()) {
				System.out.print("Matr�cula do cliente: ");
				empr.matriculaCliente = sc.nextInt();
					if(empr.getMatriculaCliente() == pessoa.getMatricula()) {
						emprestimos.add(empr);
						System.out.println("Empr�stimo realizado com sucesso!");
					} else {
						System.out.println("Cliente n�o cadastrado!");
					}
			} else {
				System.out.println("Livro n�o cadastrado!");
			}
	}
	
	public void emprestimosRealizados() {
		System.out.println("--- Empr�stimos realizados: ---");
		for(Emprestimo e: emprestimos) {
			if(e.getMatriculaCliente() == pessoa.getMatricula())
				System.out.printf("[Matricula cliente: %d | ID livro: %d]\n", pessoa.getMatricula(), e.getMatriculaCliente());
		}
	}

	public int getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}

	public int getMatriculaCliente() {
		return matriculaCliente;
	}

	public void setMatriculaCliente(int matriculaCliente) {
		this.matriculaCliente = matriculaCliente;
	}

	public ArrayList<Emprestimo> getEmprestimos() {
		return emprestimos;
	}
}