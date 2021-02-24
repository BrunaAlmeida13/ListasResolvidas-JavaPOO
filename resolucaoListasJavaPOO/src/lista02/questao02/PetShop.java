package lista02.questao02;

import java.util.Scanner;

public class PetShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cachorro ca = new Cachorro();
		
		System.out.println("Sistema de cadastro.");
		System.out.println();
		System.out.print("Nome: ");
		ca.setNome(sc.nextLine());
		System.out.printf("Raça: ");
		ca.setRaça(sc.next());
		System.out.printf("Sexo (F/M): ");
		ca.setSexo(sc.next().charAt(0));
		ca.validaIdade();

		ca.apresentarDados();
		
		sc.close();
	}

}
