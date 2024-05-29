package Day2_04022024;

import java.util.ArrayList;

public class T3_ForLoop {
    public static void main(String[] args) {
        //declare an Arraylist variable
        ArrayList<String> countries = new ArrayList<>();
        //add some countries to the array list
        //index starts with 0
        countries.add("USA");
        countries.add("Pakistan");
        countries.add("Mexico");
        countries.add("India");
        countries.add("Canada");
        // print out all countries using for loop
        for (int i = 0; i < countries.size(); i++){
            //print out which index is at
            System.out.println("The index of i is " + i);
            //print out the country located at index i
            System.out.println("My countries are " + countries.get(i));
        }//end of loop
    }//end of main
}//end of class