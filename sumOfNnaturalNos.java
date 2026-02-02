package recursion;

import java.util.*;
public class sumOfNnaturalNos {
    
    public static int m;
    public static int sum;

    public static void sumOfn(int n) {
        
        sum += n;
        
        if (n==0){
            System.out.println("The sum of first "+m+" natural numbers is = "+sum);
            return;
        }
        sumOfn(n-1);
        
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter the value : ");
            m = sc.nextInt();

            sumOfn(m);


        }
    }
}
