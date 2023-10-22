public class Mercenary_Assassin{
        
        final private int ID = 2; 


        public static void assassinate(Player assassin, Player victim, int choice){
            if(!victim.callsBluff() || victim.playContessa()){ //fix error with the "callsBluff method"
                victim.player_cards.remove(choice);
            }
        }

        public static void assassinationAttempt(Player aggressor, Player defender)
        {
            //attempting an assassination on a specified player.    
        }

        private static void assassinationSuccess(Player defender)
        {
            //a player choice for which card they would like to eliminate. 
        }

        public int getID()
        {
            return ID; 
        }



    }