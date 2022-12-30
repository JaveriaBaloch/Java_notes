import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class List_And_Array_List{
    public static void main(String[] args) {
        // Array is give below 
        int[] numbers = {2,3,5,5,6};

        // List is given below
        List<Integer> number = new ArrayList<>(Arrays.asList(8,6,54));
        
        for (Integer integer : numbers) {
            number.add(integer);
        }
        
        System.out.println(number);
    }
}