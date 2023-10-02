//Faça um programa Orientado a Objeto em Java que calcule o salário do mês de funcionários em uma Escola e quanto será a folha de 
//pagamento do mês. Solicite que seja informado o valor do salário base do funcionário, quantos dias este faltou de trabalho,
//a quantidade de horas extras efetuadas durante o mês e o tipo de Funcionário (Funcionário Administrativo ou Professor). 
//Para os funcionários administrativos considere que o valor descontado por dia de trabalho é calculado sobre o total de 30 dias de 
//trabalho no mês e que o valor da hora extra é 1.5 da hora normal do funcionário (tomando em consideração 30x8 horas mensais). 
//No caso dos professores não existem descontos por causa de faltas, já que estes sempre terão de repor as aulas não ministradas. 
//Além disso, os professores trabalham apenas 12 dias por mês com uma carga horária de 8 horas por dia e o valor da hora extra deles é
//2.5 da hora normal.
package FolhaPagamento;

import java.util.Scanner;

import FolhaPagamento.Administrativo;
import FolhaPagamento.Escola;
import FolhaPagamento.Funcionario;
import FolhaPagamento.Professor;

public class Teste {
	public static void main(String[] args) {
		Escola escola= new Escola();
		
		Scanner scan= new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			Funcionario funcionario=null;
			System.out.println("Digite o salario base:");
			double salarioBase= scan.nextDouble();

			System.out.println("Digite o numero de faltas :");
			int faltas = scan.nextInt();

			System.out.println("Digite as horas extras:");
			double horas= scan.nextDouble();
			System.out.println("Digite 1 para Professor e 2 Para Adm:");
			int op=scan.nextInt();
			if (op==1) {
				
				funcionario=new Professor(salarioBase, faltas, horas);
			}else {
				funcionario= new Administrativo(salarioBase, faltas, horas);
			}
			
			escola.addFuncionario(funcionario, i);
		}
		System.out.println("Imprimir FOLHA:");
		System.out.println("________________");
		
		escola.imprimirFolha();
	}
}







