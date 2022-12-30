import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MathMethods {
    public static void main(String[] args) {
      
        // finding min and max
        System.out.println(Math.min(23,12));
        System.out.println(Math.max(32,12));

        // cieling, flooring and rounding of
        double x = 1.233231;
        System.out.println(Math.ceil(x));
        System.out.println(Math.floor(x));
        System.out.println(Math.round(x));

        // random variable generation
        int random =  new Random().nextInt(100);
        int localrandom =  ThreadLocalRandom.current().nextInt(100);
        System.out.println(random);
        System.out.println(localrandom);

    }
}
