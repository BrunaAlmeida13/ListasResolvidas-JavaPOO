package lista02.questao02;

public class Cachorro {
	private String nome;
	private String raça;
	private char sexo;
	private int idade;
	
	Cachorro(){}

	public Cachorro(String nome, String raça, char sexo, int idade) {
		super();
		this.nome = nome;
		this.raça = raça;
		this.sexo = sexo;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
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
	
	public void apresentarDados(){
		System.out.printf(" Nome: %s\n Raça: %s\n Sexo: %c\n Idade: %d\n", this.nome, this.raça, this.sexo, this.idade);
	}
}
