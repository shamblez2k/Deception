import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class gameMethods {
  
    //this shuffle method works for any data-type for an ArrayList<T>

    public static <T> void shuffle(ArrayList<T> cards) {
        long seed = System.nanoTime(); // Use the current time as the seed for randomness
        Collections.shuffle(cards, new Random(seed));
    }

    //we find the element we want to eliminate based on the player's id, then we pop it off in the game session
    public static void elimSwap(ArrayList<Integer>player_list, int target)
    {   

        int last = player_list.size()-1; 
        
        for(int i = 0; i < last; i++)
        {   
            int current = player_list.get(i); 

            if(current == target)
            {
                int temp = current; 
                current = last; 
                last = temp; 
            }
        }
    }

    public static int current_merc_ID(ArrayList<Integer>player_cards, )
    {   
        //simply return the ID of the merc being used:

        /*
         *  when a merc is used within the game session
         * 
         * 
         * 
         */


    }



    
}
    
   