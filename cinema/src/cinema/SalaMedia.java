package cinema;

public class SalaMedia extends Sala{
	private boolean horarioNoturno;
	
	public SalaMedia(String id, boolean horarioNoturno) {
		super(id, 300, 0.0);
		this.horarioNoturno = horarioNoturno; 
	}

	@Override
	public double calcularCustoBilhete() {
		if(horarioNoturno) {
			return 12.00;
		}else {
			return 9.00; 
		}
		
	}

}
