package sortingAlgos;

public class insertionSort {
    public static void main(String[] args) {
        
        int[] aray = {3565,7,54645,2,2245,64,433,0};

        for(int i = 1 ; i < aray.length ; i++){
            int current = aray[i];

            int j = i-1;

            while(j>= 0 && current < aray[j]){
                aray[j+1] = aray[j];
                j--;
            }

            //placement
            aray[j+1] = current;

        }
        selectionSort.printArray(aray);
    }
}
