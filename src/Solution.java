import java.util.*;

public class Solution {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> commonString = new ArrayList<>();
        List<Integer> commonIndex = new ArrayList<>();
        Map<String,Integer> map = new TreeMap<>();
        for(String s:list1){
            if(findCommonString(s,list2)){
                commonString.add(s);
                int index = getIndex(s,list1) + getIndex(s,list2);
                commonIndex.add(index);
                map.put(s,index);
            }
        }
        if(commonString.size()==1){
            return commonString.toArray(new String[0]);
        }
        List<Integer> minIndex = commonIndex.stream().sorted().toList();
        int  min = minIndex.get(0);
        map.forEach((key,value)->{
            if(value!=min) {
                commonString.remove(key);
            }
        });
        return commonString.toArray(new String[0]);
    }
    
    public static boolean findCommonString(String s, String[] list){
        return Arrays.stream(list).anyMatch(string->string.equalsIgnoreCase(s));
    }
    public static int getIndex(String s, String[] list){
        return Arrays.stream(list).toList().indexOf(s);
    }

    public static void main(String[] args) {
        String[] list1 = {"Shogun","Piatti","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String[] result = findRestaurant(list1,list2);
//        for(String s:result){
//            System.out.println(s);
//        }
    }
}
