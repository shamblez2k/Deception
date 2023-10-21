public class Captain
    {
        public boolean claim;
        public boolean truth;
        public static void pillage(Player pillager, Player victim){
            if(victim.callBluff()){
                deceptionCallOut(claim, truth);
            }
            else{
                pillager.modifyCC(2);
                victim.modifyCC(-2);
            }
  
        }
    }