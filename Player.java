package Deception;
import java.util.Random; 
//import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap; 

public class Player {

    private int player_id; 
    private String player_name; 
    
    private int CC;             // currency amount
    private boolean life_status; //determine if the player is still in the game
    private boolean game_master; //determine if the player is the game master
    
    public ArrayList<Integer>player_cards;
    private static HashMap<Integer, Player> playersMap = new HashMap<>();

    //private ArrayList<MercTemp> deck; 

       
    private static int botCount = 1;
    
    /*
     This constructor is built around the following: 
     
     for(int i = 0; i < playerCount; i++)
     {  
        Player player = new Player(i+1); 
        //push the player onto a list.eyer 
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

        playersMap.put(player_id, this); 

        //give the player the last two cards from the DeckTemp 
        DeckTemp deck = new DeckTemp();
        deck.draw(player_cards);
            

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

    public static Player getPlayerbyId(int id){
        return playersMap.get(id);
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

    // public Player getPlayer(int i){

    // }

    public void action(Player player){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please choose an action: Econ | Aid | Kill | Merc ");
        String chosenAction = scanner.next();
        scanner.close();
        switch(chosenAction){
            case "Econ":
            gameLogic.economy(player);
            break;
            
            case "Aid":
            gameLogic.foreignAid(player);
            break;

            case "Kill":
            Scanner killScan = new Scanner(System.in);
            System.out.print("Please choose a player to attack: ");
            int id = killScan.nextInt();
            killScan.close();
            Scanner cardScan = new Scanner(System.in);
            System.out.print("Please choose a card to attack: ");
            int cardId = cardScan.nextInt();
            cardScan.close();
            gameLogic.kill(player, getPlayerbyId(id), cardId);
            break;

            case "Merc":
            Scanner mercScan = new Scanner(System.in);
            System.out.print("Please choose a merc: Duke | Cap | Amb | Sin | Con ");
            String chosenMerc = mercScan.next();
            mercScan.close();

            switch(chosenMerc){
                case "Duke":
                Scanner dukeScan = new Scanner(System.in);
                System.out.print("Please choose an action: Treasure | Block Aid ");
                String dukeAction = dukeScan.next();
                dukeScan.close();
                if(dukeAction == "Treasure"){
                    Duke.treasuryYield(player);
                }
                else{
                cardScan = new Scanner(System.in);
                System.out.print("Please choose a player to attack: ");
                id = cardScan.nextInt();
                cardScan.close();
                Duke.blockAid(player, getPlayerbyId(id));
                }
                break;

                case "Cap":



            }



        }

        

    }


}





