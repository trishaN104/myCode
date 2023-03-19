//imported java.util.ArrayList to use ArrayList
import java.util.ArrayList;

//GradeBook class is created
public class GradeBook {

//initializer variable called gradeBook is created and it is of type student
private static ArrayList<Student> gradeBook=new ArrayList<Student>();

//addStudents method takes in string, double array, and ID inputs to create a new student using the student class, then student is added to grade book
public static void addStudents(String name,double grades[],int ID){
    Student x=new Student(name,grades,ID);
    gradeBook.add(x);
}

//changeName method changes the name of the student by taking in 2 string inputs, and accessing each element of the grade book, and checking the current name
//to determine which student's name the user desires to change, once the element is found, the setN method is used to set name as the user input
public static void changeName(String n, String nn){
    for (int i=0;i<gradeBook.size();i++)
        if (gradeBook.get(i).getName().equals(n))
            gradeBook.get(i).setN(nn);
}

//changeID method changes the student ID by taking in 2 int inputs and accessing each element of the grade book to determine which student's ID is the one that the
//user desires to change, once student is found, the setID method is called and user input is used to change the ID
public static void changeID(int n, int nn){
    for (int i=0;i<gradeBook.size();i++){
        if (gradeBook.get(i).getID()==n)
            gradeBook.get(i).setID(nn);
    }
}

//printAvg method prints the average of a chosen student by taking in a string input (a student's name) and accessing each element of the grade book to determine which student
    //the user wants to see the average grades of, once the student is found, his/her average is returned by calling the getAvg method
public static void printAvg(String n){
    for(int i=0;i<gradeBook.size();i++)
    {
       if (gradeBook.get(i).getName().equals(n))
           System.out.println("Student Avg: "+gradeBook.get(i).getAvg());
    }
}

//for loop goes through each element and gets the ID and checks against user input, if there is a match, the element is removed
public static void removeStudents(int ID){
    int index=0;
    for (int i=0;i<gradeBook.size()-1;i++)
        if (gradeBook.get(i).getID()==gradeBook.get(i+1).getID())
            index=i;
    gradeBook.remove(index);

}

//for loop goes through all elements except the last one, the if statement checks if the ID and the name are the same for the element
    //which has the index i and the next element. If there is a match, then the element at i gets removed
public static void checkDuplicates(){
    for (int i=0;i<gradeBook.size()-1;i++)
        if (gradeBook.get(i).getID()==gradeBook.get(i+1).getID() && gradeBook.get(i).getName().equals(gradeBook.get(i+1).getName()))
            gradeBook.remove(i);
}

//goes through each element in the array and uses the toString method to print out all the elements of grade book
public static void printGradeBook(){
    for (int i=0;i<gradeBook.size();i++) {
       System.out.println(gradeBook.get(i).toString());
    }
}

    //searchByName method prints out info of whichever student based on the name the user inputs
//for loop goes through each element of the grade book and the if statement checks each element with the user input (name),
    //if there is a match, then the toString method is used to print out student info, then loop breaks
public static void searchByName(String name) {
    for (int i=0;i<gradeBook.size();i++){
        if (gradeBook.get(i).getName().equals(name)){
            System.out.println(gradeBook.get(i).toString());
            break;
        }
    }
}

    //searchByID method prints out info of whichever student based on the ID the user inputs
    // for loop goes through each element of the grade book and the if statement checks each element with the user input (ID),
    //if there is a match, then the toString method is used to print out student info, then loop breaks
public static void searchByID(int ID){
    for (int i=0;i<gradeBook.size();i++){
        if (gradeBook.get(i).getID()==ID){
            System.out.println( gradeBook.get(i).toString());
            break;
        }
    }
}

//sortbyID method sorts the grade book arraylist in numerical order (least to greatest ID numbers) via insertion sort
    //for loop accesses each element in the array except for the last one
    //variable min is used as an index
    //another for loop goes through each element in the gradebook starting from i to the last element
    //if the element at j's ID is less than the element at min's ID, then min becomes j
    //a student object named temp is set to the element at min, then element at i is set to the element at min
    //then the temp is set to the element at i (swapping value of min and i)
    //this method goes through each element and checks if the id of element at i is less than the id of elements after i, if so, then
//the element of i and min (if the id of an element after i was less than the id of i, then min will be that element) get swapped
    public static void sortbyID() {
        for (int i=0;i<gradeBook.size()-1;i++) {
            int min=i;
            for (int j=i;j<gradeBook.size();j++)
            {
                if (gradeBook.get(j).getID()<gradeBook.get(min).getID())
                    min=j;
            }
            Student temp=gradeBook.get(min);
            gradeBook.set(min,gradeBook.get(i));
            gradeBook.set(i,temp);
        }
    }

    //sortybyAvg method sorts the grade book arraylist in numerical order (least to greatest avg) via insertion sort
    //for loop accesses each element in the array except for the last one
    //variable min is used as an index
    //another for loop goes through each element in the gradebook starting from i to the last element
    //if the element at j's avg is less than the element at min's avg, then min becomes j
    //a student object named temp is set to the element at min, then element at i is set to the element at min
    //then the temp is set to the element at i (swapping value of min and i)
    //this method goes through each element and checks if the avg of element at i is less than the avg of elements after i, if so, then
    //the element of i and min (if the avg of an element after i was less than the avg of i, then min will be that element) get swapped
    public static void sortbyAvg(){
        for (int i=0;i<gradeBook.size()-1;i++) {
            int min=i;
            for (int j=i;j<gradeBook.size();j++)
            {
                if (gradeBook.get(j).getAvg()<gradeBook.get(min).getAvg())
                    min=j;
            }
            Student temp=gradeBook.get(min);
            gradeBook.set(min,gradeBook.get(i));
            gradeBook.set(i,temp);
        }
    }

    //sortbyName method sorts the grade book arraylist in alphabetical order (a-z) via insertion sort
    //for loop accesses each element in the array except for the last one
    //variable min is used as an index
    //another for loop goes through each element in the gradebook starting from i to the last element
    //if the element at j's is less than the element at min's avg, then min becomes j
    //a student object named temp is set to the element at min, then element at i is set to the element at min
    //then the temp is set to the element at i (swapping value of min and i)
    //this method goes through each element and checks if the element at i is less than the elements after i, if so, then
    //the element of i and min (if the element after i was less than i, then min will be that element) get swapped
    public static void sortbyName(){
        for (int i=0;i<gradeBook.size()-1;i++) {
            int min=i;
            for (int j=i;j<gradeBook.size();j++)
            {
                if (gradeBook.get(j).getName().compareTo(gradeBook.get(min).getName())<0)
                    min=j;
            }
            Student temp=gradeBook.get(min);
            gradeBook.set(min,gradeBook.get(i));
            gradeBook.set(i,temp);
        }
    }

}
