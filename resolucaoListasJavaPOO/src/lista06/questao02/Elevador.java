package lista06.questao02;

import java.util.Scanner;

public class Elevador {
	private int andarAtual = 0, totalDeAndares, capacidadeElevador, qtdePessoasElevador;
	int op;
	Scanner sc = new Scanner(System.in);
	
	public void inicializa() {
		System.out.print("Quantos andares tem no prédio? ");
		this.setTotalDeAndares(sc.nextInt());
		System.out.print("Qual a capacidade do elevador? (quantidade de pessoas) ");
		this.setCapacidadeElevador(sc.nextInt());
	}
	
	public void gestaoElevador() {
		this.inicializa();
		do {
			System.out.println("----------------");
			System.out.println("Escolha uma ação:");
			System.out.printf("1 - Entra\n2 - Sai\n3 - Sobe\n4 - Desce\n5 - Fechar programa\n> ");
			op = sc.nextInt();
				switch (op) {
				case 1: {
					this.entra();
					break;
				}
				case 2: {
					this.sai();
					break;
				}
				case 3: {
					this.sobe();
					break;
				}
				case 4: {
					this.desce();
					break;
				}
				case 5: {
					break;
				}	
				default:
					System.out.println("Digite um valor válido!");
				}
			
		}while(op != 5);
	}
	
	public void entra() {
		if(this.qtdePessoasElevador == this.getCapacidadeElevador()) 
			System.out.println("Não cabe mais ninguém!!");
		else 
			this.qtdePessoasElevador += 1;
		System.out.println("Quantidade de pessoas no elevador: " + this.getQtdePessoasElevador());
	}
	
	public void sai() {
		if(this.getQtdePessoasElevador() == 0) 
			System.out.println("Não tem ninguém no elevador!");
		else 
			this.qtdePessoasElevador -= 1;
		System.out.println("Quantidade de pessoas no elevador: " + this.getQtdePessoasElevador());		
	}
	
	public void sobe() {
		if(this.getAndarAtual() == this.getTotalDeAndares())
			System.out.println("Não tem mais pra onde subir!");
		else
			this.andarAtual += 1;
		System.out.println("Andar atual: " + this.getAndarAtual());		
	}
	
	public void desce() {
		if(this.getAndarAtual() == 0)
			System.out.println("Não tem mais pra onde descer!");
		else 
			this.andarAtual -= 1;
		System.out.println("Andar atual: " + this.getAndarAtual());	
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalDeAndares() {
		return totalDeAndares;
	}

	public void setTotalDeAndares(int totalDeAndares) {
		this.totalDeAndares = totalDeAndares;
	}

	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}

	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}

	public int getQtdePessoasElevador() {
		return qtdePessoasElevador;
	}

	public void setQtdePessoasElevador(int qtdePessoasElevador) {
		this.qtdePessoasElevador = qtdePessoasElevador;
	}
}