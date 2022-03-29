import model.BiologyStudent;
import model.ComputerScienceStudent;
import model.Student;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String antonName = "Anton";
        LocalDate antonBirthdate = LocalDate.of(1974, 05, 30);
        int antonId = 1234;
        String antonEmail = "anton@email.de";

        String pedroName = "Pedro";
        LocalDate pedroBirthdate = LocalDate.of(1978, 12, 11);
        Integer pedroId = 2346;
        String pedroEmail = "pedro@email.de";

        String marcelName = "Marcel";
        LocalDate marcelBirthdate = LocalDate.of(2000, 05, 18);
        Integer marcelId = 1256;
        String marcelEmail = "marcel@email.de";

        //Student anton = new Student(firstStudentName, firstID);
        //Student pedro = new Student(secondStudentName, secondId);
        //Student marcel = new Student(thirdStudentName, thirdId);

        // Student Array
       // Student[] students = new Student[] {anton, pedro, marcel};
        String[] oopSubject = new String[] {"Object", "Klassen", "Abstract", "Interface", "Polymorphism"};

        Student compStudent = new ComputerScienceStudent(marcelName, marcelId, oopSubject);
        Student bioStudent = new BiologyStudent(pedroName, pedroId);

        System.out.println(compStudent.toString());
        System.out.println(bioStudent.toString());


    }
}
