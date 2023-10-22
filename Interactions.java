import java.util.ArrayList;

public class Interactions {
    

    public static void eliminateChoice(Player victim, int choice)
    {
         victim.player_cards.remove(choice); 
    }

    






    //directContact
    public static void oneOnOneInitiate(boolean player_A_initiate, Player player_A, Player player_B)
    {
       /*
        *   player A attacks player B 
            

            player B is able to counter the attack. 

            


        */
    }

    public static void counterReact(boolean permit, Player player_A, Player player_B)
    {
        if(!permit) //if the defending player does not permit the attack, then they react with a counter.
            Interactions.counter();
    }   

    private void counter()
    {

    }


    //bystander 
    public static void tensionInitiate(boolean player_A_initiate, Player player_A, Player player_B)
    {
        if(player_A_initiate) Interactions.tensionEvent(player_A, player_B); 
    }

    private static void tensionEvent(Player player_A, Player player_B)
    {

        //every player's current card will have an ID

        //Deception.deceptionCallOut(false, true, player_A, 0, player_B);

        /*
         * possible tension event call outs;
         *          Player A action 
         *          Player B reacts 
         *      
         * 
         *  this will come to and end until both players have come to a compromise
         * 
         */

        


    }   



    /*
     * one player reacts to another player's action
     * "initiate" tension
     * 
     *  EX. Player A initiates a treasury yield
     *      Player B intervenes with a tensionEvent
     *      
     *      this event is called after the player 
     *      
     *      
     *      Player B sees on their screen:
     * 
     *      "Player A is attempting to treasury yield"
     *      
     *      Permit, Call Fallasy
     *      false   true 
     *      
     *      Player B selects: Call Fallasy
     * 
     * 
     * 

    public void tensionInitiate(boolean player_A initiate, Player player_A, Player player_B)
    {
        if(player_A initiate)Interactions.tensionEvent(player_A, player_B); 
    }
    
    private static void tensionEvent(Player player_A, Player player_B)
    {
        


    }




    /*
     * the resulting action after the tension event has coome to an event.
     * 
     * 
     * 
     * 
     */


}
