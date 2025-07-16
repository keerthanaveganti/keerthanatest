public class Hello {
    public static void main(String[] args) {
        System.out.println("\n Hello Keerthana");
        System.out.println("\n Hello world");

        boolean isAlien=false;
        if(isAlien==false) {
            System.out.println("It is not alien");
        }
        //System.out.println("It is alien");

        int top_score=1100;
        if(top_score>100)
        {
            System.out.println("You got high score");
        }
        else{
            System.out.println("No you didnt get high score");
        }

        int secondtop_score=60;
        if(top_score>secondtop_score && secondtop_score>50){
            System.out.println("greater than second and less than topscore ");
        }

        if(top_score < secondtop_score && secondtop_score > 50){
            System.out.println(" this case failed ");
        }

        if(top_score>1000 || secondtop_score<100){
            System.out.println("one of this is true");
        }

        int newvalue=50;
//        if(newvalue=50) # we are  assigning a value here but we need to check the value
//        {
//            System.out.print("error");
//        }

        if(newvalue==50)
        {
            System.out.println("yes the newvalue is "+newvalue);
        }

        boolean isCar=false;
        if(!isCar){ //not operator
            System.out.println("\nThis is not supposed to happen");
        }

        //Assign operator
        if(isCar==true){
            System.out.println("\nThis is not supposed to happen");
        }

        //ternary operator-shortcut of if-then-else statement
        String makeOfCar="BMW";
        boolean isDomestic= makeOfCar=="BMW"?true:false;

        if(isDomestic){
            System.out.println("This car is domestic to our country");
        }

        int age=16;
        String ageText;
        ageText=(age<=18)?"false":"true";
        System.out.println(ageText);


        double val1=20.00d;
        double val2=80.00d;
        //double sum=val1+val2*100d;
        double sum=(val1+val2)*100d;
        System.out.println("\n"+sum);
        double rem=sum%40;
        System.out.println("\n"+rem);
        boolean val=(rem==0)?true:false;
        System.out.println("\n"+val);
        if(!val){
            System.out.println("\ngot some reminder");
        }








    }
}
