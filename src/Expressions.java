import java.util.Scanner;

public class Expressions {
    Scanner input = new Scanner(System.in);
    boolean cont = true;

    public void add()
    {
        double int1 = input.nextInt();
        double int2 = input.nextInt();
        double result = int1 + int2;
        
        System.out.print(result);
    }
}
