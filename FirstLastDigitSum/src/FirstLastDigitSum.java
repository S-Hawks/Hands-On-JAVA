<<<<<<< HEAD
public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        int lastDigit = number % 10;
        while(number >= 10){
            number = number / 10;
        }
        sum = lastDigit + number;
        return sum;
    }
}
=======
public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        int lastDigit = number % 10;
        while(number >= 10){
            number = number / 10;
        }
        sum = lastDigit + number;
        return sum;
    }
}
>>>>>>> f9c6ddfae3aa337295e9914e13011f9ece86e6d4
