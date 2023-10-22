package Deception;
import java.util.ArrayList;
import java.util.Arrays; 

public class DeckTemp {
    
    public ArrayList<Integer>initial = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,5));


    public void setDrawPile(ArrayList<Integer>initial)
    {
        this.initial = initial; 
    }

    public ArrayList<Integer> getDrawPile()
    {
        return initial;    
    }


    //we would like to access the values within the list
    public void draw(ArrayList<Integer>playerDeck)
    {
        playerDeck.add(initial.get(initial.size()-1));
        playerDeck.add(initial.get(initial.size()-2)); 

        initial.remove(initial.size()-1);
        initial.remove(initial.size()-2);
    }

    public static ArrayList<Integer> initialReference()
    {   
        return 
    }
    
 
    /*
     * each number will determine a clas type:
     * 1: Duke
     * 2: Captain
     * 3: Ambassador
     * 4: Assassin
     * 5: Contessa
     *  acquire the appropriate node base on the value: 
     * 
     */




}

/*
 * deciding how the cards are represented:
 * the player is given an arraylist of integers, such that each integer
 * represents a card in the player's arsensal
 * 
 * The next step: 
 * -> determining when to identify when the card value is being used
 *    the player can either choose between the two options in their arsenal
 *    or attempt to decieve another player with a fradulent card. 
 * 
 *  {1,2}   
 *  the available options appear as such: 
 *  
 *  
 * 
 * 
 * 
 */





   // private Merc Duke;
    // private Merc Captain;
    // private Merc Ambassador;
    // private Merc Assassin;
    // private Merc Contessa; 
    
    // public ArrayList<Merc> mercList = new ArrayList<>(); 
   
    // public DeckTemp()
    // {
    //     mercList.add(Duke);
    //     mercList.add(Captain);
    //     mercList.add(Ambassador);
    //     mercList.add(Assassin);
    //     mercList.add(Contessa);
    // }



    //we would shuffle the list 