import java.util.Scanner;

public class Question2
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String s = "meringue albumen foulard eudaemonic narcolepsy elucubrate"
            + " vivisepulture pococurante cymotrichous malfeasance";
        Scanner scanString;
        scanString = new Scanner(s);

        
        String word = "";
        char spell=' ';
        int length;
        int start = 0;
        int tries = 0;
        int guess = 0;
        
        do {
            int index = (int) (Math.random()*4); //cast this to get the 4
            for(int n=0; n<=index; n++)
            {
                word = scanString.next();
            }
            scanString.close();
            scanString = new Scanner(s);
            length = word.length();

            StringBuffer answer = new StringBuffer(word); //want to use so that user can guess when i put as ---
            //        System.out.println(reader.next());
            //      System.out.println(reader.next());
            for(int n=0; n<answer.length(); n++)
            {
                answer.setCharAt(n, '-');
            }
            System.out.println("Spell this " + length + "-letter word in 5 tries");
            System.out.println(answer);

            while ((spell==' ' || spell=='n') && (tries<5)) {
                System.out.print("Enter a letter: ");
                char c = console.next().charAt(0);
                tries++;
                for(int n=0; n<answer.length(); n++)
                {
                    if (word.charAt(n) == c)
                    {
                        answer.setCharAt(n,c);
                        guess = 1;
                    }
                }
                System.out.println(answer);
             
                if ((tries<5) && (guess==1)) {
                    System.out.println("Do you want spell the word now? (y/n): ");
                    spell = console.next().charAt(0);
                }
            }

            System.out.println("Spell the complete word: ");
            String complete = console.next();
            if (complete.equals(word))
                System.out.println("You are correct!");
            else
                System.out.println("You are incorrect.");
            System.out.println("The correct word is " + word);
            System.out.print("Spell another word? (y/n): ");
            char cont = console.next().charAt(0);
            if (cont=='n') {
                System.out.println("Thank you for playing Spell The Word!");
                start = 0;
            }
            else {
                start = 1;
                tries = 0;
                guess = 0;
                spell = ' ';
            }
        } while(start==1);
    }
}
