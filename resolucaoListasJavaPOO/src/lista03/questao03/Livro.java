package lista03.questao03;

import java.util.ArrayList;
import java.util.Scanner;

public class Livro {
	Scanner sc = new Scanner(System.in);
	private String nomeLivro;
	private String autor;
	char op;
	Livro livro;
	ArrayList<Livro> livros = new ArrayList<Livro>();
	
	public void cadastrarLivro() {
		do {
		livro = new Livro();
		System.out.println("--- Cadastro do livro ---");
		System.out.print("Nome do livro: ");
		livro.nomeLivro = sc.nextLine();
		System.out.print("Autor: ");
		livro.autor = sc.nextLine();
		livros.add(livro);
		
		System.out.printf("Deseja cadastrar outro livro? (S/N)\n");
		op = sc.next().charAt(0);
		sc.nextLine();
		}while(op == 's' || op == 'S');
		sc.close();
	}
	
	public void mostrarLivros() {
		System.out.println("--- Livros cadastrados---");
		for(Livro l: livros) {
			System.out.printf("[ Nome: %s | Autor(a): %s ]\n", l.getNomeLivro(), l.getAutor());
		}
	}

	public String getNomeLivro() {
		return nomeLivro;
	}
	public String getAutor() {
		return autor;
	}
}