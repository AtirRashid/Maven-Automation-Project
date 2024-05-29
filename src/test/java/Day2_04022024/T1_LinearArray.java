package Day2_04022024;

public class T1_LinearArray {
    public static void main(String[] args) {
        //declare a string array variable
        String[] studentNames;
        //store some values in string array
        studentNames = new String[]{"Abdul", "Ahmad", "Anderson", "Wahid"};
        //array starts with 0
        //Print out index 0 from studentNames array
        System.out.println("The value of index 0 is " + studentNames[0]);
//print out anderson from studentNames array
        System.out.println("The student name is " + studentNames[2]);
//print out wahid from studentNames array
        System.out.println("The student name is " + studentNames[3]);
        //declare and store studentGrades
int[] studentGrades = new int[] {90,93,94,99};
//print out grade 93 from the array
// index starts with 0 so 93 is 1
System.out.println("Student grade is " + studentGrades [1]);
    }//end of main
}//end of class
