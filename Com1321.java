import java.util.Scanner;

public class xavhi1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // A = p(1+i/n)^n*m

    System.out.print("Enter initial amount: ");
    double p = input.nextDouble();

    System.out.print("Enter Annual interest rate (in decimal): ");
    double i = input.nextDouble();

    System.out.print("Enter time period: ");
    double n = input.nextDouble();

    System.out.print("Enter interest coumpound mounthly : ");
    double m = input.nextDouble();


   double x = i/n;
   double y = n*m;

   double A1 = Math.pow((1+x), y);
   double A2 = p*A1;

   System.out.println("compound interest Amount is "+A2);

   input.close();
   
   

    
    }
}