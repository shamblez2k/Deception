public class Assassin{
        
        public static void assassinate(Player assassin, Player victim, int choice){
            if(!victim.callsBluff() || victim.playContessa()){
                victim.player_cards.remove(choice);
            }
        }

        public static void assassinationAttempt(Player aggressor, Player defender)
        {
            
        }

        private static void assassinationSuccess(Player defender)
        {
            //a player choice for which card they would like to eliminate. 

        }


    }