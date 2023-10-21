package Deception;

import java.util.Scanner;
import java.util.ArrayList;

import Deception.Player; 

public class Deception {
  
    public static void deceptionCallOut(boolean playerA_claim, boolean playerB_truth, Player playerB, int curr_id, Player playerA)
    {
        if(!playerA_claim) return;
        if(playerA_claim && !playerB_truth) 
            if(validation(playerB.player_cards, curr_id)){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Player " + playerB + " choose a card to eliminate");
                int card = Integer.parseInt(scanner.nextLine()) - 1;
                playerB.player_cards.remove(card);

            } 
            else 
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Player " + playerA + "choose a card to eliminate");
                int card = Integer.parseInt(scanner.nextLine()) - 1;
                playerA.player_cards.remove(card);
                
            }
    }

  

    //this validates if a card is in a player's deck
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


    


}

/*
    the player choices: 
        
        deceptionCallOut()
        
        A challenges B's card 

        the position of a card is checked
        to validate that it exists. 





  
  
 */