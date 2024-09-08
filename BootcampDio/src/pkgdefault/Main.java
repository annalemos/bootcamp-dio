package pkgdefault;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Criando Cursos
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Aprenda Java do básico ao avançado");
        cursoJava.setCargaHoraria(10);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Curso JavaScript");
        cursoJS.setDescricao("Curso de JavaScript do zero ao profissional");
        cursoJS.setCargaHoraria(8);

        // Criando Mentoria
        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Mentoria sobre boas práticas em Java");
        mentoriaJava.setData(LocalDate.now());

        // Criando Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Um bootcamp intensivo de Java para iniciantes e intermediários");
        bootcamp.adicionarConteudo(cursoJava);
        bootcamp.adicionarConteudo(cursoJS);
        bootcamp.adicionarConteudo(mentoriaJava);

        // Criando Devs
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP Total João: " + devJoao.calcularTotalXP());

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());

        devMaria.progredir();
        System.out.println("Conteúdos Concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP Total Maria: " + devMaria.calcularTotalXP());
    }
}
