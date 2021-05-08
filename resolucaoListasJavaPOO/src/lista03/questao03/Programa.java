package lista03.questao03;

public class Programa {

	public static void main(String[] args) {
		Livro livro = new Livro();
		Pessoa pessoa = new Pessoa();
		Emprestimo emprestimo = new Emprestimo();
		
		livro.cadastrarLivro();
		livro.mostrarLivros();
		pessoa.cadastrarCliente();
		pessoa.listaDeClientes();
		emprestimo.emprestimosDeLivros();
		emprestimo.emprestimosRealizados();
	}
}