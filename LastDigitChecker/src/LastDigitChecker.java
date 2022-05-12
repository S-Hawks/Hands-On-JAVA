public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(!isValid(num1) || !isValid(num2) || !isValid(num3)){
            return false;
        }
        int lastDigit = num3 % 10;
       do
        {
            if(num1 % 10 == lastDigit || num2 % 10 == lastDigit){
                return true;
            }
            lastDigit = lastDigit / 10;
        }
       while(lastDigit != 0);
        return false;
    }
    public static boolean isValid(int number){
        if(number < 10 || number > 1000 ){
            return false;
        }
        return true;
    }
}
