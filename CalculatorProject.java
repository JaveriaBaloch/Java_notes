import java.util.Scanner;

public class CalculatorProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // welcome statement
        System.out.println("Welcome to the Javeria's Calculator");

        // taking user input for first and secound variable
        System.out.println("Please Enter a number first variable");
        float num1 = input.nextFloat();
        System.out.println("Please Enter a number second variable");
        float num2 = input.nextFloat();

        // taking user input for operation
        System.out.println("Operations:");
        System.out.println("1. Divide");
        System.out.println("2. Multiply");
        System.out.println("3. Sum");
        System.out.println("4. Substract");
        System.out.println("\nPlease One of the following options");
        String optionSelected = input.next();
        optionSelected = optionSelected.toLowerCase();

        switch(optionSelected){
            case "1":
            // divide
                System.out.println(num1+" / "+num2+"="+divide(num1, num2));
                break;
            case "2":
            // multiple
                System.out.println(num1+" x "+num2+"="+multiply(num1, num2));
                break;
            case "3":
            // add
                System.out.println(num1+" + "+num2+"="+add(num1, num2));
                break;
            case "4":
            // substract
                System.out.println(num1+" - "+num2+"="+substract(num1, num2));
                break;
            case "divide":
            // divide
                System.out.println(num1+" / "+num2+"="+divide(num1, num2));
                break;
            case "multiply":
            // multiple
                System.out.println(num1+" x "+num2+"="+multiply(num1, num2));
                break;
            case "sum":
            // add
                System.out.println(num1+" + "+num2+"="+add(num1, num2));
                break;
            case "substract":
            // substract
                System.out.println(num1+" - "+num2+"="+substract(num1, num2));
                break;
        }
    
    }
    // function for all operations
      private static float divide(float a,float b) {
       return a/b;
      }
      private static float multiply(float a,float b) {
        return a*b;
       }
       private static float add(float a,float b) {
        return a+b;
       }
       private static float substract(float a,float b) {
        return a-b;
       }
}
