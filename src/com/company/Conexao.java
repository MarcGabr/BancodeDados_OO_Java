package com.company;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import java.util.ArrayList;
import java.util.List;

public class Conexao {
    private ObjectContainer db = null;

    private void abrirBanco() {
        db = Db4oEmbedded.openFile("banco");
    }

    private void fecharBanco() {
        db.close();
    }

    //INSERIR
    public void insertBD(Aluno a) {
        abrirBanco();
        db.store(a);
        fecharBanco();
    }

    public void insertBD(Disciplina d) {
        abrirBanco();
        db.store(d);
        fecharBanco();
        System.out.println("Inserido com sucesso");
    }

    public void insertBD(Materia m) {
        abrirBanco();
        db.store(m);
        fecharBanco();
    }

    public void insertBD(Certificados c) {
        abrirBanco();
        db.store(c);
        fecharBanco();
    }

    //PESQUISA TUDO
    public List<Aluno> selecioneAlunos() {
        abrirBanco();
        ObjectSet<Object> listaluno = db.queryByExample(Aluno.class);
        List<Aluno> todosalunos = new ArrayList<>();
        for (Object listaaluno1 : listaluno) {
            todosalunos.add((Aluno) listaaluno1);
        }
        fecharBanco();
        return todosalunos;
    }

    public List<Disciplina> selecioneDisciplinas() {
        abrirBanco();
        ObjectSet listad = db.queryByExample(Disciplina.class);
        List<Disciplina> todosds = new ArrayList<>();
        for (Object listad1 : listad) {
            todosds.add((Disciplina) listad1);
        }
        fecharBanco();
        return todosds;
    }

    public List<Materia> selecioneMateria() {
        abrirBanco();
        ObjectSet listad = db.queryByExample(Materia.class);
        List<Materia> todosds = new ArrayList<>();
        for (Object listad1 : listad) {
            todosds.add((Materia) listad1);
        }
        fecharBanco();
        return todosds;
    }

    public List<Certificados> selecioneCertificados() {
        abrirBanco();
        ObjectSet listad = db.queryByExample(Certificados.class);
        List<Certificados> todosds = new ArrayList<>();
        for (Object listad1 : listad) {
            todosds.add((Certificados) listad1);
        }
        fecharBanco();
        return todosds;
    }
    //PESQUISA POR DADO

    public Aluno selecioneAluno(Aluno p) {
        abrirBanco();
        ObjectSet result = db.queryByExample(p);
        Aluno aluno = (Aluno) result.next();
        fecharBanco();
        return aluno;
    }

    public Disciplina selecioneDisciplina(Disciplina p) {
        abrirBanco();
        ObjectSet result = db.queryByExample(p);
        Disciplina disciplina = (Disciplina) result.next();
        fecharBanco();
        return disciplina;
    }

    public Materia selecioneMateria(Materia p) {
        abrirBanco();
        ObjectSet result = db.queryByExample(p);
        Materia materia = (Materia) result.next();
        fecharBanco();
        return materia;
    }

    public Certificados selecioneCertificado(Certificados p) {
        abrirBanco();
        ObjectSet result = db.queryByExample(p);
        Certificados certificados = (Certificados) result.next();
        fecharBanco();
        return certificados;
    }

    //Alterar
    public void updateAluno(int ID_Aluno, String login, String data_Nasc, String CPF_ALuno, String nome, String senha, String sexo, String[] certificados) {
        abrirBanco();
        Aluno a = new Aluno();
        a.setCPF_ALuno(CPF_ALuno);
        ObjectSet result = db.queryByExample(a);
        Aluno aresult = (Aluno) result.next();
        aresult.setNome(nome);
        aresult.setData_Nasc(data_Nasc);
        aresult.setLogin(login);
        aresult.setSenha(senha);
        aresult.setSexo(sexo);
        fecharBanco();
    }
    public void updateDisciplina(String nome_Disciplina, int ID_Disciplina){
        abrirBanco();
        Disciplina a = new Disciplina();
        a.setID_Disciplina(ID_Disciplina);
        ObjectSet result = db.queryByExample(a);
        Disciplina aresult = (Disciplina) result.next();
        aresult.setNome_Disciplina(nome_Disciplina);
        fecharBanco();
    }
    public void updateMateria(int ID_Disciplina, int numero_Certificado, String link, String nome_Materia, int ID_Materia, String descricao){
        abrirBanco();
        Materia a = new Materia();
        a.setID_Materia(ID_Materia);
        ObjectSet result = db.queryByExample(a);
        Materia aresult = (Materia) result.next();
        aresult.setDescricao(descricao);
        aresult.setNome_Materia(nome_Materia);
        aresult.setLink(link);
        aresult.setNumero_Certificado(numero_Certificado);
        aresult.setID_Disciplina(ID_Disciplina);
        fecharBanco();
    }
    public void updateCertificado(int ID_Materia, int numero_Certificado, String horas, String nome_Certificado){
        abrirBanco();
        Certificados a = new Certificados();
        a.setNumero_Certificado(numero_Certificado);
        ObjectSet result = db.queryByExample(a);
        Certificados aresult = (Certificados) result.next();
        aresult.setHoras(horas);
        aresult.setID_Materia(ID_Materia);
        aresult.setNome_Certificado(nome_Certificado);
        fecharBanco();
    }

    //Deletar
    public void deletarAluno(int ID){
      abrirBanco();
      Aluno a = new Aluno();
      a.setID_Aluno(ID);
      ObjectSet result = db.queryByExample(a);
      Aluno raluno = (Aluno) result.next();
      db.delete(raluno);
      fecharBanco();
    }

    public void deletarDisciplinas(int ID){
        abrirBanco();
        Disciplina a = new Disciplina();
        a.setID_Disciplina(ID);
        ObjectSet result = db.queryByExample(a);
        Disciplina rd = (Disciplina) result.next();
        db.delete(rd);
        fecharBanco();
    }
    public void deletarMateria(int ID){
        abrirBanco();
        Materia a = new Materia();
        a.setID_Materia(ID);
        ObjectSet result = db.queryByExample(a);
        Materia rm = (Materia) result.next();
        db.delete(rm);
        fecharBanco();
    }
    public void deletarCertificado(int ID){
        abrirBanco();
        Certificados a = new Certificados();
        a.setNumero_Certificado(ID);
        ObjectSet result = db.queryByExample(a);
        Certificados rc = (Certificados) result.next();
        db.delete(rc);
        fecharBanco();
    }
}
