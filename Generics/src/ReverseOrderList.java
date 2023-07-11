import java.util.ArrayList;
import java.util.List;

public class ReverseOrderList {
    public static < E > List < E > returnReverseList(List<E> listValueToReverse){
        List<E> reverseList = new ArrayList<>();
        for(int i = listValueToReverse.size()-1;  i >= 0; i--){
            reverseList.add(listValueToReverse.get(i));
        }
        return reverseList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        System.out.println(returnReverseList(numbers));
        List<String> colors = List.of("Red", "Green", "Orange");
        System.out.println(returnReverseList(colors));
    }
}
