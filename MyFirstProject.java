import java.util.Scanner;

class MyFirstProject
{
    public static void main(String args[])
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("What is your age: ");
    int age = scanner.nextInt();
    
    System.out.println("What is your gpa? ");
    double gpa = scanner.nextDouble();

    System.out.print("are you a boy? true /false: ");
    boolean isBoy = scanner.nextBoolean();

    System.out.println("Your name is: " + name);
    System.out.println("Your age is " + age);
    System.out.println("your gpa is " + gpa + "???");

    if(isBoy) {
        System.out.print("so you are a boy");
    }
    else{
        System.out.print("please answer either \"true\" or \"false\" ");
    }

    scanner.close();



}
}



