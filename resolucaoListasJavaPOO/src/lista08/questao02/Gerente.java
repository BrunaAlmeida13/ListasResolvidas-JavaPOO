package lista08.questao02;

public class Gerente implements Funcionario {

	@Override
	public double venda(double valorVenda) {
		return (valorVenda * 15) / 100;
	}

}
