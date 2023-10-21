public class Assassin{
        
        public static void assassinate(Player assassin, Player victim, int choice){
            if(!victim.callsBluff() || victim.playContessa()){
                victim.player_cards.remove(choice);
            }
        }