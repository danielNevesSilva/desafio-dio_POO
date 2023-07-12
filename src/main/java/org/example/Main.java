package org.example;

import org.example.desafio.dominio.Curso;
import org.example.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso = new Curso("Curso Java","descricao curso java", 8);

        Curso curso1 = new Curso("Curso Javascipt", "descricao curso Javascipt", 4);

        Mentoria mentoria = new Mentoria("mentoria de java", "descricao mentoria java", LocalDate.now());

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);
    }

}