package Farmacia;

public class MedicamentoComum extends Medicamento{

	public MedicamentoComum(String nome, int qtdDisponivel, int codigo, double preco) {
		super(nome, qtdDisponivel, codigo, preco);
		// TODO Auto-generated constructor stub
	}

	public void vender(int quantidade) {
		if(getPreco()< 2.50) {
			setQtdDisponivel(getQtdDisponivel() - quantidade + 1);
		}else {
			getQtdDisponivel() -= quantidade; 
		}
		
	}
}
