package SetHomework;

import java.util.*;

public class HomeTask1 {

    public static void main(String[] args) {

        HashSet<Integer>  numbers = new HashSet<>();

        numbers.add(12);
        numbers.add(132);
        numbers.add(124);
        numbers.add(212);
        numbers.add(1122);
        numbers.add(4125);

        System.out.println(numbers);

        Iterator iterator = numbers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        List<Integer> list = new ArrayList<>(numbers);

        Collections.reverse(list);
        System.out.println(list);



    }
}
