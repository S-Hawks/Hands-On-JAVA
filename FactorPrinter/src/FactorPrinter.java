<<<<<<< HEAD
public class FactorPrinter {
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        for(int i = 1; i <= number; i++)
        {
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }
=======
public class FactorPrinter {
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        for(int i = 1; i <= number; i++)
        {
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }
>>>>>>> f9c6ddfae3aa337295e9914e13011f9ece86e6d4
}