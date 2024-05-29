package actionItems_2024;

import java.util.ArrayList;

public class actionItem_02assignment1 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        //index starts at 0. total index numbers is 4.
        countries.add("USA");
        countries.add("India");
        countries.add("Egypt");
        countries.add("UK");
        countries.add("Bangladesh");
        //create a whileLoop
        int i = 0;
        while (i <= 4) {
            if (countries.get(i) == "USA") {
                System.out.println("The country is " + countries.get(i));
            }//end of if
            else if (countries.get(i) == "Bangladesh") {
                System.out.println("The country is " + countries.get(i));
            }//end of else if
            i = i + 1;
        }//end of whileLoop
    }//end of main
}//end of class

