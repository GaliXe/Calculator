import java.util.Scanner;

public class Expressions {
    Scanner input = new Scanner(System.in);
    boolean cont = true;
    double result;

    public void add()
    {
        double int1 = input.nextInt();
        double int2 = input.nextInt();
        result = int1 + int2;
        
        System.out.print(result);

        while(cont = true)
        {
            System.out.println("Wish to continue with?: ");
            String contOp = input.next();
            
            switch(contOp)
            {
                case "yes":
                break;

                case "no": cont = false;
                break;

                default: System.out.println("INVALID CHOICE");
            }    
        }
    }
}
