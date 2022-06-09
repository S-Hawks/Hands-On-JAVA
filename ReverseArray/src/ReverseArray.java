import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1,3, 4, 5, 8, 9, 10};
        System.out.println("Array= " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array= " + Arrays.toString(array));
    }
    private static void reverse(int[] number){
        System.out.println("Array = " + Arrays.toString(number));
        int temp;
        for(int i = 0, j = number.length -1 ; i <= number.length/2; i++, j--){
            temp = number[i];
            number[i] = number[j];
            number[j] = temp;
        }
        System.out.println("Reversed Array = " + Arrays.toString(number));
    }
}
