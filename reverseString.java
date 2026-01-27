public class reverseString {
    public static void main(String[] args) {
      //My solution
        StringBuilder given1 = new StringBuilder("Hello World");
        StringBuilder made1 = new StringBuilder("");

        for(int i = 1; i <= given1.length() ; i++ ){
        char now = given1.charAt(given1.length()-i);
        made1.append(now);
    }
    System.out.println(made1);
    


//apna college solution
for(int i = 0 ; i < given1.length()/2 ; i++){
    int front = i;
    int back = given1.length()-i-1;

    char frontChar = given1.charAt(front);
    char backChar = given1.charAt(back);

    given1.setCharAt(front,backChar);
    given1.setCharAt(back,frontChar);

}
System.out.println(given1);//More space & time efficient
}
}
