package recursion;

import java.util.*;

public class generalRecursion {

    public static void fibonacci(int n , int a , int b) {

        
    if (n == 0 ){
            return ;
        }

    int c = a + b;
    
    System.out.print(c+" ");
    fibonacci(n-1, b, c);
    }

    public static int factorial(int n) {

        if (n <= 1){
            return 1;
        }
        
        return n *= factorial(n-1);
        //VOID DOESN'T WORK HERE AS IT DOESN'T RETURN A VALUE
        
    }
    public static void main(String[] args) {
        
        try(Scanner s = new Scanner(System.in)){

            System.out.print("Enter the value -> ");

            int a = 0;
            int b = 1;

            int num = s.nextInt();
            System.out.println("The factorial is = "+factorial(num));
            System.out.print(a+" ");
            System.out.print(b+" ");
            fibonacci(num-1, a, b);    
        }
    }
}
