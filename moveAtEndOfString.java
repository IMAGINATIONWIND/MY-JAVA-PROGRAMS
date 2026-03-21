package recursion2;

import java.util.*;

public class moveAtEndOfString {
    
    public static void move(String str , int indx , int count , String newstr){
        if(indx == str.length()){
            for( int i = 0 ; i <= count ; i++){
                newstr = newstr + 'x';
            }
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(indx);
        if (currChar == 'x'){
            count++;
        } 
        else{
            newstr = newstr + currChar;
        }
        move(str, indx+1, count, newstr);
        return;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.print("Enter the string : ");

            String s;

            s = sc.next();
            move(s, 0, 0, "");
        }
    }
}
