import java.util.Scanner;
public class DriversLicenseExam 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);

        //array of correct answers
        String[] correctAns = 
        {"A","D","B","B","C","B","A","B","C","D",
        "A","C","D","B","D","C","C","A","D","B"};

        //array for student answers
        String[] studentAns = new String[20];

        System.out.println("Answer A, B, C, or D for each question.");

        //for loop to for 20 questions
        for(int i=0; i<20; i++)
        {
                System.out.println("\nQuestion "+(i+1)+": ");
                String answer = keyboard.next().toUpperCase();
                studentAns[i] = answer;
            
        }
        
        int correct=0;
        int incorrect=0;
        //counts how many were correct
        for(int i=0; i<20; i++)
        {
            if(studentAns[i] == correctAns[i])
                {correct++;}
            else
                {incorrect++;}
        }

        if(correct >= 15)
        {
            System.out.println("You passed the exam");
            System.out.println("You answered "+correct+" questions correct and "+incorrect+" questions incorrect.");
        }
        else
        {
            System.out.println("You failed the exam");
            System.out.println("You answered "+correct+" questions correct and "+incorrect+" questions incorrect.");
        }

    }

}
