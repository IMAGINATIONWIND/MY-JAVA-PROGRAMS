package recursion2;
public class subsequences {
    
    public static void seq(String str , String newstr , int indx){

        if ( indx == str.length()){
            System.out.println(newstr);
            return;
        }
        char Currch = str.charAt(indx);
        // System.out.print("Do you want : "+ "'"+Currch + "'"+" Select Y for YES & N for NO :");
        // char ans = new Scanner(System.in).next().charAt(0);

        

        // YES
        // if(ans == 'Y'){
            seq(str,newstr + Currch , indx+1);
            // System.out.println(newstr+Currch);
        // }
            // NO
            // if( ans == 'N'){
            seq(str, newstr , indx+1);
                // System.out.println(newstr);
            // }
    }   
    public static void main(String[] args) {

        String str = "abcd";
        seq(str, "", 0);
    }
}
