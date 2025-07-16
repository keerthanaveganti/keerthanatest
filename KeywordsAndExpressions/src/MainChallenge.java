//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver=true;
        //boolean gameOver=false;
        int score=400;
        int levelCompleted=5;
        int bonus=100;

        int finalscore=score;
        if(gameOver==true){
            finalscore+=(levelCompleted*bonus);
            System.out.print("your final score is "+finalscore);
        }


        boolean newgameOver=true;
        int newscore=1000;
        int newlevelCompleted=8;
        int newbonus=200;

        int newfinalscore=newscore;
        if(gameOver==true){
            finalscore+=(levelCompleted*bonus);
            System.out.print("\nyour final score is "+finalscore);
        }

        //here we are recreating the same variables with different name sinstead we can resue them

        gameOver=true;
        //boolean gameOver=false;
         score=10000;
         levelCompleted=8;
         bonus=200;
         finalscore=score;
        if(gameOver==true){
            finalscore+=(levelCompleted*bonus);
            System.out.print("\nyour final score is "+finalscore);
        }


    }
}