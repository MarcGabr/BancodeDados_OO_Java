package com.company;

public class Disciplina {
    private String Nome_Disciplina;
    private int ID_Disciplina;

    public Disciplina(String nome_Disciplina, int ID_Disciplina) {
        this.Nome_Disciplina = nome_Disciplina;
        this.ID_Disciplina = ID_Disciplina;
    }
    public Disciplina() {

    }
    public String getNome_Disciplina() {
        return Nome_Disciplina;
    }

    public void setNome_Disciplina(String nome_Disciplina) {
        Nome_Disciplina = nome_Disciplina;
    }

    public int getID_Disciplina() {
        return ID_Disciplina;
    }

    public void setID_Disciplina(int ID_Disciplina) {
        this.ID_Disciplina = ID_Disciplina;
    }
}
