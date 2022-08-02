import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("curso descrição java");
        curso1.setCargaHoraria(10);

        System.out.println(curso1);



        Mentoria mentoria1= new Mentoria();

        mentoria1.setTitulo("curso java");
        mentoria1.setDescricao("descricao java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);



    }
}
