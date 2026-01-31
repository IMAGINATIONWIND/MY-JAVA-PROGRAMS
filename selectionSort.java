package sortingAlgos;

public class selectionSort {

        public static void printArray(int[] arr) {
        for (int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {

        int[] ara = {34,435,3,345,43,45,54,56};

        
        for(int i = 0 ; i < ara.length-1 ; i++ ){
            int smallest = i ;
            for(int j = i ; j < ara.length ; j++){

                // Comparing values

                if(ara[smallest] > ara[j]){
                    smallest = j;
                }
            }
            // Swap code 

            int temp = ara[i];
            ara[i] = ara[smallest];
            ara[smallest] = temp;  
            System.out.println("This is the "+(i+1)+"th"+" iteration");
            printArray(ara);
        }
    }
}
