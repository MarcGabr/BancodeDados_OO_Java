package com.company;

public class Materia {
    private int ID_Disciplina;
    private int Numero_Certificado;
    private String Link;
    private String Nome_Materia;
    private int ID_Materia;
    private String Descricao;

    public Materia(int ID_Disciplina, int numero_Certificado, String link, String nome_Materia, int ID_Materia, String descricao) {
        this.ID_Disciplina = ID_Disciplina;
        Numero_Certificado = numero_Certificado;
        Link = link;
        Nome_Materia = nome_Materia;
        this.ID_Materia = ID_Materia;
        Descricao = descricao;
    }
    public Materia(){

    }
    public int getID_Disciplina() {
        return ID_Disciplina;
    }

    public void setID_Disciplina(int ID_Disciplina) {
        this.ID_Disciplina = ID_Disciplina;
    }

    public int getNumero_Certificado() {
        return Numero_Certificado;
    }

    public void setNumero_Certificado(int numero_Certificado) {
        Numero_Certificado = numero_Certificado;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    public String getNome_Materia() {
        return Nome_Materia;
    }

    public void setNome_Materia(String nome_Materia) {
        Nome_Materia = nome_Materia;
    }

    public int getID_Materia() {
        return ID_Materia;
    }

    public void setID_Materia(int ID_Materia) {
        this.ID_Materia = ID_Materia;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
}
