import java.util.List;

public class ReturnTargetElement {
    public static <E> Integer returnElement(List<E> elementArray, E element){
        for(int value = 0; value <= elementArray.size(); value++){
            if(element.equals(value)){
                return elementArray.indexOf(value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6);
        System.out.println(returnElement(integers, 4));
    }
}
