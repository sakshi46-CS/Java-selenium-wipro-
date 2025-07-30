package Assesment2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentScoresApp {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add student");
            System.out.println("2. Get student score");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();  // Clear the newline after nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter the student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the student score: ");
                    int score = sc.nextInt();
                    sc.nextLine();  // Clear the newline
                    studentScores.put(name, score);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter the student name to get the score: ");
                    String studentName = sc.nextLine();
                    Integer studentScore = studentScores.get(studentName);
                    if (studentScore != null) {
                        System.out.println("Score for " + studentName + " is: " + studentScore);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
