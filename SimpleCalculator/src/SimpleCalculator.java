<<<<<<< HEAD
public class SimpleCalculator {
    private double firstNumber;
    private  double secondNumber;

    public void setFirstNumber(double number){
        this.firstNumber = number;
    }
    public void setSecondNumber(double number){
        this.secondNumber = number;
    }

    public double getFirstNumber(){
        return  this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }
    public double getMultiplicationResult(){
     return this.firstNumber * this.secondNumber;
    }
    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }
    public double getDivisionResult(){
        return (secondNumber == 0) ? 0: firstNumber/secondNumber; //ternary

    }
}
=======
public class SimpleCalculator {
    private double firstNumber;
    private  double secondNumber;

    public void setFirstNumber(double number){
        this.firstNumber = number;
    }
    public void setSecondNumber(double number){
        this.secondNumber = number;
    }

    public double getFirstNumber(){
        return  this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }
    public double getMultiplicationResult(){
     return this.firstNumber * this.secondNumber;
    }
    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }
    public double getDivisionResult(){
        return (secondNumber == 0) ? 0: firstNumber/secondNumber; //ternary

    }
}
>>>>>>> f9c6ddfae3aa337295e9914e13011f9ece86e6d4
