package Pesquisa;

class Pesquisador {
    private String nome;
    private Pesquisador coordenador;

    public Pesquisador(String nome) {
        this.nome = nome;
    }

    public void setCoordenador(Pesquisador coordenador) {
        this.coordenador = coordenador;
    }

    public Pesquisador getCoordenador() {
        return coordenador;
    }

    public int getQtdPesquisadores() {
        return 0; 
    }

    public double getValorPago() {
        return 0.0; 
    }
}
