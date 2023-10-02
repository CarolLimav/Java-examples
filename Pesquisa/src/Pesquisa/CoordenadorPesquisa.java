package Pesquisa;

import java.util.ArrayList;

public class CoordenadorPesquisa extends Pesquisador {
    private ArrayList<Pesquisador> pesquisadoresSubordinados = new ArrayList<>();

    public CoordenadorPesquisa(String nome) {
        super(nome);
    }

    public void adicionarPesquisadorSubordinado(Pesquisador pesquisador) {
        pesquisadoresSubordinados.add(pesquisador);
        pesquisador.setCoordenador(this);
    }

    @Override
    public int getQtdPesquisadores() {
        return pesquisadoresSubordinados.size();
    }

    @Override
    public double getValorPago() {
        double valorPago = 300.0;
        for (Pesquisador pesquisador : pesquisadoresSubordinados) {
            valorPago -= 0.025 * pesquisador.getValorPago();
        }
        return valorPago;
    }
}
