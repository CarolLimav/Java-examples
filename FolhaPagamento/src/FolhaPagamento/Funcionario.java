//Faça um programa Orientado a Objeto em Java que calcule o salário do mês de funcionários em uma Escola e quanto será a folha de 
//pagamento do mês. Solicite que seja informado o valor do salário base do funcionário, quantos dias este faltou de trabalho,
//a quantidade de horas extras efetuadas durante o mês e o tipo de Funcionário (Funcionário Administrativo ou Professor). 
//Para os funcionários administrativos considere que o valor descontado por dia de trabalho é calculado sobre o total de 30 dias de 
//trabalho no mês e que o valor da hora extra é 1.5 da hora normal do funcionário (tomando em consideração 30x8 horas mensais). 
//No caso dos professores não existem descontos por causa de faltas, já que estes sempre terão de repor as aulas não ministradas. 
//Além disso, os professores trabalham apenas 12 dias por mês com uma carga horária de 8 horas por dia e o valor da hora extra deles é
//2.5 da hora normal.

package FolhaPagamento;

public class Funcionario {
	
	private double salario;
	private int faltas;
	private double numeroHoras;
	private double salarioBase;
	
	public Funcionario(double salarioBase, int faltas, double numeroHoras) {
		this.salarioBase = salarioBase;
		this.faltas = faltas;
		this.numeroHoras = numeroHoras;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public double getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(double numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return "[salario=" + salario + ", faltas=" + faltas + "]";
	}
	
	
	

}
