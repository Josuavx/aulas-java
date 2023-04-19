package br.com.unit.aula04;

public class Exame {
    private int idExame;
    private String nomePaciente;
    private int nivelGlicose;

    public Exame(int idExame, String nome, int nivelGlicose){
        this.idExame = idExame;
        this.nomePaciente = nome;
        this.nivelGlicose = nivelGlicose;
    }

    public String obterDiagnostico(){
        if (this.nivelGlicose <= 99){
            return "Normal";
        }else if (this.nivelGlicose >= 100 && this.nivelGlicose <= 125){
            return "Pré-diabetes";
        }else if (this.nivelGlicose > 125){
            return "Diabetes";
        }
        return "";
    }

    public int getIdExame(){
        return this.idExame;
    }

    public String getNomePaciente(){
        return this.nomePaciente;
    }

    public int getNivelGlicose(){
        return this.nivelGlicose;
    }

    public void setNomePaciente(String nome) {
        this.nomePaciente = nome;
    }

    public void setNivelGlicose(int glicose) {
        this.nivelGlicose = glicose;
    }
}
