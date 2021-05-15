package lista06.questao01;

import java.util.Scanner;

public class CalcularIMC {
	Scanner sc = new Scanner(System.in);
	private String nome;
	private char sexo;
	private float peso;
	private float altura;
	private int anoNasc;
	
	public void cadastrar() {
		System.out.println("Digite os seus dados");
		System.out.print("Nome: ");
		this.setNome(sc.nextLine());
		System.out.print("Sexo (F/M): ");
		this.setSexo(sc.next().charAt(0));
		System.out.print("Ano do seu nascimento: ");
		this.setAnoNasc(sc.nextInt());
		System.out.print("Peso: Kg ");
		this.setPeso(sc.nextFloat());
		System.out.print("Altura (em metros): ");
		this.setAltura(sc.nextFloat());
	}
	
	public void apresentarPessoa() {
		System.out.println("\n--- Resultado ---");
		System.out.print("\nNome:" + this.getNome());
		System.out.print("\nSexo: " + this.getSexo());
		this.calcularIdade();
		this.calculoDeIMC();
	}
	
	public void calculoDeIMC() {
		float IMC = (this.getAltura() * this.getAltura()) / this.getPeso();
		System.out.println("Resultado IMC:");
		if(IMC < 18.5) {
			System.out.println("Você está abaixo do peso ideal");
		} else if(IMC >= 18.5 && IMC <= 24.9) {
			System.out.println("Parabéns — você está em seu peso normal!");
		} else if(IMC >= 25.0 && IMC <= 29.9) {
			System.out.println("Você está acima de seu peso (sobrepeso)");
		} else if(IMC >= 30.0 && IMC <= 34.9) {
			System.out.println("Obesidade grau I");
		} else if(IMC >= 35.0 && IMC <= 39.9) {
			System.out.println("Obesidade grau II");
		} else if(IMC >= 40.0) {
			System.out.println("Obesidade grau III");
		}
	}
	
	private void calcularIdade() {
		int idade =  2021 - this.getAnoNasc();
		System.out.println("\nIdade: " + idade);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
}
