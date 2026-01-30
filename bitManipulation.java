import java.util.*;


public class bitManipulation {
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);

        bitManipulation ob1 = new bitManipulation();

        ob1.clearBit();

    }

    void clearBit(){

        Scanner sc = new Scanner(System.in);
               
        // SET BIT TO 0 || CLEAR

        System.out.print("Enter the number to check : ");
        int num = sc.nextInt();
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();

        int bitMask = ~(1<<pos);
        int newNum = bitMask & num;

        System.out.println("The number is : "+ newNum);


    }


    void setBit(){

        Scanner sc = new Scanner(System.in);
         
         //  SET BIT TO 1

        System.out.print("Enter the number to check : ");
        int num = sc.nextInt();
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();

        int bitMask = 1<<pos;
        int newNum = bitMask | num;

        System.out.println("The number is : "+ newNum);


    }

    void getBit(){
        Scanner sc = new Scanner(System.in);

                // GET BIT

        System.out.print("Enter the number to check : ");
        int n = sc.nextInt();
        System.out.print("Enter the position : ");
        int p = sc.nextInt();

        int bitMask = 1<<p;

        if ((bitMask & n ) == 1){
            System.out.println("The digit is 1");
        }
        else 
        System.out.println("The digit is 0");

    }
}
