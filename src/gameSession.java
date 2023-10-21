import java.util.*;

public class gameSession{

 public static void main(String[] args){

    int playerCount = 2;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter the number of players: ");
    playerCount = scanner.nextInt();
    scanner.close();

    List<Player> players = new ArrayList<>();    

    for(int i = 1; i < playerCount; i++){
        Player player = new Player(i);
        players.add(player);
    }

    while(true)
    {
        for(int i = 0; i < players.size(); i++)
        {
            Player current = players.get(i);
            current.action(current); 
        }

        if(players.size() == 1) break; 
    }
        Player winner = players.get(0); 

        System.out.println("The winner of the game: "+winner.getName());

 }

}