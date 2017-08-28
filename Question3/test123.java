import java.util.Scanner;

public class test123
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String s = "meringue albumen foulard eudaemonic narcolepsy elucubrate"
            + " vivisepulture pococurante cymotrichous malfeasance";
        Scanner scanString;
        scanString = new Scanner(s);

        int index = (int) (Math.random()*4) + 1; //cast this to get the 4
        System.out.println(index);
        String word = "";
        
        for(int n=1; n<=index; n++)
        {
            word = scanString.next();
        }
        System.out.println(word);

        StringBuffer answer = new StringBuffer(word); //want to use so that user can guess when i put as ---
        //        System.out.println(reader.next());
        //      System.out.println(reader.next());
        for(int n=0; n<answer.length(); n++)
        {
            answer.setCharAt(n, '-');
        }
        System.out.println(answer);

        System.out.print("Enter a letter: ");
        char c = console.nextLine().charAt(0);
        for(int n=0; n<answer.length(); n++)
        {
            if (word.charAt(n) == c)
            {
                answer.setCharAt(n,c);
            }
        }
        System.out.println(answer);
        
    }
}
