package lista07.questao01;

import java.util.Scanner;

public class Administrativo extends Funcionario {
	private int dependentes;
	Scanner sc = new Scanner(System.in);
	
	public Administrativo() {}

	public void registraAdministrativo() {
		System.out.print("Quantos dependentes possui? ");
		this.setDependentes(sc.nextInt());
	}

	public String getContribuicaoSindical(double salario) {
		double contribuicao = (salario * 1) / 100;
		return "\nContribuição sindical: R$ " + contribuicao;
	}

	public int getDependentes() {
		return dependentes;
	}

	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}
}