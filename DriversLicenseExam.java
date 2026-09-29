import java.util.Scanner;
public class DriversLicenseExam 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);

        //array of correct answers
        char[] correctAns = 
        {'A','D','B','B','C','B','A','B','C','D',
        'A','C','D','B','D','C','C','A','D','B'};

        //array for student answers
        char[] studentAns = new char[20];

        System.out.println("Answer A, B, C, or D for each question.");
        System.out.println("To pass get 15 out of 20 correct.");

        //for loop to for 20 questions
        for(int i=0; i<20; i++)
        {
                System.out.println("\nQuestion "+(i+1)+": ");
                char answer = keyboard.next().toUpperCase().charAt(0);
                //validation for a b c d
                while(answer != 'A' && answer != 'B' && answer != 'C' && answer != 'D')
                {
                    System.out.println("Invalid answer");
                    System.out.println("Question "+(i+1)+": ");
                    answer = keyboard.next().toUpperCase().charAt(0);
                }
                studentAns[i] = answer;
        }
        
        int correct=0;
        int incorrect=0;

        int[] incorrectQuestion = new int[20];
        int questionNum=0;
        //counts how many were correct
        for(int i=0; i<20; i++)
        {
            if(studentAns[i] == correctAns[i])
                {correct++;}
            else
                {
                    incorrect++;
                    incorrectQuestion[questionNum++] = i+1;
                }
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

        //list of incorrect answers
        System.out.println("\nQuestion numbers that were answered incorrectly.");
        for(int i=0; i<questionNum; i++)
        {
            System.out.print("Question: "+incorrectQuestion[i]);
            if(i<questionNum-1)
            {System.out.print(", ");}
        }

    }

}
