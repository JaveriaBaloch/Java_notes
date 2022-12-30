package Throw_Catch;

import java.util.Scanner;

public class Throw_catch {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        String nextStr = input.nextLine();
        if(nextStr.equalsIgnoreCase("error")){
            throw new Exception("An error was given from the error");
        }
        System.out.println(nextStr);
    }
}
