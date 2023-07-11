import java.util.Scanner;

public class ArrayCompare {
    public static <E> boolean compareArray(E[] arr1, E[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i = 0; i < arr1.length; i++){
            if(!arr1[i].equals(arr2[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {1,2,3,4};
        System.out.println(compareArray(arr1, arr2));
        String[] stringsArray1 = {"hello", "world"};
        String[] stringsArray2 = {"hello", "world"};
        System.out.println(compareArray(stringsArray1, stringsArray2));
    }
}
