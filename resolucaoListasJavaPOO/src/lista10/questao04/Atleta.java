package lista10.questao04;

import java.util.ArrayList;
import java.util.Scanner;

public class Atleta {
	private String nome;
	private int idade, tempoDeProva;
	private boolean elite;
	int melhorAtleta = 0, menorTempo;
	String nomeMelhor;
	int op;
	Atleta atleta;
	Scanner sc = new Scanner(System.in);
	private ArrayList<Atleta> atletas = new ArrayList<>(1200);
	
	public void cadastroDeAtleta() {
		System.out.println("--- Cadastro de atleta ---");
		do {
			atleta = new Atleta();
			System.out.print("\nNome: ");
			atleta.setNome(sc.nextLine());
			System.out.print("Idade: ");
			atleta.setIdade(sc.nextInt());
			System.out.print("Tempo de prova: ");
			atleta.setTempoDeProva(sc.nextInt());
			
			atletas.add(atleta);
			
			System.out.print("\nDeseja cadastrar outro atleta?\n(1 - Sim | 2 - Não) > ");
			op = sc.nextInt();
			sc.nextLine();
		}while(op == 1);
	}
	
	public void relatorio() {
		System.out.println("\n\n--- Relatório ---");
		this.melhorAtleta();
		this.categoria30a34Anos();
	}
	
	public void melhorAtleta() {
		for(int i = 0; i < atletas.size(); i++) {
			menorTempo = atletas.get(0).getTempoDeProva();
			if(atletas.get(i).getTempoDeProva() < menorTempo) {
				melhorAtleta = atletas.get(i).getTempoDeProva();
			}
			if(atletas.get(i).getTempoDeProva() == melhorAtleta) {
				nomeMelhor = atletas.get(i).getNome();
			}
		}
		System.out.println("Melhor atleta da competição:\nTempo de prova: " + melhorAtleta 
				+ "h | Nome: " + nomeMelhor);
	}
	
	public void categoria30a34Anos() {
		System.out.println("Categoria 30 a 34 anos:");
		for (Atleta atleta : atletas) {
			if(atleta.getIdade() >= 30 && atleta.getIdade() <= 34) {
				System.out.println("Nome: " + atleta.getNome() + " | Idade: " + atleta.getIdade());
			}
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getTempoDeProva() {
		return tempoDeProva;
	}
	public void setTempoDeProva(int tempoDeProva) {
		this.tempoDeProva = tempoDeProva;
	}

	public boolean isElite(int tempoDeProva) {
		if(tempoDeProva > 5)
			return false;
		else 
			return true;
	}

	public void setElite(boolean elite) {
		this.elite = elite;
	}
}