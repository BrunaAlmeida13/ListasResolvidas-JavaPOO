package lista08.questao03e04;

public class Diretor extends Gerente {
	
	@Override
	public void setSalario(double salario) {
		double acrescimo = (salario * 50) / 100;
		double total = salario + acrescimo;
		super.setSalario(total);
	}
}