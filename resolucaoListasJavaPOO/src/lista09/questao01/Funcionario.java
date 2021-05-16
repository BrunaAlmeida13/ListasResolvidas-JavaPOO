package lista09.questao01;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	
	protected abstract void realizarAtividade();
	
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
}