//imported to use Scanner and ArrayList
import java.util.ArrayList;
import java.util.Scanner;
//creating the main class
public class Main {
//calling the main method
    public static void main(String[] args) {
//creating Scanner variable to get user input
        Scanner scan=new Scanner(System.in);
        //boolean variable created as a counter for the while loop
        boolean exit=true;

        // user welcomed to program, menu displayed, user prompted to enter their choice
        System.out.println("User, welcome to the Grade Book!");
        System.out.println("Please enter the number of what you would like to do:\n1)Add Student\n2)Remove Student\n3)Find average grade of a student\n4)Search by name\n5)Search by ID" +
                "\n6)Remove Duplicates\n7)Print formatted gradebook\n8)Edit Entry\n9)Sort by ID\n10)Sort by average\n11)Sort by name\n12)Quit");

        //while loop created to keep program going until user enters 12, uses if else statements to do what user wants depending on user's input
        while (exit) {

            //variable created to get user's choice regarding the menu
            int choice = scan.nextInt();
            scan.nextLine();

            //if user entered 1, then user is prompted to enter name, ID,  number of grades (to create the length of the array), and grades (elements of the grades array in student class)
            if (choice == 1)
            {
                System.out.println("Please enter student name:");
                String name = scan.nextLine();
                System.out.println("Please enter student ID:");
                int id = scan.nextInt();
                System.out.println("Please enter the number of grades: ");
                double[] grade = new double[scan.nextInt()];
                System.out.println("Please enter the grades: ");

                //creates a for loop based on the number entered by user and grade array elements are inputted
                for (int i = 0; i < grade.length; i++)
                    grade[i] = scan.nextDouble();
                //static method addStudents is called to create a student object based on the user input
                GradeBook.addStudents(name, grade, id);
            }

            //if user entered 2, then user is prompted to enter ID and static method removeStudents is called
            else if (choice == 2)
            {
                System.out.println("Please enter student ID:");
                GradeBook.removeStudents(scan.nextInt());
            }

            //if user entered 3, then user is prompted to enter name and printAvg method is called based on user input to output average
            else if (choice == 3)
            {
                System.out.println("Please enter student name: ");
                GradeBook.printAvg(scan.nextLine());
            }

            //if user entered 4, then user is prompted to enter student name and searchByName method is called to output student info based on input
            else if (choice == 4)
            {
                System.out.println("If nothing prints out, then student is not there. Please enter student name:");
                GradeBook.searchByName(scan.nextLine());
            }

            //if user entered 5, then user is prompted to enter student ID and searchByID method is called to output student info based on input
            else if (choice == 5)
            {
                System.out.println("If nothing prints out, then student is not there. Please enter student ID:");
                GradeBook.searchByID(scan.nextInt());
            }

            //if user entered 6, then checkDuplicates method is called so that duplicates are removed
            else if (choice == 6)
            {
                GradeBook.checkDuplicates();
                System.out.println("Duplicates have been removed!");
            }

            //formatted grade book is printed
            else if (choice == 7)
            {
                GradeBook.printGradeBook();
            }

            //user is asked whether they want to edit student name or ID, then they will input which student and new info to replace, then changeName
            //or changeID method is called
            else if (choice == 8) {
            System.out.println("1)Enter 11 to edit name\n2)Enter 22 to edit ID");
            if (scan.nextInt() == 11) {
                scan.nextLine();
                System.out.println("Enter current name of student: ");
                String x = scan.nextLine();
                System.out.println("Enter new name of student:");
                String y = scan.nextLine();
                GradeBook.changeName(x, y);
            } else if (scan.nextInt() == 22) {
                scan.nextLine();
                System.out.println("Enter the current ID of the student: ");
                int x = scan.nextInt();
                System.out.println("Enter the new ID of the student: ");
                GradeBook.changeID(x, scan.nextInt());
            }
        }

            //sortbyID method is called
            else if (choice == 9)
            {
                System.out.println("grade book is sorted!");
                GradeBook.sortbyID();
            }

            //sortbyAvg method is called
            else if (choice == 10)
            {
                System.out.println("grade book is sorted!");
                GradeBook.sortbyAvg();
            }

            //sortbyName method is called
            else if (choice == 11)
            {
                System.out.println("grade book is sorted!");
                GradeBook.sortbyName();
            }

            //if user desires to quit, the while loop will break and program will end. Break is used instead of making exit false
            //because if exit is false, then the user will still be asked for next choice. Therefore this method is more convinient
            else if (choice == 12)
            break;
            //prompts user for next number
        System.out.println("Next choice: ");
    }


    }
}