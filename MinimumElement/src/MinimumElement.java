import java.util.Scanner;

public class MinimumElement {
    //Need to create the execution class to run the program.
    private static int readInteger() {
        System.out.println("How many clements?: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }
    private static int[] readElements ( int number){
        int[] array = new int[number];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }
    private static int findMin ( int[] array){
        int min = array[0];
        for (int i : array) {   //foreach loop: for ech element of 'i' in array.
            if ( i < min) {
                min = i;
            }
        }
        return min;
    }
}

