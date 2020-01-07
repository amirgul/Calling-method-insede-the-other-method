import java.util.Queue;
import java.util.Scanner;

public class Oracle
{
   public String oldQuestion = "The answer is in my heart";
   public String newQuestion;
   public String Question;
   Scanner keyboard = new Scanner(System.in);

   public void chat()
   {
       System.out.println("My name is oracle I can answer one line question");
       System.out.println("You can ask now");
       String response;
       do
           {
               answer();
               System.out.println("Do you wish to ask another question");
               System.out.println("please enter yes or no");
               response = keyboard.next();
               }while (response.equalsIgnoreCase("yes"));

       System.out.println("Oracle will rest now!!!!");

   }
    private void answer()
    {
        System.out.println("what is your question");
        System.out.println("enter your quesiont");
        Question = keyboard.nextLine();
        seekAdive();
        System.out.println("you asked the question: "+ Question);
        System.out.println("Now here is my answer: "+ oldQuestion);
        update();

    }
    private void seekAdive()
    {
        System.out.println("I need some help with that");
        System.out.println("enter your new quesion");
        newQuestion = keyboard.nextLine();
        System.out.println("Thank you that help a lot");


    }
    private void update()
    {
        newQuestion = oldQuestion;
    }
}
