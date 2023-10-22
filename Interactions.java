import java.util.Scanner;


//possible tension scenarios/reactions
public class Interactions {
    
    //a player removes a card of their choosing
    public static void eliminateChoice(Player victim, int choice)
    {
         victim.player_cards.remove(choice); 
    }

    //a player reacts to another player's attack
    public static void tensionInitiate(boolean player_A_initiate, Player player_A, Player player_B, int current_merc_player_B)
    {
        if(player_A_initiate) Interactions.tensionEvent(player_A, player_B, current_merc_player_B); 
        else return;  
    }

    //covers the logic behind the reaction. 
    private static void tensionEvent(Player player_A, Player player_B, int current_merc_player_B)
    {
    //merc ID's are acquired during its action phase.

        //prompt the user which action to take.

        System.out.println("You have raised suspicion on "+player_B.getName()+"'s card.\n"+
        "How will you proceed?\n (1) Confirm\t (2) Fall back\t");
    
        Scanner user_input = new Scanner(System.in); 
        String transfer_user_input = user_input.nextLine();

        boolean user_claim = false; 


        //if the user "Confirms" then take the user into the deceptionCallOut phase ->
        if(transfer_user_input == "1")
        {
            user_claim = true; 
        }
            boolean validity = Deception.validation(player_B.player_cards,current_merc_player_B);

        Deception.deceptionCallOut(user_claim, validity, player_B,current_merc_player_B, player_A);
    }   

  
    





    }


      /*

        'The following has been pasted as a reference'


        "The validity function": validating if the mercenary is really in the player's deck


     * //this validates if a card is in a player's deck
    public static boolean validation(ArrayList<Integer>playerDeck, int merc_id)
    {   
        for(int i = 0; i < playerDeck.size(); i++)
        {
            if(playerDeck.get(i) == merc_id){
                return true;
            }
        }
        return false; 
    }
     * 
     * 
     * 
     */