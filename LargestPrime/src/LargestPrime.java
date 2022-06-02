
public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number < 0){
            return -1;
        }
        for(int i = number/2; i != 0; i--){
            if(isPrime(i) && number % i == 0){
                return i;
            }
        }
        return -1;
    }

    public static boolean isPrime(int number){
        if(number % 2 == 0){
            return false;
        }
        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}

//Another solution using prime factorization
//public class LargestPrime {
//    public static int getLargestPrime(int number) {
//        if (number < 2) {
//            return -1;
//        }
//        for (int i = number/2; i > 1; i--) {
//            if ((number % i) == 0) {
//                number = i;
//            }
//        }
//        return number;
//    }
//}
