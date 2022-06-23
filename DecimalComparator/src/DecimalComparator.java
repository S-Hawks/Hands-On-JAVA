public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        num1 = num1 * 1000;
        num2 = num2 * 1000;

        int intNum1 = (int)num1;
        int intNum2 = (int)num2;
        if(intNum1 == intNum2){
            return true;
        }
        return false;
    }
}