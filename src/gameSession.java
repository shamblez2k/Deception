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

 }

}