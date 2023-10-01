package cinema;

public abstract class Sala {
 private String id;
 private int lugares;
 private double percentualNaoVendido;
 
 public Sala(String id, int lugares, double percentualNaoVendido) {
		super();
		this.id = id;
		this.lugares = lugares;
		this.percentualNaoVendido = percentualNaoVendido;
 }
	 
 public String getId() {
	return id;
 }
 public void setId(String id) {
	this.id = id;
 }
 public int getLugares() {
	return lugares;
 }
 public void setLugares(int lugares) {
	this.lugares = lugares;
 }
 public double getPercentualNaoVendido() {
	return percentualNaoVendido;
 }
 public void setPercentualNaoVendido(double percentualNaoVendido) {
	this.percentualNaoVendido = percentualNaoVendido;
 }
 
 public abstract double calcularCustoBilhete(); 
 
}
