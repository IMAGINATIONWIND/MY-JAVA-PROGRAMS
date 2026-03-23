package recursion;

public class rmduplicates {

    
    public static void rm(String givenstr , String newstr , int i){
        if( i == givenstr.length()){
            System.out.println("the final string is : "+ newstr);
            return;
        }
        if (newstr.indexOf(givenstr.charAt(i)) == -1){
            
            rm(givenstr, newstr + givenstr.charAt(i), i+1);

        }
        else{
            rm(givenstr, newstr , i+1);
        }
    }

    public static void main(String[] args) {
        String givenstr = "aabbccdd";

        rm(givenstr, "", 0);
    }
}

//A BETTER APPROACH 

// public class Recursion2 {
// public static String removeDuplicates(String str, int idx, boolean present[]) {
// if(idx == str.length()) {
// return "";
// }
// char curr = str.charAt(idx);
// if(present[curr-'a']) {
// return removeDuplicates(str, idx+1, present);
// } else {
// present[curr-'a'] = true;
// return curr + removeDuplicates(str, idx+1, present);
// }
// }
// public static void main(String args[]) {
// String str = "abcadbcefghabi";
// boolean present[] = new boolean[str.length()];
// System.out.println(removeDuplicates(str, 0, present));
// }
// }