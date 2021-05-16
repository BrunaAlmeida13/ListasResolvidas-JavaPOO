package lista08.questao02;

public class Vendedor implements Funcionario {

	@Override
	public double venda(double valorVenda) {
		return (valorVenda * 10) / 100;
	}

}
