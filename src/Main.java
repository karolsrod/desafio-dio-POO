import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKarol = new Dev();
        devKarol.setNome("Karol");
        devKarol.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Karol" + devKarol.getConteudoInscrito());
        devKarol.progredir();
        devKarol.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Karol" + devKarol.getConteudoInscrito());
        System.out.println("Conteudos Concluidos Karol" + devKarol.getConteudoConcluido());
        System.out.println("XP:" + devKarol.calcularTotalXp());

        System.out.println("----------");

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Vitor" + devVitor.getConteudoInscrito());
        devVitor.progredir();
        devVitor.progredir();
        devVitor.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Vitor" + devVitor.getConteudoInscrito());
        System.out.println("Conteudos Concluidos Vitor" + devVitor.getConteudoConcluido());
        System.out.println("XP:" + devVitor.calcularTotalXp());




    }
}
