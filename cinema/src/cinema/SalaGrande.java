package cinema;

public class SalaGrande extends Sala {

	public SalaGrande(String id) {
		super(id, 500, 0.10);
		
	}
	@Override
	public double calcularCustoBilhete() {
		return 12.00;
	}

}
