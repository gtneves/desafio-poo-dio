import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: "+ devCaio.getConteudosInscritos());
        devCaio.progredir();
        devCaio.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos: "+ devCaio.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: "+ devCaio.getConteudosConcluidos());
        System.out.println("XP: "+ devCaio.calcularTotalXp());
        System.out.println("------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: "+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos: "+ devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: "+ devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());


    }
}