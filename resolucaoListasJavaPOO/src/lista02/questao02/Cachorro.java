package lista02.questao02;

import java.util.Scanner;

public class Cachorro {
	private String nome;
	private String ra�a;
	private char sexo;
	private int idade;
	
	Cachorro(){}

	public Cachorro(String nome, String ra�a, char sexo, int idade) {
		super();
		this.nome = nome;
		this.ra�a = ra�a;
		this.sexo = sexo;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int validaIdade() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Idade: ");
		do{
			this.idade = sc.nextInt();
			if(this.idade < 0 || this.idade > 25)
				System.out.println("Idade Inv�lida. Digite novamente.");
		}while(this.idade < 0 || this.idade > 25);
		
		return this.idade;
	}
	
	public void apresentarDados(){
		System.out.println();
		System.out.println("Dados cadastrados.");
		System.out.printf(" Nome: %s\n Ra�a: %s\n Sexo: %c\n Idade: %d\n", this.nome, this.ra�a, this.sexo, this.idade);
	}
}
