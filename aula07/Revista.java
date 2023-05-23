package aula07;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Revista {
    private int codigo;
    private String titulo;
    private int reciclagemProduzida;
    private List<Edicao> edicoes = new ArrayList<>();

    public Revista(int codigo, String titulo){
        this.reciclagemProduzida = 0;
        this.codigo = codigo;
        this.titulo = titulo;

    }

    public void adicionarEdicao(int nr, Date dt, int trgn, int qv){
        Edicao edicao = new Edicao(nr, qv, trgn, dt);
        edicoes.add(edicao);

    }

    public void removerEdicao(Edicao edicao){
        for(Edicao edicaoEncontrada : edicoes){
            if (edicaoEncontrada == edicao){
                edicoes.remove(edicaoEncontrada);
            }
        }
    }

    public String reciclarEdicao(int nrEdicao){
        String auxiliar = "Edição não encontrada";
        for (Edicao edicao : edicoes){
            if (edicao.getNumero() == nrEdicao){
                if (edicao.getReciclou()){
                    auxiliar = "Edição já reciclada";
                    this.reciclagemProduzida = 0;
                    break;
                }else{
                    if (edicao.obterQtdeReciclagem() != 0){
                        this.reciclagemProduzida = edicao.obterQtdeReciclagem();
                        edicao.reciclarExemplares();
                        auxiliar = "Reciclagem realizada";
                    }else{
                        auxiliar = "Não houve exemplares para reciclar";
                    }

                }

            }
        }

        return auxiliar;

    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getReciclagemProduzida() {
        return reciclagemProduzida;
    }

    public List<Edicao> getEdicoes() {
        return edicoes;
    }
}
