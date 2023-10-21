package Deception;

import java.util.ArrayList; 

public class Deception {
  
    public static void deceptionCallOut(boolean playerA_claim, boolean playerB_truth)
    {
        if(!playerA_claim) return; //playerA falls back on their initial claim
        
        //this will account for all card types
        
        if(playerA_claim && !playerB_truth) 
            doSomething(); //player B has their card eliminated
            else
            {
                  doSomething(); 
                /*
                 * player A has a card eliminated 
                 * player B has a card swapped 
                 */ 
            }
    }

  

    //this validates if a card is in a player's deck
    public static boolean validation(ArrayList<Integer>mercs, int merc_id)
    {   
        for(int i = 0; i < mercs.size(); i++)
        {
            
        }
        


      

        return true; 
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