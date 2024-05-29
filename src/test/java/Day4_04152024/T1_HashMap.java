package Day4_04152024;

import java.util.HashMap;

public class T1_HashMap {
    public static void main(String[] args) {
        //create hashmap of name and age of students
        HashMap<String, Integer> triageStudents = new HashMap<>();
        //add the indexes
        triageStudents.put("Oyon", 24);
        triageStudents.put("Tanveer", 29);
        triageStudents.put("Atir", 25);
        triageStudents.put("Fahad", 26);
        //print out the size
        System.out.println("The size of the HashMap is " + triageStudents.size());
        //print out the content of the HashMap
        System.out.println(triageStudents);
    //print out Atir's age
        int atirsAge = triageStudents.get("Atir");
        System.out.println("Atir's age is " + atirsAge);
        //print out if arijs age exists
        if(triageStudents.containsKey("Arij")){
            System.out.println("Arij's age is " + triageStudents.get("Arij"));
        } else {
            System.out.println("Arij is not in the data set");
        }//end of if else



    }//end of main
}//end of class
