import java.util.Scanner;
import java.util.Random;

class Twenty_Three
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       Random rand = new Random();

       int playerNum;
       int cpuNum;
       boolean cpuL = false;
       boolean showSystemProperties = false;


    System.out.println("\nTwenty-Three: The Game");

    System.out.println("Instructions:");
        try {
        Thread.sleep(1500);
        } catch (InterruptedException a) {
        a.printStackTrace();
        }
    System.out.println("The goal of this game is to not say the number 23");
        try {
        Thread.sleep(1500);
        } catch (InterruptedException b) {
        b.printStackTrace();
        }
    System.out.println("Each turn you must enter in between 1-3 numbers!");
        try {
        Thread.sleep(1500);
        } catch (InterruptedException c) {
        c.printStackTrace();
        }
    System.out.println("The CPU (your opponent) will do the same");
        try {
        Thread.sleep(1500);
        } catch (InterruptedException d) {
        d.printStackTrace();
        }
    System.out.println("\nGood Luck!");

    System.out.println("Enter Any Key To Start");
    String Null = sc.nextLine();

    System.out.println("Randomizing Starting player...");
        try {
        Thread.sleep(1500);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
    int first = rand.nextInt(2)+1;

        if (first == 1)
            {
            System.out.println("\nYou go first!\n\n\n");
            }
        else
            {
            System.out.println("\nCPU goes first!\n\n\n");
            }


    for (int i = 1; i <= 23; i++)
        {


            //Starting if cpu starts - breaks out of loop
            if (first == 2)
                {
                System.out.println("\nCPU: 1, 2, 3");
                i+=3;
                first = 1;
                }


            System.out.println("\n\nEnter the amount of numbers you would like to put:");
            playerNum = sc.nextInt();


        //Checks for right input before adding - if wrong it skips turn and adds one
        if (playerNum > 0 && playerNum < 4)
            {
            i = i + playerNum - 1;
            }

        System.out.print("\nPlayer: ");
            switch (playerNum){
            case 3:
                System.out.print(i-2 + ", ");
            case 2:
                System.out.print(i-1 + ", ");
            case 1:
                System.out.println(i);
                break;
            default:
                System.out.println("ERROR! INCORRECT INPUT: Please input a number between 1-3.");
                System.out.println("To help you out, an input of 1 was added for that turn for you.");
            }


            cpuNum = rand.nextInt(3)+1;
            //Logic so the bot doesn't sell
            switch (i)
                {
                //Taking Loss
                case 22:
                    cpuNum=1;
                    cpuL=true;
                    break;
                //Taking Win
                case 21:
                    cpuNum=1;
                    break;
                case 20:
                    cpuNum=2;
                    break;
                case 19:
                    cpuNum=3;
                    break;
                }

            i = i + cpuNum;

        System.out.print("\nCPU: ");
        switch (cpuNum)
            {
            case 3:
                System.out.print(i - 2 + ", ");
            case 2:
                System.out.print(i - 1 + ", ");
            case 1:
                System.out.print(i);
                break;
            default:
                System.out.println("Bots don't make mistakes! Hi from the src code!!");
            }

        }

        if(cpuL)
            {
            System.out.println("\n\n\nGGs! You Win!");
            }
        else
            {
            System.out.println("\n\n\nUh Oh, CPU wins!");
            }

        showSystemProperties = true;


        if (showSystemProperties)
            {
            System.out.println("\n\n\n");
            System.out.println("Java Version: " + System.getProperty("java.version") + " by " + System.getProperty("java.vendor"));
            System.out.println("User: " + System.getProperty("user.name"));  //<-- TURNED OFF FOR PRIVACY IN THE VIDEO
            System.out.print("Operating System: " + System.getProperty("os.name"));
            System.out.println(" " + System.getProperty("os.version"));
            System.out.println ("By: Blu");
            System.out.println ("Coded for Hack Club High Seas on November 29th 2024");
            }


    }
}