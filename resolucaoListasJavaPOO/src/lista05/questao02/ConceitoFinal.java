package lista05.questao02;

import java.util.ArrayList;
import java.util.Scanner;

public class ConceitoFinal {
	private int matricula;
	private char notaAlfanumerica;
	private float nota;
	char op;
	ConceitoFinal cf;
	ArrayList<ConceitoFinal> cfs = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void cadastroDeNotas() {
		System.out.println("--- Cadastro de conceitos finais ---");
		do {
			cf = new ConceitoFinal();
			
			System.out.print("Matrícula: ");
			cf.setMatricula(sc.nextInt());
			System.out.print("Nota: ");
			this.setNota(sc.nextFloat());
			
			if(this.getNota() >= 0 && this.getNota() <= 4.9) {
				cf.setNotaAlfanumerica('D');
			} else if(this.getNota() >= 5.0 && this.getNota() <= 6.9) {
				cf.setNotaAlfanumerica('C');
			} else if(this.getNota() >= 7.0 && this.getNota() <= 8.9) {
				cf.setNotaAlfanumerica('B');
			} else if(this.getNota() >= 9.0 && this.getNota() <= 10) {
				cf.setNotaAlfanumerica('A');
			}
			
			cfs.add(cf);
			
			System.out.println("Cadastrar outra nota? (S/N)");
			op = sc.next().charAt(0);
		} while(op == 's' || op =='S');
	}
	
	public void apresentarConceitosFinais() {
		System.out.println("\n--- Conceitos Finais ---");
		for (ConceitoFinal cfs : cfs) {
			System.out.printf("[Matricula: %d | Conceito final: %c]\n", cfs.getMatricula(), cfs.getNotaAlfanumerica());
		}
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public char getNotaAlfanumerica() {
		return notaAlfanumerica;
	}
	public void setNotaAlfanumerica(char notaAlfanumerica) {
		this.notaAlfanumerica = notaAlfanumerica;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
}