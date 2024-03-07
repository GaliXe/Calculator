import java.util.Scanner;

public class Expressions {
    Scanner input = new Scanner(System.in);
    boolean cont = false;
    double result;

    public void add()
    {
        double int1 = input.nextInt();
        double int2 = input.nextInt();
        result = int1 + int2;
        
        System.out.println(result);

        while(!cont)
        {
            System.out.println("Wish to continue with?: ");
            String contOp = input.next();
            
            switch(contOp)
            {
                case "yes":
                break;

                case "no": cont = true;
                break;

                default: System.out.println("INVALID CHOICE");
            }    
        }
        System.out.println("Exiting expression");
    }
}
