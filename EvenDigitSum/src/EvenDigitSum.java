
public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int temp = 0;
        int sum = 0;
        while (number != 0){
            temp = number % 10;
            if(temp % 2 == 0){
                sum += temp;
            }
            number = number / 10;
        }
        return sum;
    }
}
