import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> alphabets = new HashMap<>();
        String text = "Have you ever played the board game Battleship? That's what we will be making at the end of this course! Learn how to draw the board, place the ships, and detect when a ship has been hit.";
        String noSpace = "";
        for (String string : text.split(" ")) {
            noSpace +=string;
        }
        for (String letter : noSpace.split("")) {
            if(alphabets.containsKey(letter)){
               int value  = alphabets.get(letter) + 1;
               alphabets.put(letter,value);
            }else{
                alphabets.put(letter,1);
            }
        }

        System.out.println(alphabets);
    }

}
