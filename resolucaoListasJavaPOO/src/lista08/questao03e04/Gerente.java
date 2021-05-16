package lista08.questao03e04;

public class Gerente extends Funcionario{
	@Override
	public void setSalario(double salario) {
		double acrescimo = (salario * 25) / 100;
		double total = salario + acrescimo;
		super.setSalario(total);
	}
}