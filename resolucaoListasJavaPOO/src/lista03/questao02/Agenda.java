package lista03.questao02;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

	Contato cont = new Contato();
	char op;
	
	public Agenda() {}
	
	public void adicionarContato() {
		Scanner sc = new Scanner(System.in);
		Contato cont = new Contato();
		ArrayList<Contato> contato = new ArrayList<>();
		
		do {
			
			System.out.printf("Adicionando contato\n");
			System.out.printf("Nome: \n");
			cont.setNome(sc.nextLine());
			System.out.printf("Telefone: \n");
			cont.setTelefone(sc.next());
			System.out.printf("E-mail: \n");
			cont.setTelefone(sc.next());
			contato.add(cont);
			
			System.out.printf("Deseja adicionar outro contato? s/n\n");
			
			op = sc.next().charAt(0);
			
			sc.nextLine();

		} while(op == 's' || op == 'S');
		sc.close();
	}
	
	public void mostrarAgenda(ArrayList<Contato> contato) {
		System.out.println();
		System.out.println("Contatos: ");
		for(Contato c: contato) {
			System.out.println(c.getNome());
			System.out.println(c.getTelefone());
			System.out.println(c.getEmail());
		}
	}

	
}