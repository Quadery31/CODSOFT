import java.util.*;
class NumberGame
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO THE GUESS NUMBER GAME!!!!");
        System.out.println(" You have 3 attemps to guess the number");
        System.out.println("READY??");
        //create instance of Random class
        Random number =new Random();
        // generate a random number and cover it into integer type
        int r=number.nextInt(100)+2;
        int i=0;
        int c=11;
        while(i<3)
        {
            // int x=1;
            System.out.println("Guess a number within 100");
            int n=sc.nextInt();
            c--;
            if(n==r)
            {
                System.out.println("CONGRATULATIONS!!! YOU GUSSED THE CORRECT NUMBER");
                break;
            }
            else
            if(n>r){
            System.out.println("Number Gussed is too high, try gussing a smaller number");
            
            }
            else 
            if(n<r){
            System.out.println("Number Gussed is too low,try gussing a higher number ");
            }
            i++;
            if(i>=3)
            {
                System.out.println("Sorry you have already tried 3 times. The correct number was  "+r);
            }
        }
    System.out.println("YOUR SCORE IS "+ c);
    System.out.println(" WANNA PLAY AGAIN?");
    }

}