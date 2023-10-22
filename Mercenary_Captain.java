public class Mercenary_Captain
    {
        final private int ID = 3; 

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

        public int getID()
        {
            return ID;
        }


    }