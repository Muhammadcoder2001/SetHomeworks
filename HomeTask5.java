package SetHomework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HomeTask5 {

    public void CheckIsAvailableFirst(List nums1, List nums2){
        for (java.lang.Object  num : nums2){
            if(!nums1.contains(num) && nums2.contains(num)){
                System.out.print(num + " ");
            }
        }
    }

    public void CheckIsAvailableSecond(List nums1, List nums2){
        for (java.lang.Object  num : nums1){
            if(!nums2.contains(num) && nums1.contains(num)){
                System.out.print(num + " ");
            }
        }
    }

    public  void evenIndex(List list1, List list2){
     for (int i = 0; i < list1.size(); i++) {
        if (i % 2 !=0 && i > 0){
            System.out.print(list1.get(i) + " " + list2.get(i) + " ");
        }
     }
    }

    public static void main(String[] args) {

        HashSet <Integer> set = new HashSet<>();
        HashSet <Integer> set1 = new HashSet<>();

        set.add(23);
        set.add(22);
        set.add(34);
        set.add(55);

        set1.add(12);
        set1.add(22);
        set1.add(33);
        set1.add(55);

        ArrayList <Integer> nums1 = new ArrayList<>(set);
        ArrayList <Integer> nums2 = new ArrayList<>(set1);
        HomeTask5 home = new HomeTask5();
        System.out.print("First statement --> ");
        home.CheckIsAvailableSecond(nums1, nums2);
        System.out.print("\nSecond statement --> ");
        home.CheckIsAvailableFirst(nums1, nums2);
        System.out.println();
        System.out.println(nums1);
        System.out.println(nums2);
        home.evenIndex(nums1, nums2);

    }

}
