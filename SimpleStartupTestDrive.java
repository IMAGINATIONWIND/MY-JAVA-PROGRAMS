package sinkTheShip;
import java.util.*;
import java.util.concurrent.*;
// import java.util.concurrent.ThreadLocalRandom;

class SimpleStartup{
    private int[] locationCells;
    private int numOfHits = 0;
    
    public String checkYourself(int cell){
        String result = "Miss";
        for(int i : locationCells){
            if (cell == i){
                result = "Hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = "Kill";
        }
        // System.out.print(result);
        return result;
    }

    void setLocationCells(int[] loc){
        locationCells = loc;
    }
}

public class SimpleStartupTestDrive {
    
    public static void main(String[] args) {

        int numOfGuesses = 0 ;

        try(Scanner sc = new Scanner(System.in)){

        SimpleStartup obj1 = new SimpleStartup();

        int randm = ThreadLocalRandom.current().nextInt(0 , 5);

        int[] array1 = {randm,randm+1,randm+2};
        obj1.setLocationCells(array1);

        String result = "Miss";
        

        while(!result.equals("Kill")){
        System.out.print("Kindly enter your guess between 0 and 9 both inclusive : ");
        int guess = sc.nextInt();

        result = obj1.checkYourself(guess);

        System.out.println(result);
        numOfGuesses++;
            }
        System.out.println("You took "+numOfGuesses+" guesses");
        }
    }
}