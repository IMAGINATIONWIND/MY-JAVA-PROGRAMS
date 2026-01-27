
public class Strings {
    public static void main(String[] args) {
        StringBuilder bob = new StringBuilder("Goku");
        System.out.println("The string is : "+bob);

        //To locate the character at a specific index
        System.out.println(bob.charAt(1));

        //To set the specific character at an index,like replacing the char

        bob.setCharAt(2,'l');
        System.out.println(bob);

        //To insert a character at a specific index
        bob.insert(4,'l');
        System.out.println(bob);

        //Deleting a specific character or a range of characters
        bob.delete(2,4);//goes form n to m-1 so here starts at 2 & ends at 2 also
        System.out.println(bob);


        StringBuilder car = new StringBuilder("Saiyan");
        //We can also append in a string using string builder

        System.out.println("This is the original string : " + car);
        car.append("s");
        car.append(" powers ");
        System.out.println(car);

        //Also prints length

        System.out.println(car.length());

    }

}
