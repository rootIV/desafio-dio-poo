import br.com.dio.desafio.dominio.Course;
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
        course2.setDescription("P: OO");
        course2.setWorkLoad(12);

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Mentorship Java");
        mentorship.setDescription("Improving skills");
        mentorship.setData(LocalDate.now());

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship);
    }
}