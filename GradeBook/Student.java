//creating Student class
public class Student {
    //initizializer variables (name, grades array, ID) created
   private String name;
   private double grades[];
   private int ID;

   //constructor created, takes in string name, grade array and int ID
    public Student(String name, double grades[], int ID)
    {
        this.name=name;
        this.grades=grades;
        this.ID=ID;
    }
    //getName method created to return value in variable name
    public String getName() {
        return name;
    }

    //getGrades method created to return values in variable grades
    public double[] getGrades(){
        return grades;
    }

   // getID method created to return value in variable ID
    public int getID(){
        return ID;
    }

    //getAvg() method created to return average of values in grades array by using a for loop to access each element
    //in the grades array and adds them up using double sum
    public double getAvg(){

        double sum=0;
        for (int i=0;i<grades.length;i++)
            sum=sum+grades[i];
        return sum/(grades.length);
    }

    //toString method returns a string containing all student information (name, ID, average) using the respective getter methods
    public String toString(){
        return "Student Name:"+getName()+"\nStudent ID:"+getID()+"\nStudent Average:"+getAvg()+"\n";
    }

    //setN method takes in a string input and sets the variable name to string input
    public void setN(String n){ name=n; }

    //setID method takes in an int input and sets the variable ID to int input
    public void setID(int id){
        ID=id;
    }


}
