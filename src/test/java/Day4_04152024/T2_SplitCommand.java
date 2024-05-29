package Day4_04152024;

public class T2_SplitCommand {
    public static void main(String[] args) {
        String message = "My name is Atir";
        //declare an array to store the split message
        String[] splitMessageArray = message.split(" ");
        //print out Atir
        System.out.println("The best man is " + splitMessageArray[3]);
        //declare another message
    String triageMessage = "Automation_02";
    //store message in a linear array
        String[] triageMessageArray = triageMessage.split("_");
        //print only the number
        System.out.println("After the number 01 is the number " + triageMessageArray[1]);



    }//end of main
}//end of class
