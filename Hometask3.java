package SetHomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Hometask3 {

    public static void main(String[] args) {

        HashSet <Integer> set = new HashSet<>();

        set.add(12);
        set.add(47);
        set.add(106);
        set.add(354);
        set.add(98);

        HashSet <Integer> set1 = new HashSet<>(set);
        System.out.println(set1);

        ArrayList <Integer> list = new ArrayList<>(set1);

        for (int i = 0; i < list.size(); i++){
            if (i % 2 == 0 && i > 0){
                System.out.println(list.get(i));
            }
        }

    }
}
