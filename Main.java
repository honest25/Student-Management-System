package project1;
import java.util.Scanner;

import Student_Management_System.Student;
import Student_Management_System.StudentManager;
public class Main {
	    private static StudentManager studentManager = new StudentManager();
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int choice;

	        do {
	            System.out.println("Choose an option:");
	            System.out.println("1. Add new student");
	            System.out.println("2. Update student information");
	            System.out.println("3. Display all student information");
	            System.out.println("4. Exit");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    addNewStudent();
	                    break;
	                case 2:
	                    updateStudent();
	                    break;
	                case 3:
	                    displayAllStudents();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 4);
	    }

	    private static void addNewStudent() {
	        System.out.println("Enter student name:");
	        String name = scanner.next();
	        System.out.println("Enter roll number:");
	        int rollNumber = scanner.nextInt();
	        System.out.println("Enter marks (separated by spaces):");
	        int[] marks = new int[3];
	        for (int i = 0; i < 3; i++) {
	            marks[i] = scanner.nextInt();
	        }
	        Student student = new Student(name, rollNumber, marks);
	        studentManager.addStudent(student);
	        System.out.println("Student added successfully.");
	    }

	    private static void updateStudent() {
	        System.out.println("Enter roll number of student to update:");
	        int rollNumber = scanner.nextInt();
	        System.out.println("Enter new student name:");
	        String name = scanner.next();
	        System.out.println("Enter new marks (separated by spaces):");
	        int[] marks = new int[3];
	        for (int i = 0; i < 3; i++) {
	            marks[i] = scanner.nextInt();
	        }
	        studentManager.updateStudent(rollNumber, name, marks);
	        System.out.println("Student information updated successfully.");
	    }

	    private static void displayAllStudents() {
	        studentManager.displayAllStudents();
	    }
	}


