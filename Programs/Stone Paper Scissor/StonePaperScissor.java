import java.util.Random;
import java.util.Scanner;
public class StonePaperScissor
{
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        Random obj=new Random();
        System.out.println("Welcome to the Game!!\nLet's go to the Hint.");
        System.out.println("Enter 1 for Stone\nEnter 2 for Paper\nEnter 3 for Scissor");
        System.out.println("Enter no. of times you want to play= ");
        int a=input.nextInt();
        int min=1;
        int max=3;
        int s1=0,s2=0,s3=0;
        String c1="",c2="",c3="";
        for(int i=1;i<=a;i++)
        {
            System.out.println("Enter your choice= ");
            int b=input.nextInt();
            int c=obj.nextInt(max-min)+min;
            if(b==1)
            {
                System.out.println("You chose Stone");
                if(c==1)
                c1="Stone";
                else if(c==2)
                c1="Paper";
                else
                c1="Scissor";
                System.out.println("Computer Chose= "+c1);
            }
            else if(b==2)
            {
                System.out.println("You chose Paper");
                if(c==1)
                c2="Stone";
                else if(c==2)
                c2="Paper";
                else
                c2="Scissor";
                System.out.println("Computer Chose= "+c2);
            }
            else if(b==3)
            {
                System.out.println("You chose Scissor");
                if(c==1)
                c3="Stone";
                else if(c==2)
                c3="Paper";
                else
                c3="Scissor";
                System.out.println("Computer Chose= "+c3);
            }


            if(c==1 && b==1 || c==2 && b==2 || c==3 && b==3)
            {
                System.out.println("Match Drawn.");
                s3++;
                System.out.println("Your Score= "+s1+" , "+ " Computer Score= "+s2+" , "+" Drawn= "+s3);
            }
            else if(b==1 && c==3 || b==2 && c==1 || b==3 && c==2)
            {
                System.out.println("You Won!!");
                s1++;
                System.out.println("Your Score= "+s1+" , "+ " Computer Score= "+s2+" , "+" Drawn= "+s3);
            }
            else if(b>3)
            {
                System.out.println("Invalid Choice...");
            }
            else
            {
                System.out.println("Computer Won!!");
                s2++;
                System.out.println("Your Score= "+s1+" , "+ " Computer Score= "+s2+" , "+" Drawn= "+s3);
            }

        }

        if(s1>s2)
        {
            System.out.println("\nHurrahh!! You Won The Game.");
        }
        else
        {
            System.out.println("\nSorry!! You Lost the Game\nBetter Luck next time!!");
        }
    }
                  }
