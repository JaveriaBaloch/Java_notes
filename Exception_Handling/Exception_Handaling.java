package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handaling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        try{
            System.out.println(input.nextInt());
        }catch(InputMismatchException e){
           e.printStackTrace();
        }
    }
}
