package chefes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Pessoa {
	private String nome;
	private Pessoa chefe;
	
	
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
		this.chefe = null;
	}

	public Pessoa(String nome, Pessoa chefe) {
		this.nome = nome;
		this.chefe = chefe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa getChefe() {
		return chefe;
	}

	public void setChefe(Pessoa chefe) {
		this.chefe = chefe;
	}
	
	public void listarSuperiores() {
		
		Pessoa chefeAtual=this.getChefe();
		
		if(chefeAtual!=null) {
			System.out.println(chefeAtual.getNome());
			chefeAtual.listarSuperiores();
		}
		
	}
	
	public abstract void listarSubordinados() throws EmpregadoNaoTemSubordinadoException; 
	
	public abstract void addSubordinado(Pessoa subordinado, int pos)throws EmpregadoNaoTemSubordinadoException; 		
			
}
