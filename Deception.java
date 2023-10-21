package Deception;

import java.util.ArrayList; 

public class Deception {
  
    public static void deceptionCallOut(boolean playerA_claim, boolean playerB_truth, int current_id)
    {
        if(!playerA_claim) return;

        if(playerA_claim && !playerB_truth) 
            playerB.; //player B has their card eliminated
                        //choice of which card to elim

            
            
            else
            {
                  doSomething(); 
                /*
                 * player A has a card eliminated 
                 * 
                 */ 

                
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



    private static void doSomething()
    {
        
    }


    


}

/*
    the player choices: 
        
        deceptionCallOut()
        
        A challenges B's card 

        the position of a card is checked
        to validate that it exists. 





  
  
 */