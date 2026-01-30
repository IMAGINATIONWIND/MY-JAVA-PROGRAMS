
public class bubbleSort {
    
    public static void printArray(int[] arr) {
        for (int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int[] arr = {23,45,2,87,234,8,5};

        //bubble sorting
        boolean swap = false;
        for (int i = 0 ; i < arr.length-1;i++){
            System.out.println("Swapping the "+(i+1)+"th"+" largest value");
            for(int j = 0 ; j < arr.length-i-1 ; j++){
                
                if (arr[j] > arr[j+1]){

                    //swapping

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swap = true;
                }
            }
            if(!swap)
                break;
            printArray(arr);
        }
    }
}
