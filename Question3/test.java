import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String s = "meringue albumen foulard eudaemonic narcolepsy elucubrate"
            + " vivisepulture pococurante cymotrichous malfeasance";
        Scanner scanString;
        scanString = new Scanner(s);

        int index = (int) (Math.random()*4); //cast this to get the 4
        System.out.println(index);
        String word = "";
        int length;
        int guess = 0;
        int again = 0;
        
        for(int n=0; n<index; n++)
        {
            word = scanString.next();
        }
        System.out.println(word);
        length = word.length();

        StringBuffer answer = new StringBuffer(word); //want to use so that user can guess when i put as ---
        //        System.out.println(reader.next());
        //      System.out.println(reader.next());
        for(int n=0; n<answer.length(); n++)
        {
            answer.setCharAt(n, '-');
        }
        System.out.println(answer);

        do {
            System.out.print("Enter a letter: ");
            char c = console.nextLine().charAt(0);
            for(int n=0; n<answer.length(); n++)
            {
                if (word.charAt(n) == c)
                {
                    answer.setCharAt(n,c);
                    guess = 1;
                }
            }
            System.out.println(answer);
        } while(guess==0); //why do a do-while loop?

        /*Need to do a do-while loop to ask user if he wants to spell the word out.
        If he wants, get him to spell the complete word. Feedback to him if its correct.
        If he doesnt want, get him to enter another letter.*/
    }
}
