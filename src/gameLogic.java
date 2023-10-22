import java.util.ArrayList; 

public class gameLogic{
    //Assume there is a Desk class which is made of an ArrayList of mercenaries, ArrayList<Mercenary> deck
    //Assume the players have already been given two cards each, there is between 3-11 cards left in the deck depending on how many players there are
    //The deck is then shuffled 
 

    //swapping the current within the player_cards
    // 1 2 3 4 1
    // 5 2 

    public static void swap(ArrayList<Integer>player_cards, int choice, ArrayList<Integer>deck)
    {
        int temp = player_cards.get(choice);
        
        int swap = deck.get(deck.size()-1); 
        player_cards.set(choice,swap);
        deck.set(deck.size()-1,temp);
    }

    
}




