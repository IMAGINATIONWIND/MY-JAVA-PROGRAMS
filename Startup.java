package sinkTheShip;

import java.util.*;
import java.util.concurrent.*;

class betterStartup{
    private ArrayList<Integer> locationCells;
    private int numOfHits = 0;
    
    public String checkYourself(int cell){
        String result = "Miss";
        for(int i : locationCells){
            if (cell == i){
                result = "Hit";
                numOfHits++;
                locationCells.remove((Integer) cell);
                break;
            }
            // else{System.out.println("That part of the ship has already sunk");}
        }
        if (locationCells.isEmpty() == true){
            result = "Kill";
        }
        // System.out.print(result);
        return result;
    }

    void setLocationCells(ArrayList<Integer> loc_array){
        locationCells = loc_array;
    }
}

public class Startup {
    public static void main(String[] args) {

         int numOfGuesses = 0 ;

        try(Scanner sc = new Scanner(System.in)){

        betterStartup obj1 = new betterStartup();

        int randm = ThreadLocalRandom.current().nextInt(0 , 5);

        ArrayList<Integer> array1 = new ArrayList<Integer>();
        for(int i1 = 0 ; i1 <3 ; i1++){
            array1.add(randm+i1);
        }
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
