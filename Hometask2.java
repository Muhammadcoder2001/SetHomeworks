package SetHomework;

import java.util.HashSet;

public class Hometask2 {

    public static void main(String[] args) {

        HashSet<String> colors = new HashSet<>();

        colors.add("White");
        colors.add("Brown");
        colors.add("Orange");
        colors.add("Black");
        colors.add("Red");

        System.out.println("Size of Hashset " + colors.size());
        if(colors.isEmpty()){
            System.out.println("Set is empty");
        }else{
            System.out.println("Set is not empty");
        }
        colors.clear();
        if (colors.isEmpty()){
            System.out.println("Set is empty");

        } else{
            System.out.println("Set is not empty");
        }
    }
}
