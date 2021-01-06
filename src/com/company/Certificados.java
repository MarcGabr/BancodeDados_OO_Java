package com.company;

public class Certificados {
    private int ID_Materia;
    private int Numero_Certificado;
    private String Horas;
    private String Nome_Certificado;

    public Certificados(int ID_Materia, int numero_Certificado, String horas, String nome_Certificado) {
        this.ID_Materia = ID_Materia;
        Numero_Certificado = numero_Certificado;
        Horas = horas;
        Nome_Certificado = nome_Certificado;
    }
    public Certificados(){

    }
    public int getID_Materia() {
        return ID_Materia;
    }

    public void setID_Materia(int ID_Materia) {
        this.ID_Materia = ID_Materia;
    }

    public int getNumero_Certificado() {
        return Numero_Certificado;
    }

    public void setNumero_Certificado(int numero_Certificado) {
        Numero_Certificado = numero_Certificado;
    }

    public String getHoras() {
        return Horas;
    }

    public void setHoras(String horas) {
        Horas = horas;
    }

    public String getNome_Certificado() {
        return Nome_Certificado;
    }

    public void setNome_Certificado(String nome_Certificado) {
        Nome_Certificado = nome_Certificado;
    }
}
