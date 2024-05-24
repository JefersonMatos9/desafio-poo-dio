package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Bootcamp Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);

        Dev devJeferson = new Dev();
        devJeferson.setNome("Jeferson");
        devJeferson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jeferson" + devJeferson.getConteudosInscritos());
        devJeferson.progredir();
        devJeferson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jeferson" + devJeferson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jeferson" + devJeferson.getConteudosConcluidos());
        System.out.println("XP:" + devJeferson.calcularTotalXp());

        System.out.println("------------------------");

        Dev devMiguel = new Dev();
        devMiguel.setNome("Miguel");
        devMiguel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Miguel" + devMiguel.getConteudosInscritos());
        devMiguel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Miguel" + devMiguel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Miguel" + devMiguel.getConteudosConcluidos());
        System.out.println("XP:" + devMiguel.calcularTotalXp());
    }
}
