import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String question = "5 x 2 = ?";
        System.out.println("Answer the following:");
        System.out.println(question);
        int answer = input.nextInt();
       do{
            if(answer != (5*2)){
                System.out.println(":-) Please Try again!");
            }
            else{
                break;
            }
            answer = input.nextInt();
        } while(answer != (5*2));
        System.out.println(" :-) Very Good!");
    }
}
