import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        // only a single world is accepted
        // System.out.println("Please enter your name");
        // String name = input.next();
        // System.out.println("Your name is "+name);


        // a full line is accepted
        System.out.println("Please enter your brief introduction");
        String intro = input.nextLine();
        System.out.println(intro);

    }
}
