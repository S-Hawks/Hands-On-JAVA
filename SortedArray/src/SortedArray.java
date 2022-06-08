import java.util.Scanner;

public class SortedArray {
    public int[] getInteger(int number){  //Taking number from user and store it in myInteger in main() class.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int[] array = new int[number];
        for(int i = 0; i < number; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public int[] sortedArray(int[] array){ // get array argument from Main() class which is store in myInteger.
        int temp;
        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++ ){
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        printArray(array);
        return array;
    }
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i +  " contents " + array[i]);
        }
    }
}
