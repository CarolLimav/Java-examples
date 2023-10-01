package cinema;

public class Cinema {

	public static void main(String[] args) throws SemBilhetesDisponiveisException {
	
	    Sala salaGrande = new SalaGrande ("Sala Grande");
		Sala salaMedia = new SalaMedia("Sala Media", false);
		Sala salaPequena = new SalaPequena ("Sala Pequena");
		
		Sessao sessao1 = new Sessao (salaGrande);
		Sessao sessao2 = new Sessao (salaMedia);
		Sessao sessao3 = new Sessao(salaPequena);
		
		sessao1.venderBilhetes(1);
		sessao2.venderBilhetes(1);
		sessao3.venderBilhetes(1);
		
		double lucroTotal = sessao1.calcularLucro()+ sessao2.calcularLucro()+ sessao3.calcularLucro(); 
		
		System.out.println(sessao1);
		System.out.println(sessao2);
		System.out.println(sessao3);
		
		System.out.println("Lucro Total do cinema: R$" + lucroTotal);
	}

}
