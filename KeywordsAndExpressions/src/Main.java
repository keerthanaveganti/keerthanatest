//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean gameOver=true;
        int score=400;
        int levelCompleted=5;
        int bonus=100;

//        if(score==5000){
//            System.out.println("your score was 5000");
//        }
//
//        if(score<5000){
//            System.out.println("your score was lessthan 5000");
//        }
//        else{
//            System.out.println("your need score morre than 5000");
//        }


        if(score<5000 && score>1000){
            System.out.println("your score was lessthan 5000 but grater than 1000");
        }
        else if(score<1000){
            System.out.println("score is less than 1000");
        }
        else{
            System.out.println("your need score morre than 5000");
        }


    }
}