package aula07;

import java.util.Date;

public class Edicao {
    private int numero;
    private Date data;
    private int tiragem;
    private int qtdeVendida;
    private boolean reciclou;

    public Edicao(int numero, int qtdeVendida, int tiragem, Date data) {
        this.reciclou = false;
        this.data = new Date();
        this.numero = numero;
        this.qtdeVendida = qtdeVendida;
        this.tiragem = tiragem;
    }

    public void reciclarExemplares(){
        this.reciclou = true;
    }

    public int getNumero() {
        return numero;
    }

    public Date getData() {
        return data;
    }

    public int getTiragem() {
        return tiragem;
    }

    public int getQtdeVendida() {
        return qtdeVendida;
    }

    public boolean getReciclou() {
        return reciclou;
    }

    public int obterQtdeReciclagem() {
        return tiragem - qtdeVendida;
    }
}
