package Task1;
import java.util.Random;
import java.util.Scanner;
public class Number_game
{
        public static void main(String[] args)
        {
            int num,i,x,flag=0;
            char d;
            do
            {
                Random r1=new Random();
                Scanner sc=new Scanner(System.in);
                x=r1.nextInt(100);
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+Number Game+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                System.out.println("");
                System.out.println("Enter number between 1 to 100");
                System.out.println("You have 5 attempts to guess the number");
                System.out.println("");
                for(i=1;i<=5;i++)
                {
                    int a=4;
                    System.out.println("");
                    System.out.println("Guess the number :");
                    num=sc.nextInt();
                    if(x==num)
                    {
                        System.out.println("Excellent! you guessed the number correctly.");
                        flag++;
                        break;
                    }
                    else if (x>num && x!=num-1)
                    {
                        System.out.println("Too high !!! The number is greater than "+num);
                    }
                     else if (x<num && x!=num-1)
            {
                System.out.println("Too low !!! The number is less than "+num);
            }
        }
        System.out.println("");
        if(flag==0)
        {
             System.out.println("Sorry !!! you have exhausted ....your attempts are over ....Try again");
             System.out.println("");
             System.out.println("The number was :"+x);
        }
        System.out.println("Do you want to continue ? (y/n)");
        d=sc.next().charAt(0);
        }while(d=='y' || d=='Y');
        System.out.println("");
        System.out.println("Total rounds cleared "+flag);
        System.out.println("");
        System.out.println("Thank you!!!!!");
    }
}
