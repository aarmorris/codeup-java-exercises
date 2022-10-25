package grades;

public class StudentTest {
    public static void main(String[] args) {

        Student aaron = new Student("Aaron");
        Student david = new Student ("David");
        aaron.addGrade(90);
        aaron.addGrade(75);
        aaron.addGrade(65);
        aaron.addGrade(50);
        aaron.addGrade(45);
        System.out.println(aaron.getGrades());
        System.out.println(aaron.getGradeAverage());

        david.addGrade(88);
        david.addGrade(66);
        david.addGrade(35);
        david.addGrade(50);
        david.addGrade(25);
        System.out.println(david.getGradeAverage());
        System.out.println(david.getGrades());


    }
}
