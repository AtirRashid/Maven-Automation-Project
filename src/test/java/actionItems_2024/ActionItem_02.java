package actionItems_2024;

import java.util.ArrayList;

public class ActionItem_02 {
    public static void main(String[] args) {
        //Declare an array list variable
        ArrayList<String> regions = new ArrayList<>();
        //Add some regions to the array list
        //Index starts with 0
        regions.add("Newark");
        regions.add("Elkton");
        regions.add("Buffalo");
        regions.add("NYC");
        //add area codes in a new array list
        ArrayList<Integer> areaCodes = new ArrayList<>();
        //add area codes
        areaCodes.add(302);
        areaCodes.add(443);
        areaCodes.add(716);
        areaCodes.add(718);
        //start a loop with area codes and regions
        for (int i = 0; i < regions.size(); i++) {
            //print out each region
            System.out.println("My region is " + regions.get(i) + " and my area code is " + areaCodes.get(i));
        }//end of loop
    }//end of main
}//end of class
