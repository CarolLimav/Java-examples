package Pesquisa;

class Professor extends Pesquisador {
    public Professor(String nome) {
        super(nome);
    }

    @Override
    public double getValorPago() {
        if (getCoordenador() != null) {
            return 220.0 + 0.3 * getCoordenador().getValorPago();
        } else {
            return 220.0;
        }
    }
}
