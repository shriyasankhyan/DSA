package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class LE016_350 {
    public static void main(String[] args) {
        int [] nums1 = {1,2,2,1};
        int [] nums2 = {2,2};
        int [] nums = intersect(nums1,nums2);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i< nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int [] ans = new int[list.size()];
        for (int k = 0; k < ans.length; k++) {
            ans[k] = list.get(k);
        }
        return ans;
    }

}
