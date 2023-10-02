package Pesquisa;

public class Main {
    public static void main(String[] args) {
        ProjetoPesquisa projeto = new ProjetoPesquisa();

        CoordenadorPesquisa coordenador = new CoordenadorPesquisa("Mara Andrade");
        Professor professor1 = new Professor("Professor 1");
        Professor professor2 = new Professor("Professor 2");

        coordenador.adicionarPesquisadorSubordinado(professor1);
        coordenador.adicionarPesquisadorSubordinado(professor2);

        projeto.inserirPesquisador(coordenador);
        projeto.inserirPesquisador(professor1);
        projeto.inserirPesquisador(professor2);

        System.out.println("Quantidade de pesquisadores sob coordenação de Mara Andrade: " + projeto.getQtdPesquisadores(coordenador));
        System.out.println("Valor pago por Mara Andrade: R$" + projeto.getValorPago(coordenador));
        System.out.println("Valor pago pelo Professor 1: R$" + projeto.getValorPago(professor1));
        System.out.println("Valor pago pelo Professor 2: R$" + projeto.getValorPago(professor2));
    }
}