package chefes;

public class Chefe extends Pessoa {
	
	private Pessoa subordinados[];

	public Chefe(String nome, Pessoa chefe) {
		super(nome, chefe);
		this.subordinados=new Pessoa[10];
	}
	
	

	public Chefe(String nome) {
		super(nome);
		
	}

	@Override
	public void listarSubordinados() throws EmpregadoNaoTemSubordinadoException {
		for (int i = 0; i < subordinados.length; i++) {
			Pessoa pessoa = subordinados[i];
			System.out.println(pessoa.getNome());
			pessoa.listarSubordinados();	
		}

	}

	@Override
	public void addSubordinado(Pessoa subordinado, int pos) throws EmpregadoNaoTemSubordinadoException {
		// TODO Auto-generated method stub
		subordinado.setChefe(this);
		this.subordinados[pos]=subordinado;
	}

}

