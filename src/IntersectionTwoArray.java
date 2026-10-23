import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionTwoArray {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> array = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        Arrays.stream(nums1).forEach(n->arr1.add(n));
        Arrays.stream(nums2).forEach(n->arr2.add(n));
        for(int i:arr1){
            if(arr2.contains(i)){
                arr2.remove(Integer.valueOf(i));
                array.add(i);
            }
            
        }
        int[] result = new int[0];
        result = array.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        for(int i:intersect(nums1,nums2)){
            System.out.println(i);
        }
    }
}
