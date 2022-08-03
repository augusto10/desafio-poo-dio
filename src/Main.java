import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Curso curso3 = new Curso();

        Bootcamp bootcamp= new Bootcamp();
        bootcamp.setNome("java ");
        bootcamp.setDescricao("Bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);


        curso1.setTitulo("curso java");
        curso1.setDescricao("curso descrição java");
        curso1.setCargaHoraria(10);


        curso2.setTitulo("curso banco de dados");
        curso2.setDescricao("curso descrição banco de dados");
        curso2.setCargaHoraria(5);


        curso3.setTitulo("curso spring");
        curso3.setDescricao("curso descrição spring");
        curso3.setCargaHoraria(25);

        Mentoria mentoria1= new Mentoria();

        mentoria1.setTitulo("curso java");
        mentoria1.setDescricao("descricao java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);


        Dev devjoao =new Dev();
        devjoao.inscreverBootcamp(bootcamp);
        devjoao.setNome("joao");

        System.out.println("_______________________________ ");
        System.out.println("conteudos inscritos de joao " +devjoao.getConteudosescritos());
        devjoao.progredir();
        devjoao.progredir();

        System.out.println("conteudos concluidos de joao " +devjoao.getConteudosconcluidos());

        System.out.println("pontos xp de joao " +devjoao.calcularTotalXp());



        Dev devjose = new Dev();
        devjose.inscreverBootcamp(bootcamp);
        devjose.setNome("jose");


        System.out.println("_______________________________ ");
        System.out.println("conteudos inscritos de jose " +devjose.getConteudosescritos());
        devjose.progredir();
        devjose.progredir();
        devjose.progredir();



        System.out.println("conteudos concluidos de jose " +devjose.getConteudosconcluidos());

        System.out.println("pontos xp de jose " +devjose.calcularTotalXp());





    }
}
