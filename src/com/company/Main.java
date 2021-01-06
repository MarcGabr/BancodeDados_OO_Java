package com.company;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Conexao conect = new Conexao();

        String[] nomes={"BD","POO"};
        Aluno a1=new Aluno(1,"Magos.gg","12/08/1999","049333","Marcos","asnjfdkashbdjas","M", nomes);

        Disciplina d1 = new Disciplina("Java",0001);

        Materia m1 = new Materia(1,5349,"http://youtube.JkasKJAsio", "Herança",10001,"Materia focada em aprendizado de Herança em Java");

        Certificados c1 = new Certificados(10001,5349, "20 min", "Certificado de Conclusao de Herança em Java");

        conect.insertBD(a1);
        conect.insertBD(d1);
        conect.insertBD(m1);
        conect.insertBD(c1);
        //Imprimindo Informações
        List<Aluno> todosalunos = conect.selecioneAlunos();
        System.out.println("Alunos");
        for (Aluno todosAlunos : todosalunos ){
            System.out.println(todosAlunos.getNome());
            System.out.println(todosAlunos.getCPF_ALuno());
            System.out.println(todosAlunos.getData_Nasc());
            System.out.println(todosAlunos.getID_Aluno());
            System.out.println(todosAlunos.getLogin());
            System.out.println(todosAlunos.getSenha());
            System.out.println(todosAlunos.getSexo());
        }
        List<Disciplina> todosd = conect.selecioneDisciplinas();
        System.out.println("Disciplinas");
        for(Disciplina todosd1 : todosd){
            System.out.println(todosd1.getNome_Disciplina());
            System.out.println(todosd1.getID_Disciplina());
        }
        List<Materia> todosm = conect.selecioneMateria();
        System.out.println("Materia");
        for(Materia todosd2 : todosm){
            System.out.println(todosd2.getID_Disciplina());
            System.out.println(todosd2.getLink());
            System.out.println(todosd2.getID_Materia());
            System.out.println(todosd2.getNumero_Certificado());
            System.out.println(todosd2.getDescricao());
            System.out.println(todosd2.getNome_Materia());
        }
        List<Certificados> todosc = conect.selecioneCertificados();
        System.out.println("Certificados");
        for(Certificados todosd3 : todosc){
            System.out.println(todosd3.getNome_Certificado());
            System.out.println(todosd3.getNumero_Certificado());
            System.out.println(todosd3.getID_Materia());
            System.out.println(todosd3.getHoras());
        }
        //Imprimindo informaçoes
        Aluno a2 = new Aluno();
        a2.setCPF_ALuno("049333");
        Aluno a3 = conect.selecioneAluno(a2);
        System.out.println(a3.getNome());

        //Atualizando
        conect.updateDisciplina("Banco de dados",d1.getID_Disciplina());

        //Deletar
        conect.deletarDisciplinas(d1.getID_Disciplina());

}
}
