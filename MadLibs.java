import java.util.Scanner;

public class MadLibs {
    public static void main(String args[])

    //MAD LIBS GAME
    {
     Scanner scanner = new Scanner(System.in);

    String adjective1;
    String noun1;
    String verb1;
    String adjective2;
    String adjective3;
    
    System.out.print("Enter an adjective(description): ");
    adjective1 = scanner.nextLine();
    System.out.print("Enter a noun (animal or person): ");
    noun1 = scanner.nextLine();
    System.out.print("Enter an adjective(description): ");
    adjective2 = scanner.nextLine();
    System.out.print("Enter a verb ending with -ing (action): ");
    verb1 = scanner.nextLine();
    System.out.print("Enter an adjective(description): ");
    adjective3 = scanner.nextLine();


    

     
    System.out.println("Today I went to a " + adjective1 + " zoo.");
    System.out.println("In an exhibit, I saw a " + noun1 + ".");
    System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
    System.out.println("I was " + adjective3 + "!");
    
    

    }
    
}
