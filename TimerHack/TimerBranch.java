

public class TimerBranch{


private static final int Total_Time= 30;

    public static void main (String [] args){
        

        
        System.out.println("You have 30 seconds to make your move!");
       Thread countdownThread= new Thread(new Runnable() {
        @Override
        public void run(){
            for(int i=Total_Time; i>=0; i--){
                System.out.println(i+ " ");
                try{
                    Thread.sleep(1000);
            
                }catch(Exception e){
                    System.out.println("Error: " + e);

                }
            }
            System.out.println("\n Your time has ended");


        }
       });
countdownThread.start();
    }
}