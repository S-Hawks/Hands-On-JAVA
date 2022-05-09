public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int temp = number;
        if(number > 0){
            while(temp > 0){
                int lastDigit = temp % 10;
                reverse = (reverse * 10) + lastDigit;
                temp = temp / 10;
            }
            if(number == reverse)
            {
                return true;
            }
        }
        else
        {
            while(temp < 0){
                int lastDigit = number % 10;
                reverse = (reverse * 10) + lastDigit;
                temp = temp / 10;
            }
            if(number == reverse)
            {
                return true;
            }
        }
        return false;
    }

}
