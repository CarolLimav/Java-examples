package Farmacia;

public class MedicamentoControlado extends Medicamento {

	public MedicamentoControlado(String nome, int qtdDisponivel, int codigo, double preco) {
		super(nome, qtdDisponivel, codigo, preco);
		// TODO Auto-generated constructor stub
	}
	
	public void vender(int quantidade) {
        if (quantidade <= getQtdDisponivel() * 0.02) {
        	System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
        	setQtdDisponivel(getQtdDisponivel() - quantidade); 
        	System.out.println("Venda realizada: " + quantidade + " unidades de " + getNome());  
        }
    }
	
	public void devolver(int quantidade) {
		if(quantidade > 0) {
			setQtdDisponivel(getQtdDisponivel() + quantidade);
		}
	}

}
