package lista10.questao03;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
	private String nome;
	private double nota1, nota2, mediaNotas, mediaTurma;
	double notas1, notas2, acumuloNotas;
	ArrayList<Aluno> alunos = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	Aluno aluno;
	int op;
	
	public void cadastrarAlunos() {
		do {
			aluno = new Aluno();
			System.out.println("-- Cadastro de aluno --");
			System.out.print("Nome: ");
			aluno.setNome(sc.nextLine());
			System.out.print("Nota 1: ");
			aluno.setNota1(sc.nextDouble());
			System.out.print("Nota 2: ");
			aluno.setNota2(sc.nextDouble());
			aluno.setMediaNotas((aluno.getNota1() + aluno.getNota2()) / 2);
			alunos.add(aluno);
			
			System.out.print("\nDeseja cadastrar outro aluno? \n(1 - Sim | 2 - Não) \n");
			op = sc.nextInt();
			sc.nextLine();
		}while(op == 1);
	}
	
	public void apresentarAlunos() {
		System.out.println("\n-- Alunos cadastrados --");
		for (Aluno aluno : alunos) {
			System.out.printf("[Nome: %s | Nota 1: %.2f | Nota 2: %.2f | Media das notas: %.2f]\n", 
				aluno.getNome(), aluno.getNota1(), aluno.getNota2(), aluno.getMediaNotas());
		}
		this.apresentarTurma();
	}
	
	public void apresentarTurma() {
		System.out.println("\n-- Dados da turma --");
		System.out.print("Quantidade de alunos cadastrados: " + alunos.size());
		for (Aluno aluno : alunos) {
			notas1 += aluno.getNota1();
			notas2 += aluno.getNota2();
			acumuloNotas = notas1 + notas2;
			aluno.setMediaTurma(acumuloNotas / alunos.size());
		}
		System.out.printf("\nMedia da turma: %.2f", aluno.getMediaTurma());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getMediaNotas() {
		return mediaNotas;
	}
	public void setMediaNotas(double mediaNotas) {
		this.mediaNotas = mediaNotas;
	}

	public double getMediaTurma() {
		return mediaTurma;
	}

	public void setMediaTurma(double mediaTurma) {
		this.mediaTurma = mediaTurma;
	}
}