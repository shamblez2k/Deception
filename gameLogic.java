public class gameLogic{

    //passive actions

    public static void economy(Player player){
        player.modifyCC(1);
    }

    public static void foreignAid(Player player){
        player.modifyCC(2);
    }

    public static void kill(Player attacker, Player victim, int choice){
        attacker.modifyCC(-7);
        victim.player_cards.remove(choice);
    }

    public static void blockAction(Player blocker, Player blocked){

    }





}