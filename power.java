import java.util.Scanner;

public class power {
    public static int pow(int n,int i,int j) {

        if (j == 1){
            return n ;
        }

        return pow(n*i , i , j-1);
    }

    public static void main(String[] args) {
        
        try(Scanner s = new Scanner(System.in)){

            System.out.print("Enter the value -> ");

            int num = s.nextInt();
            int ind = s.nextInt();

            System.out.println("The power of "+num+ " raised to "+ind+" is : "+pow(num, num , ind));
        }
    }
}
