import java.time.LocalDate;

import BootCamp.Camp;
import BootCamp.Curso;
import BootCamp.Dev;
import BootCamp.Mentoria;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo(" Curso Java");
    curso1.setDescricao(" Descrição curso java");
    curso1.setCargaHoraria(0);

    Curso curso2 = new Curso();
    curso2.setTitulo(" Curso JavaScript");
    curso2.setDescricao(" Descrição curso javaScript");
    curso2.setCargaHoraria(4);

    


    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo(" Mentoria de java");
    mentoria1.setDescricao(" Descrição mentoria java");
    mentoria1.setData(LocalDate.now());

    /* System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria1); */

        Camp BootCamp = new Camp();
        BootCamp.getConteudos().add(curso1);
        BootCamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootCamp(BootCamp);
        System.out.println("Conteudos inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());


        System.out.println("-----");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootCamp(BootCamp);
        System.out.println("Conteudos inscritos João " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos João " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        

    

    }
}
