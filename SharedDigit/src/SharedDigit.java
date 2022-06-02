<<<<<<< HEAD
public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if(firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99){
            return false;
        }
        int temp1 = firstNumber;
        while(temp1 != 0){
            int temp2 = secondNumber;
            while(temp2 !=0){
                if(temp2 % 10 == temp1 % 10 || temp2 /10 == temp1 % 10){
                    return true;
                }
                else
                    break;
            }
            temp1 = temp1 / 10;
        }
        return false;
    }
}
=======
public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if(firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99){
            return false;
        }
        int temp1 = firstNumber;
        while(temp1 != 0){
            int temp2 = secondNumber;
            while(temp2 !=0){
                if(temp2 % 10 == temp1 % 10 || temp2 /10 == temp1 % 10){
                    return true;
                }
                else
                    break;
            }
            temp1 = temp1 / 10;
        }
        return false;
    }
}
>>>>>>> f9c6ddfae3aa337295e9914e13011f9ece86e6d4
