package grades;

import collectionlecture.Monster;
import util.Input;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class GradesApplication {
    public static void main(String[] args) {

        Student mason = new Student("Mason");
        mason.addGrade(88);
        mason.addGrade(66);
        mason.addGrade(35);
        Student aaron = new Student("Aaron");
        aaron.addGrade(90);
        aaron.addGrade(75);
        aaron.addGrade(65);
        Student bobby = new Student("Bob");
        bobby.addGrade(50);
        bobby.addGrade(25);
        bobby.addGrade(50);
        Student frank = new Student("Frank");
        frank.addGrade(100);
        frank.addGrade(50);
        frank.addGrade(80);
        Student charles = new Student("Charles");
        charles.addGrade(95);
        charles.addGrade(68);
        charles.addGrade(90);

        HashMap<String, Student> gitHubUsers = new HashMap<String, Student>();

        Map<String, Student> gitHubStudents = Map.ofEntries(
                entry("woodymas", mason),
                entry("aarmorris", aaron),
                entry("bobross", bobby),
                entry("frankdatank", frank),
                entry("hansomegrape", charles)
        );

        gitHubUsers.putAll(gitHubStudents);
        Scanner scanner = new Scanner(System.in);

        String goAgain = "y";  // Created this so when the user answer yes it continues
        while (goAgain.equalsIgnoreCase("y")) {  // while the user enter yes go again
            System.out.printf("=======================================================================================");
            System.out.printf("%nWelcome! Here are the GitHub usernames of our students:%n");
            System.out.printf("=======================================================================================%n");
            gitHubUsers.forEach((key, student) -> {
                System.out.printf("|%s| ", key);
            });
            System.out.printf("%nWhat student would you like to see more information on?%n");
            String userAnswer = scanner.nextLine();

            if (gitHubStudents.containsKey(userAnswer)) {
                Student ghUsers = gitHubUsers.get(userAnswer);
                System.out.printf("Name: %s - GitHub Username: %s%n Current Average: %.2f%n", ghUsers.getName(), userAnswer,ghUsers.getGradeAverage()); // --- Stopped here
            } else {
                System.out.println("WhatEver");
            }
            System.out.println("Do you want to continue?");
            goAgain = scanner.next();
            if (goAgain.equals("n") || goAgain.equals("no")){
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            }
            scanner.nextLine();
        } // end of while loop


        }

    }


