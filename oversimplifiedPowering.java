import java.util.Scanner;

public class oversimplifiedPowering {
    public static int pow(int n,int i) {

        if (i == 0){
            return n ;
        }

        return pow(n+n , i-1);
    
    }

    public static void main(String[] args) {
        
        try(Scanner s = new Scanner(System.in)){

            System.out.print("Enter the value -> ");

            int num = s.nextInt();
            int ind = s.nextInt();    

            System.out.println("The power of "+num+ " raised to "+ind+" is : "+pow(num, ind+1));
        }

    }
}