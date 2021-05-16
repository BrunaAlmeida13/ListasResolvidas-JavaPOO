package lista08.questao03e04;

public class Programa {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		Funcionario funcionario = new Funcionario();
		Diretor diretor = new Diretor();
		
		funcionario.setNome("Pessoa1");
		funcionario.setIdade(23);
		funcionario.setSalario(2000.00);
		funcionario.setCargo("Atendente");

		gerente.setNome("Pessoa2");
		gerente.setIdade(32);
		gerente.setSalario(3000.00);
		
		diretor.setNome("Pessoa3");
		diretor.setIdade(40);
		diretor.setSalario(10000.00);
		
		System.out.println("Funcionário: " + funcionario.getNome() + "\n" + funcionario.getIdade() 
		+ "\n" + funcionario.getCargo());
		
		System.out.println();
		
		System.out.println("Gerente: " + gerente.getNome() + "\n" + gerente.getIdade() + "\n" 
		+ gerente.getSalario());
		
		System.out.println();
		
		System.out.println("Diretor: " + diretor.getNome() + "\n" + diretor.getIdade() + "\n" 
				+ diretor.getSalario());
	}
}