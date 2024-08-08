package SetHomework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HomeTask4 {

    public void toPrintAbsents(List list, List list1){
        for (java.lang.Object element : list){
            if(!list1.contains(element)){
                System.out.print(element + ", ");
            }
        }

        for (java.lang.Object  S : list1){
            if (!list.contains(S)){
                System.out.print(S + ", ");
            }
        }
        System.out.println("\b\b");

    }

    public static void main(String[] args) {

        HashSet <String> set = new HashSet<>();
        HashSet <String> set1 = new HashSet<>();
        set.add("White");
        set.add("Black");
        set.add("Yellow");
        set.add("Orange");
        set.add("Brown");

        set1.add("Red");
        set1.add("Brown");
        set1.add("Black");
        set1.add("White");
        set1.add("Gray");

        if(set.equals(set1)){
            System.out.println("Sets are equal");
        }else {
            System.out.println("Sets are not equal");
        }

        ArrayList <String> list = new ArrayList<>(set);
        ArrayList <String> list1 = new ArrayList<>(set1);
        for (String element : list){
            for (String str : list1){
                if (element == str){
                    System.out.print(element + ", ");
                }
            }

        }
        System.out.println("\b\b");
        HomeTask4 home = new HomeTask4();
        System.out.print("Absent elements are equal --> ");
        home.toPrintAbsents(list, list1);
        }
}
