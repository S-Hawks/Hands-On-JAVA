<<<<<<< HEAD
public class DiagonalStar {
    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
        }
        else{
            for(int i = 0; i < number; i++){
                for(int j = 0; j < number; j++){
                    if(i == 0 || i == number -1 || j == 0 || j == number -1 || i == j || j == (number - (i + 1))){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

}
=======
public class DiagonalStar {
    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
        }
        else{
            for(int i = 0; i < number; i++){
                for(int j = 0; j < number; j++){
                    if(i == 0 || i == number -1 || j == 0 || j == number -1 || i == j || j == (number - (i + 1))){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

}
>>>>>>> f9c6ddfae3aa337295e9914e13011f9ece86e6d4
