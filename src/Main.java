import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentorship;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Java Course");
        course1.setDescription("P: OO");
        course1.setWorkLoad(8);

        Course course2 = new Course();
        course2.setTitle("C# Course");
        course2.setDescription("Advanced");
        course2.setWorkLoad(12);

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Mentorship Java");
        mentorship.setDescription("Improving skills");
        mentorship.setData(LocalDate.now());

        /*System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Santander Java Back-End");
        bootcamp.setDescription("Very fun!");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship);

        Dev vitorDev = new Dev();
        vitorDev.setName("Vitor");
        vitorDev.subscribeBootcamp(bootcamp);
        System.out.println("Subscribed Content: " + vitorDev.getSubscribedContent());
        vitorDev.progress();
        vitorDev.progress();
        vitorDev.progress();
        System.out.println("Subscribed Content: " + vitorDev.getSubscribedContent());
        System.out.println("Finished Content: " + vitorDev.getFinishedContent());
        System.out.println("XP: " + vitorDev.calculateXpTotal());

        System.out.println();

        Dev gustavoDev = new Dev();
        gustavoDev.setName("Gustavo");
        gustavoDev.subscribeBootcamp(bootcamp);
        System.out.println("Subscribed Content: " + gustavoDev.getSubscribedContent());
        gustavoDev.progress();
        gustavoDev.progress();
        System.out.println("Subscribed Content: " + gustavoDev.getSubscribedContent());
        System.out.println("Finished Content: " + gustavoDev.getFinishedContent());
        System.out.println("XP: " + gustavoDev.calculateXpTotal());
    }
}