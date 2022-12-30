import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your name:");
        String name = input.next();
        switch(name){
            case "Javeria":
                System.out.println("Your are Javeria");
                break;
            default:
                System.out.println("You are an unknown user");
        }
    }
}
