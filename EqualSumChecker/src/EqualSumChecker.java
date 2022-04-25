public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int num3){
        int total = num1 + num2;
        if(total == num3){
            return true;
        }
        return false;
    }
}
