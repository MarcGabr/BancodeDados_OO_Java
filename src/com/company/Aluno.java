package com.company;

public class Aluno {
    private int ID_Aluno;
    private String Login;
    private String Data_Nasc;
    private String CPF_ALuno;
    private String Nome;
    private String Senha;
    private String Sexo;
    public String[] Certificados;

    public Aluno(int ID_Aluno, String login, String data_Nasc, String CPF_ALuno, String nome, String senha, String sexo, String[] certificados) {
        this.ID_Aluno = ID_Aluno;
        Login = login;
        Data_Nasc = data_Nasc;
        this.CPF_ALuno = CPF_ALuno;
        Nome = nome;
        Senha = senha;
        Sexo = sexo;
        Certificados = certificados;
    }
    public Aluno(){}

    public String[] getCertificados() {
        return Certificados;
    }

    public void setCertificados(String[] certificados) {
        Certificados = certificados;
    }

    public int getID_Aluno() {
        return ID_Aluno;
    }

    public void setID_Aluno(int ID_Aluno) {
        this.ID_Aluno = ID_Aluno;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getData_Nasc() {
        return Data_Nasc;
    }

    public void setData_Nasc(String data_Nasc) {
        Data_Nasc = data_Nasc;
    }

    public String getCPF_ALuno() {
        return CPF_ALuno;
    }

    public void setCPF_ALuno(String CPF_ALuno) {
        this.CPF_ALuno = CPF_ALuno;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }
}
