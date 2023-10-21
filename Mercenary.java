public class Mercenary{
    private String name;
    private Boolean alive;

    public Mercenary(String name){
        this.name = name;
        alive = true;
    }

    public String getCharacter(){
        return name;
    }

    public Boolean isAlive(){
        return alive;
    }

    public void eliminated(){
        alive = false;
    }

    public void action(playerNode user, playerNode target, String action){
        switch(action)

    }

    public void assassinate(Mercenary target){
        if(name == "Assassin"){
            target.alive = false;
        }
    }

    public Boolean blockAssassination(){
        if(name == "Contessa"){
            return true;
        }
        return false;
    }

    public int pillage(playerNode player){
        if(name == "Captain"){
            player.loseCoins(2);
            this.addCoins(2);
        }
        return 0;
    }

    public void preventPillage(){

    }

    public void preventAid(){

    }

    public void reinforcement(){

    }

    public int treasuryYield(){
        return 3;
    }

    public void counterAction(String action){
        if(action == "assassinate" && this.name == "Contessa"){
            
        }
        else if(action == "pillage" && (this.name == "Captain" || this.name == "Ambassador")){

        }
        else if(action == "getForeignAid" && this.name == "Duke"){

        } 
    }
}