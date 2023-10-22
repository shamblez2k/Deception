import java.util.*;

public class gameSession{

 public static void main(String[] args){

    int playerCount = 2;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter the number of players: ");
    playerCount = scanner.nextInt();
    scanner.close();

    ArrayList<Player> players = new ArrayList<>();    

    for(int i = 1; i < playerCount; i++){
        Player player = new Player(i);
        players.add(player);
    }

    //shuffle the positions of the players in the array
    gameMethods.shuffle(players);



    while(true)
    {
        for(int i = 0; i < players.size(); i++)
        {

            Player current = players.get(i);
            
            current.action(current); 

            if(current.player_cards.isEmpty())
            {
                current.modifyLifeStatus(false);

                gameMethods remove = new gameMethods(); 

                remove.elimSwap(players, current.getID());               
            }
               

            TimerBranch.fixedTimer();
        }

        if(players.size() == 1) break; 
    }
        Player winner = players.get(0); 

        System.out.println("The winner of the game: "+winner.getName());

 }

}

