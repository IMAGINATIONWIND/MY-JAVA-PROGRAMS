package recursion2;

public class FirstAndLastOccurence{
    static int F = -1;
    static int T = -1;


    public static void occurence(int n , char a , String s){

        if(n == s.length()){
            System.out.println("The First index of "+a+" is "+F+" & the Last Index of "+a+" is "+T);
            return;
        }


        if(a == s.charAt(n)){
            if(F >= 0){
                T = n;
            }
            else
                F = n;
        }

        occurence(n+1, a , s);

    }

    public static void main(String[] args) {

        String s = "JAI MATA DI";
        char a = 'A';

        occurence(0, a, s);
    }

}