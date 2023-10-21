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
 * steps for the git process:
 *  
 * create the git branch 
 * 
 * git branch NameBranch
 * git checkout NameBranch  
 * 
 * git pull origin main 
 *      -> pulls the content from the remote repository
 *         and allows you to access the remote content
 * 
 * git add . 
 *  this adds everything to push
 * 
 * git push origin NameBranch
 * 
 * 
 */