package aula07;

import java.util.Date;
import java.util.List;

public class AppReciclagem {
    static String retorno;
    static List<Edicao> edicoes;
    static Revista revista = new Revista(1, "O lobo branco");

    public static void main(String[] args){

        revista.adicionarEdicao(52, new Date(), 1000, 800);
        revista.adicionarEdicao(53, new Date(), 900, 900);
        revista.adicionarEdicao(54, new Date(), 1200, 1000);

        edicoes = revista.getEdicoes();

        Mostrar(53);
        Mostrar(54);
        Mostrar(54);
        Mostrar(99);
    }

    public static void Mostrar(int nr){
        retorno = revista.reciclarEdicao(nr);
        System.out.println("Retorno 1: "+ retorno);

        for (Edicao edicaoEncontrada : edicoes){
            if (edicaoEncontrada.getNumero() == nr) {
                System.out.println("Reciclagem Produzida: " + revista.getReciclagemProduzida());
                System.out.printf("Reciclou: %b \n\n", edicaoEncontrada.getReciclou());
            }
        }
    }
}
