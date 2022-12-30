public class Enums {
    public static void main(String[] args) {
        check(DaysOfWeek.Friday.toString());

    }
    public enum DaysOfWeek{
        Monday,
        Tuesday,
        Wednesday, 
        Thursday,
        Friday,
        Saturday,
        Sunday
    }
    public static void check(String day){
        if(day == "Sutarday"|| day== "Sunday"){
            System.out.println("Today is not a working day");
        }else{
            System.out.println("Today is a working day");
        }
    }
}

