package cinema;

public class Sessao {
	private Sala sala;
	private int bilhetesVendidos;
	
	public Sessao(Sala sala) {
		super();
		this.sala = sala;
		this.bilhetesVendidos = 0;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public int getBilhetesVendidos() {
		return bilhetesVendidos;
	}

	public void setBilhetesVendidos(int bilhetesVendidos) {
		this.bilhetesVendidos = bilhetesVendidos;
	}
	
	public void venderBilhetes(int qtd) throws SemBilhetesDisponiveisException{
		if(qtd <= sala.getLugares()- bilhetesVendidos) {
			bilhetesVendidos += qtd;
		}else {
			throw new SemBilhetesDisponiveisException();
		}
	}
	
	public double calcularLucro() {
		return bilhetesVendidos * sala.calcularCustoBilhete();
	}
	
	public String toString() {
		return "Sessão:"+ sala.getId()+ " Bilhetes Vendidos:"+ bilhetesVendidos; 
	}
	
}
