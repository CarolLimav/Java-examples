package Farmacia;

import java.util.ArrayList;

public class Farmacia {
	
	public static void main(String args[]) {
	Medicamento medicamentoComum = new MedicamentoComum("Dipirona", 500, 123, 12.0);
	Medicamento medicamentoControlado = new MedicamentoControlado("Rivotril", 400, 456, 45.00);
	Medicamento medicamentoNaoControlado = new MedicamentoNaoControlado("Polaramine", 700, 789, 25.00);
	
	
	medicamentoComum.vender(12);
	medicamentoControlado.devolver();
	medicamentoNaoControlado.vender(1);
	
	System.out.println(medicamentoComum);
	System.out.println(medicamentoControlado);
	System.out.println(medicamentoControlado);
	
	}
}
