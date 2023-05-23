package br.com.unit.aula08;
import java.util.Date;

public class Consumo {
    private static int contId = 0;
    private int idConsumo;
    private Date data;
    private char tipoConsumo;
    private char tipoCliente;
    private double valorConsumo;
    private double valorConta;

    public Consumo(double valorConsumo){

        idConsumo = ++contId;
        this.data = new Date();
        this.tipoConsumo = 'C';
        this.tipoCliente = tipoCliente;
        this.valorConsumo = valorConsumo;

        fechaConta(valorConsumo);
    }

    public Consumo(double valorConsumo, char tipoCliente){
        idConsumo = ++contId;
        this.data = new Date();
        this.tipoConsumo = 'P';
        this.tipoCliente = tipoCliente;
        this.valorConsumo = valorConsumo;

        fechaConta(valorConsumo, tipoCliente);
    }

    public void fechaConta(double valorConsumo){
        this.valorConta = valorConsumo + (valorConsumo * 10/100.0);
    }

    public void fechaConta(double valorConsumo, char tipoCliente){
        if (tipoCliente == 'F'){
            this.valorConta = valorConsumo - 10;
        }else if (tipoCliente == 'A'){
            if (valorConsumo <= 30){
                this.valorConta = valorConsumo - 3;
            }else{
                this.valorConta = valorConsumo - 5;
            }
        }
    }

    @Override
    public String toString(){
        return "Consumo [idConsumo=" + idConsumo + ", data=" + data + ", tipoConsumo=" + tipoConsumo + ", tipoCliente=" + tipoCliente + ", valorConsumo=" + valorConsumo + ", valorConta=" + valorConta + "]";
    }

    public static int getContId() {
        return contId;
    }

    public int getIdConsumo() {
        return idConsumo;
    }

    public Date getData() {
        return data;
    }

    public char getTipoConsumo() {
        return tipoConsumo;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    public double getValorConsumo() {
        return valorConsumo;
    }

    public double getValorConta() {
        return valorConta;
    }
}


