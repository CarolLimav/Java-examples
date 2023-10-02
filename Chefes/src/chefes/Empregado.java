package chefes;

public class Empregado extends Pessoa {

	public Empregado(String nome, Pessoa chefe) {
		super(nome, chefe);
	}

	
	
	public Empregado(String nome) {
		super(nome);
	}



	@Override
	public void listarSubordinados() throws EmpregadoNaoTemSubordinadoException {
		throw new EmpregadoNaoTemSubordinadoException();

	}

	@Override
	public void addSubordinado(Pessoa subordinado, int pos) throws EmpregadoNaoTemSubordinadoException {
		throw new EmpregadoNaoTemSubordinadoException();

	}

}


