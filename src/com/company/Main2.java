package com.company;
import com.db4o.Db4o;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        String[] nomes={"sds","sadas"};
        // Aluno a1=new Aluno(1,"sd","sd","sd","sasuke","sds","sdsd", nomes);
        // Aluno a2=new Aluno(1,"sd","sd","sd","naruto","sds","sdsd", nomes);
        // Aluno a3=new Aluno(1,"sd","sd","sd","madara","sds","sdsd", nomes);

        Disciplina d1 = new Disciplina("Java",0001);

        Materia m1 = new Materia(1,5349,"http://youtube.JkasKJAsio", "Herança",10001,"Materia focada em aprendizado de Herança em Java");

        Certificados c1 = new Certificados(10001,5349, "20 min", "Certificado de Conclusao de Herança em Java");

        ObjectContainer db = Db4oEmbedded.openFile("banco23");
        try {
            inserir(db,"Discipli1", 32);
            consultar(db);
        }finally {
            db.close();
        }

 }

    private static void consultar(ObjectContainer db) {
        ObjectSet result = db.queryByExample(new Disciplina());
        System.out.println("OK");
        for(int i=0; i<result.size(); i++){
            System.out.println((Disciplina)result.next());
        }
    }

    private static void inserir(ObjectContainer db, String nome, int a) {
        Disciplina d = new Disciplina(nome,a);
        db.store(d);
        System.out.println("OK");























    }
}
