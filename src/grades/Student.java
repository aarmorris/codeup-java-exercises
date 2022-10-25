package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private ArrayList<Integer> grades;
    // Getter

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    // Getter
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    // Setter
    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    // Methods

    public String toString(){
        return name;
    }


    // returns the student's name
    public String getName(){
        return getName();
    };
    // adds the given grade to the grades property
    public void addGrade(int grade){
            this.grades.addAll(new ArrayList<>(List.of(grade)));
//        monsterArrayList.addAll(new ArrayList<>(List.of(goblin, blueDragon, frostGiant, werewolf)));
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        for(int i = 0; i < grades.size(); i++){
            total += grades.get(i);
            }
        return total / grades.size();
        };




    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
}
