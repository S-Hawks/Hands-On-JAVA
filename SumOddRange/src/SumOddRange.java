<<<<<<< HEAD
public class SumOddRange {
    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }
        else if(number % 2 != 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static int sumOdd(int start, int end){
        if((start < 0) || (end < 0) || (end < start)){
            return -1;
        }
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}
=======
public class SumOddRange {
    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }
        else if(number % 2 != 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static int sumOdd(int start, int end){
        if((start < 0) || (end < 0) || (end < start)){
            return -1;
        }
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}
>>>>>>> f9c6ddfae3aa337295e9914e13011f9ece86e6d4
