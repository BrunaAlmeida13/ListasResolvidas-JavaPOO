package lista05.questao03;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Pessoa {
	private String nome;
	private int dia, mes, ano;
	private float Altura;
	Scanner sc = new Scanner(System.in);
	
	public void pegarDados() {
		System.out.print("Nome: ");
		this.setNome(sc.nextLine());
		System.out.print("Altura (em metros): ");
		this.setAltura(sc.nextFloat());
		System.out.println("- Data de nascimento: -");
		System.out.print("Dia:");
		this.setDia(sc.nextInt());
		System.out.print("Mês: ");
		this.setMes(sc.nextInt());
		System.out.print("Ano: ");
		this.setAno(sc.nextInt());
	}
	
	public void apresentarPessoa() {
		System.out.println();
		System.out.println(this.toString());
		this.calcularIdade();
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + "\nAltura: " + this.getAltura();
	}

	public void calcularIdade() {
		LocalDate dataNasc = LocalDate.of(getAno(), getMes(), getDia());
		LocalDate dataAtual = LocalDate.of(2021, 05, 14);
		
		Period periodo = Period.between(dataNasc, dataAtual);
		int idade = periodo.getYears();
		System.out.println("Idade: "+ idade);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getAltura() {
		return Altura;
	}
	public void setAltura(float altura) {
		Altura = altura;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}