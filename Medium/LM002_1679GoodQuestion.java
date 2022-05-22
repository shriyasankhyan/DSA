package Medium;

import java.util.HashMap;

public class LM002_1679GoodQuestion {
    public static void main(String[] args) {
        int [] nums = {2,3,4,5,3,1,5,2};
        int target = 5;
        System.out.println(maxOperations(nums,target));
    }
    public static int maxOperations(int[] nums, int k) {
        int maxOp = 0;
//        <Integer , integer> <num[i], frequency>
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
//            If map contains a key (meaning a number is present in hashmap) such that k-nums(i)(as nums[i]+ nums[j]=k)
//            and value of k-nums[i] > 0 meaning , there is a number present with that key.
            if(map.containsKey(k-nums[i])&&map.get(k-nums[i])>0){
                maxOp++;
//                For key k-nums[i], decreasing the value of key as we are using it and incrementing the count.
                map.put(k-nums[i],map.get(k-nums[i])-1);
            }else{
//                Putting nums[i] to the hashmap. If it is present , then adding 1 to it or if it is not present,
//                since default value is 0 , adding 1 to it.
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        return maxOp;
    }
}
