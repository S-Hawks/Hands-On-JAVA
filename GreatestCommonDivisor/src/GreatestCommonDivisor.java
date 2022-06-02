public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int minimum = ((first + second) - Math.abs(first - second))/ 2;
//        System.out.println("Minimum of the number = " + minimum);
        int gcd = 0;
        for(int i = 1; i <= minimum; i++)
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        return gcd;
    }
}
