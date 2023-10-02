package Pesquisa;

import java.util.ArrayList;

public class ProjetoPesquisa {
    private ArrayList<Pesquisador> pesquisadoresCadastrados = new ArrayList<>();

    public void inserirPesquisador(Pesquisador pesquisador) {
        pesquisadoresCadastrados.add(pesquisador);
    }

    public int getQtdPesquisadores(Pesquisador pesquisador) {
        return pesquisador.getQtdPesquisadores();
    }

    public double getValorPago(Pesquisador pesquisador) {
        return pesquisador.getValorPago();
    }
}
