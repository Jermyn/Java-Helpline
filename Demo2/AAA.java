import java.util.ArrayList;
import java.util.Scanner;

public class AAA {

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<String>();
        ArrayList<Integer> phone = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        String answer = "";

        {
            do {
                System.out.println("Please enter your name: ");
                name.add(scanner.next());
                System.out.println("Please enter your number: ");
                phone.add(scanner.nextInt());
                System.out.println("Do you want to add a directory yes/no?");
                answer = scanner.next();
            } while (answer.equals("yes"));
            if (answer.equals("yes")); //want it to go back to start another direcotry here
            else {

                System.out.println("Thanks for adding to the directory");
                for (int i = 0; i < name.size(); i++) {
                    System.out.print(name.get(i)+"\t");
                    System.out.print(phone.get(i));
                    System.out.println("");
                }
            }


        }

    }
}