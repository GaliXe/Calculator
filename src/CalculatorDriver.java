import java.util.Scanner;

public class CalculatorDriver {
    static Expressions Exp = new Expressions();
    public static void main(String[] args) throws Exception {
        boolean quit = false;
        Scanner input = new Scanner(System.in);
        
        while(!quit)
        {
            System.out.println("Chosse and option out of these: add, subtract, multiply, divide, quit");
            String selection = input.next().trim();

            switch(selection)
            {
                case "add": System.out.println("not implemented");
                break;

                case "subtract": System.out.println("not implemented");
                break;

                case "multiply": System.out.println("not implemented");
                break;

                case "divide": System.out.println("not implemented");
                break;
                
                case "quit": quit = true;
                break;

                default: System.out.println("Invalid Choice");
            }
        }
        System.out.println("\nTerminating the program");
        System.out.println("Hello, World!");
    }
}
