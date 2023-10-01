package cinema;

public class SalaPequena extends Sala {

	public SalaPequena(String id) {
		super(id, 100, 0.0);
	}

	@Override
	public double calcularCustoBilhete() {
		return 9.0; 
	}
	
}
