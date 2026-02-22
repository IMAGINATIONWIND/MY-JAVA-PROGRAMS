package recursion2;


public class TowerOfHanoi{

    public static void TowerHanoi(int n , String source , String helper , String destination) {

        if (n == 1){
            System.out.println("Transfer disk "+n+" from source " + source +" to destination "+destination);
            return;
        }
        TowerHanoi(n-1, source,  destination, helper);

        System.out.println("Transfer disk "+n+" from source " + source +" to destination "+destination);

        TowerHanoi(n-1,  helper, source,destination);
    }
    public static void main(String[] args) {
        int n = 5;

        TowerHanoi(n, "SRC tower", "Helpr tower", "Destin8ion tower");

    }
}
