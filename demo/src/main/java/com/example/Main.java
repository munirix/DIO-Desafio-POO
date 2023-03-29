package com.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Programacao Orientada a Objetos em Java");
        curso1.setDescricao("descrição POO java");
        curso1.setCargaHoraria(22);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Banco de Dados SQL");
        curso2.setDescricao("descrição SQL");
        curso2.setCargaHoraria(15);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do Bootcamp com Banco Pan");
        mentoria.setDescricao("descrição mentoria Banco Pan");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer Iniciantes");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer Iniciantes");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMunira = new Dev();
        devMunira.setNome("Munira");
        devMunira.inscreverBootcamp(bootcamp);
        System.out.println("Inscritos Munira:" + devMunira.getConteudosInscritos());
        devMunira.progredir();
        devMunira.progredir();
        System.out.println("-");
        System.out.println("Inscritos Munira:" + devMunira.getConteudosInscritos());
        System.out.println("Concluídos Munira:" + devMunira.getConteudosConcluidos());
        System.out.println("XP:" + devMunira.calcularTotalXp());

        System.out.println("\n-------\n");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}

