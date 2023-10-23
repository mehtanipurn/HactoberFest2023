import java.util.Scanner;

public class ExampleGCDUsingEuclidAlgorithm {

  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);

       System.out.println("Enter first number: ");
       int num1 = sc.nextInt();

       System.out.println("Enter second number: ");
       int num2 = sc.nextInt();
       
    System.out.println("GCD = " + gcdRecursion(num1,num2));
    
  }

    public static int gcdRecursion(int m, int n) {
        if (n == 0) return m;
        else return gcdRecursion(n, m % n);
    }
    
}
