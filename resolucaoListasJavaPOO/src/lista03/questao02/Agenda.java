package lista03.questao02;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	ArrayList<Contato> contato = new ArrayList<>();
	char op;
	
	public Agenda() {}
	
	public void adicionarContato() {
		Scanner sc = new Scanner(System.in);

		do {
			Contato cont = new Contato();
			System.out.printf("Adicionando contato\n");
			System.out.printf("Nome: \n");
			cont.setNome(sc.nextLine());
			System.out.printf("Telefone: \n");
			cont.setTelefone(sc.next());
			System.out.printf("E-mail: \n");
			cont.setEmail(sc.next());
			contato.add(cont);
			
			System.out.printf("Deseja adicionar outro contato? s/n\n");
			
			op = sc.next().charAt(0);
			
			sc.nextLine();

		} while(op == 's' || op == 'S');
		sc.close();
	}
	
	public void mostrarAgenda() {
		System.out.printf("\nContatos: \n");
		for(Contato c: contato) {
			System.out.println("Nome: " + c.getNome());
			System.out.println("Telefone: " + c.getTelefone());
			System.out.println("E-mail: " + c.getEmail());
			System.out.printf("-------------------------------\n");
		}
	}
}