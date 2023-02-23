import BackEnd.Weitage;

import java.util.Scanner;

public class Main {

    static Weitage weitage = new Weitage();

    public static void main(String[] args) {
        System.out.println("\n\n<--------------><-------------->Weightage Evaluator<--------------><-------------->");


        while(true) {
            System.out.println("\n\n-----MENU-----");
            System.out.println("1) Enter weightage and grade");
            System.out.println("2) Delete weightage and grade");
            System.out.println("3) Evaluate");
            System.out.println("4) Quit");

            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int decision = Integer.parseInt(scanner.next());
            if (decision == 4) {
                System.exit(0);
            }
            decisionMaker(decision);
        }
    }

    public static void decisionMaker(int choice) {
        switch (choice) {
            case 1 -> addingWeightAndGrade();
            case 2 -> deletingWeightAndGrade();
            case 3 -> evaluateGrade();
            default -> System.out.println("Could not read and/or understand input. Please try again");
        }
    }

    public static void addingWeightAndGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nEnter the weight: ");
        double weight = Double.parseDouble(scanner.next());
        System.out.println("Enter the grade: ");
        double grade = Double.parseDouble(scanner.next());
        weitage.addEntry(weight, grade);
        try {
            System.out.println("Adding the weightage " + weight + " and the grade " + grade + " to the system");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deletingWeightAndGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nEnter the weight: ");
        double weight = Double.parseDouble(scanner.next());
        System.out.println("Enter the grade: ");
        double grade = Double.parseDouble(scanner.next());
        try {
            System.out.println("Removing the weightage " + weight + " and the grade " + grade + " from the system");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        boolean value = weitage.deleteEntry(weight, grade);
        if (value) {
            System.out.println("Successfully removed");
        } else {
            System.out.println("Values or combination of mentioned values not found");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void evaluateGrade() {
        double grade = weitage.evaluateFinalGrade();
        System.out.println("Weighted average: " + grade);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}