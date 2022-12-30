import java.util.Scanner;

public class IFELSE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:\t");
        int age = input.nextInt();
        // if age is string the conversion code is below line
        // int conversion = Integer.parseInt(age);

        if(age > 17){
            System.out.println("You can vote");
        }else{
            System.out.println("You can't vote");
        }
    }
}
