package Farmacia;

public class MedicamentoNaoControlado extends Medicamento {

	public MedicamentoNaoControlado(String nome, int qtdDisponivel, int codigo, double preco) {
		super(nome, qtdDisponivel, codigo, preco);
		
	}
	
	public void vender(int quantidade) {
		  if (quantidade <= getQtdDisponivel()) {
	        	System.out.println("Estoque insuficiente para realizar a venda.");
	        } else {
	        	setQtdDisponivel(getQtdDisponivel() - quantidade); 
	        	System.out.println("Venda realizada: " + quantidade + " unidades de " + getNome());  
	     }
	}
	
}
