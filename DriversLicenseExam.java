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
        for(int i=0; i<=19; i++)
        {
            System.out.println("\nQuestion "+(i+1)+": ");
            studentAns[i] = keyboard.next().toUpperCase();
            
        }
        //System.out.println(studentAns);


    }

}
