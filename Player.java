import java.util.Random; 
//import java.util.ArrayList;

import java.util.ArrayList; 

public class Player {

    private int player_id; 
    private String player_name; 
    
    private int CC;             // currency amount
    private boolean life_status; //determine if the player is still in the game
    private boolean game_master; //determine if the player is the game master
    
    private ArrayList<Integer>player_cards;

    //private ArrayList<MercTemp> deck; 

       
    private static int botCount = 1;
    
    /*
     This constructor is built around the following: 
     
     for(int i = 0; i < playerCount; i++)
     {  
        Player player = new Player(i+1); 
        //push the player onto a list.
     }
     
     Then from the list:
     We are able to shuffle and determine a new ordering for player-turns
     */

    //in game constructor 
    public Player(int player_id)
    {   
        if(player_id == 1) game_master = true;  
        this.player_id = player_id; 
        life_status = true; 
        CC = 0; 
    }

    //bot constructor
    public Player(int player_id, String player_name)
    {
        player_name = randomNameAssign() + " [BOT# "+botCount+"]";
        this.player_id = player_id;
        CC = 0; 
        life_status = true; 

        botCount++; 
    }
    


    public String accessPlayerID()
    {
        return player_name+"'s ID: "+player_id; 
    }

    public void modifyPlayerID(int player_id)
    {
        if(player_id < 1 || player_id > 6)
            throw new IllegalArgumentException("Player ID must fall within the range: 1 - 6.\n");
            this.player_id = player_id; 
    }

    public int accessCC()
    {
        return CC; 
    }

    public void modifyCC(int CC)
    {
        if(CC > 3)
            throw new IllegalArgumentException("WARNING: Illegal CC amount awarded to player: "+player_id+" "+player_name);
        if(CC < -7)
            throw new IllegalArgumentException("WARNING: Illegal CC amount taken from player: "+player_id+" "+player_name);

        this.CC += CC;
        
        if(this.CC > 10)
            life_status = false; 
            //terminate the player if happen to acquire more than the legal CC amount 
    }

    public String accessLifeStatus()
    {
        if(life_status) return player_name+" is alive"; 
        else return player_name+" is dead"; 
    }

    public void modifyLifeStatus(boolean life_status)
    {
        this.life_status = life_status; 
    }

    public String accessMasterStatus()
    {
        if(game_master) return player_name + " is the game master."; 
        return player_name + " is not the game master."; 
    }

    public void modifyMasterStatus(boolean game_master)
    {   
        if(player_id == 1) this.game_master = game_master; 
        else 
            life_status = false; 
                //terminate a player that manages to switch to game_master illegally
    }



    






    //choosing a random name for the bot

    private static String randomNameAssign()
    {
        Random random = new Random();

        int value = random.nextInt(20); 

        String[]nameArray = {"David","Dylan","Joseph","Ryan","Ian","Patrick","Daniel",
    "Omar","Wyatt","Greg","Maria","Penelope","Tristina","Martha","Sophia","Chell","Kyra","Lilly","Maya","Lois"};
        
    return nameArray[value];
    }
}





