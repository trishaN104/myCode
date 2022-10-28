  
import java.util.Scanner;

class Main {



    public static void main(String[]args)
    {
      
      
        Scanner scan=new Scanner(System.in);
        int choice;
        int i=0;
        int k=0;
        boolean control=true;
        boolean innerControl=true;
        int score=0;
        int cscore=0;
        String play;



      
        System.out.println("Welcome to Rock, Paper, Scissors!");
System.out.println();

        System.out.println("Choose one of the options below to proceed:");
        System.out.println("1 - Best of 3\n2 - Best of 5\n3 - Best of 7\n4 - Unlimited Play!");
        choice=scan.nextInt();




      
      System.out.println();
      System.out.println();






      
      
        if (choice==1)
        {
            System.out.println("The first to win 2 games wins overall.");
            i=3;
            k=2;
        }
        if (choice==2)
        {
            System.out.println("The first to win 3 games wins overall.");
            i=5;
            k=3;
        }
        if (choice==3)
        {
            System.out.println("The first to win 4 games wins overall.");
            i=7;
            k=4;
        }
        if (choice==4)
        {
            System.out.println("Type in 'exit' to stop playing.");

        }
       scan.nextLine();





      
        System.out.println();
        System.out.println();
      





      
        while (control==true) 
        {
            score=0;
            cscore=0;
            int counter=0;
            String Cplay = null;
          
          
            while (innerControl == true) 
            {
              
              
                System.out.println("Enter a R for rock, S for scissor, or P for paper");
               play = scan.nextLine();
                play = play.toLowerCase();
                counter=counter+1;

              
              
                int cPlay = (int) (Math.random() * 3);
                if (cPlay == 0)
                    Cplay = "r";
                if (cPlay == 1)
                    Cplay = "p";
                if (cPlay == 2)
                    Cplay = "s";


              
              System.out.println();
              System.out.println();

              
              
                if (play.equals("r")) {
                    if (Cplay.equals("p")) {
                        System.out.println("You picked rock. The computer picked paper. You lost!");
                        cscore = cscore + 1;
                    }
                    if (Cplay.equals("s")) {
                        System.out.println("You picked rock. The computer picked scissors. You won!");
                        score = score + 1;
                    }
                    if (Cplay.equals("r")) {
                        System.out.println("You picked rock. The computer picked rock. Tie!");
                    }
                }

                if (play.equals("p")) {
                    if (Cplay.equals("p")) {
                        System.out.println("You picked paper. The computer picked paper. Tie!");
                    }
                    if (Cplay.equals("s")) {
                        System.out.println("You picked paper. The computer picked scissors. You lose!");
                        cscore = cscore + 1;
                    }
                    if (Cplay.equals("r")) {
                        System.out.println("You picked paper. The computer picked rock. You win!");
                        score = score + 1;
                    }
                }

                if (play.equals("s")) {
                    if (Cplay.equals("p")) {
                        System.out.println("You picked scissors. The computer picked paper. You win!");
                        score = score + 1;
                    }
                    if (Cplay.equals("s")) {
                        System.out.println("You picked scissors. The computer picked scissors. Tie!");
                    }
                    if (Cplay.equals("r")) {
                        System.out.println("You picked scissors. The computer picked rock. You lose!");
                        cscore = cscore + 1;
                    }
                }




              
              System.out.println();
              System.out.println();

              
              System.out.println("Your score: "+score);
              System.out.println("Computer score: "+cscore);

              
                if (choice==4)
                {
                    System.out.println("if you would like to stop playing, type in exit");
                    if (play.equals("exit"))
                        innerControl=false;
                }

                else if ((cscore==k))
                {
                    innerControl=false;
                    System.out.println("The computer won, you lost :(");
                }

                else if (counter==i)
                {
                    innerControl=false;
                    if (cscore>score)
                        System.out.println("The computer wins, you lost :(");
                    else if (cscore==score)
                        System.out.println("Tie :|");
                    else
                        System.out.println("You win!!!");
                }

                else if ((score==k)){
                    innerControl=false;
                    System.out.println("The computer lost, you win :)");
                }


            }
          
            System.out.println("press p to play again");
            String playAgain=scan.nextLine();
            if (playAgain.equals("p"))
            {
                innerControl=true;
            }
            else {
                control=false;
            }
        }


    }
}

