package org.example;

import org.example.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Curso curso = new Curso("Curso Java","descricao curso java", 8);

        Curso curso1 = new Curso("Curso Javascript", "descricao curso Javascipt", 4);

        Mentoria mentoria = new Mentoria("mentoria de java", "descricao mentoria java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);


        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        devDaniel.progredir();
        System.out.println("conteudo inscritos" + devDaniel.getConteudoInscritos());
        System.out.println("Conteudo Concluido" + devDaniel.getConteudoConcluido());

        Dev devjoao = new Dev();
        devjoao.setNome("joao");
        devjoao.inscreverBootcamp(bootcamp);
        devjoao.progredir();

        System.out.println("conteudo inscritos" + devjoao.getConteudoInscritos());
        System.out.println("Conteudo Concluido" + devjoao.getConteudoConcluido());



    }

}