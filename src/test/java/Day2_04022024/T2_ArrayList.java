package Day2_04022024;

import java.util.ArrayList;

public class T2_ArrayList {
    public static void main(String[] args) {
        //declare an Arraylist variable
      ArrayList<String> countries = new ArrayList<>();
        //add some countries ot the array list
        //index starts with 0
        countries.add("USA");
        countries.add("Pakistan");
        countries.add("Mexico");
        countries.add("India");
        //print out USA
        System.out.println("The first country is " + countries.get(0));
        //print out the total size of the ArrayList
        System.out.println("The total size of the countries arrayList is " + countries.size());
//array list is resizeable
        countries.add("Canada");//index 4
        //print out the new size
        System.out.println("The total size of countries arrayList now is " + countries.size());
    }//end of main
}//end of class
