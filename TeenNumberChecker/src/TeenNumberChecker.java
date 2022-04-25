public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3){
        if((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)){
            return true;
        }
        return false;
    }
    public static boolean isTeen(int teen){
        if(teen >= 13 && teen <= 19){
            return true;
        }
        return false;
    }
}
//public class TeenNumberChecker{
//    public static boolean hasTeen(int age1, int age2, int age3){
//        if(isTeen(age1) || isTeen(age2) || isTeen(age3)){
//            return true;
//        }
//        return false;
//    }
//
//    public static boolean isTeen(int age){
//        if(age >=13 && age <= 19){
//            return true;
//        }
//        return false;
//    }
//}