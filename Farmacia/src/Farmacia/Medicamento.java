package Farmacia;

public class Medicamento {
	
	private int qtdDisponivel;
	private int codigo;
	private double preco;
	private String nome;
	
	public Medicamento(String nome, int qtdDisponivel, int codigo, double preco) {
		super();
		this.qtdDisponivel = qtdDisponivel;
		this.codigo = codigo;
		this.preco = preco;
		this.nome = nome; 
	}
	
	public int getQtdDisponivel() {
		return qtdDisponivel;
	}
	public void setQtdDisponivel(int qtdDisponivel) {
		this.qtdDisponivel = qtdDisponivel;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void vender(int quantidade) {
        if (quantidade <= qtdDisponivel) {
        	qtdDisponivel -= quantidade;
            System.out.println("Venda realizada: " + quantidade + " unidades de " + getNome());
        } else {
            System.out.println("Estoque insuficiente para realizar a venda.");
        }
    }
	
	
	public void devolver() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Preço: R$" + preco + ", Quantidade em Estoque: " + qtdDisponivel;
    }
	
}
