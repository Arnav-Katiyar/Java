import java.util.Scanner;

public class ShoppingCart {
public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("What would you like to buy? : ");
    String food = scanner.nextLine();
    System.out.print("What is the price of each " + food + "? : " );
    double price = scanner.nextDouble();
    System.out.print("How many " + food + " would you like? : ");
    int quantity = scanner.nextInt();
    double total = price*quantity;
    System.out.print("\n\n\nYou have bought " + quantity + " " + food + "/s ");
    System.out.print("Your total is $" + total);

    scanner.close();

}
    
}
