import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class gameMethods {
  
    public static void shuffleCards(ArrayList<Integer> cards) {
        long seed = System.nanoTime(); // Use the current time as the seed for randomness
        Collections.shuffle(cards, new Random(seed));

    }
}
    
   