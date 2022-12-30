import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number and get it's table");
        int num = input.nextInt();
        // lets print the table of num by using for loop
        for(int i=1; i<11;i++){
            System.out.println(num+"  x "+i+" = "+i*num);
        }

    }
}
