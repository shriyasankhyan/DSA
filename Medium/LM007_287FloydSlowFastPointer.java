package Medium;

public class LM007_287FloydSlowFastPointer {
    public static int findDuplicate(int[] nums) {
//        Slow pointer and fast pointer will meet eventually if the system is cyclic and as one element is repeated,
//        it is cyclic.
//        As slow step is one step back and fast step is one step ahead. When they detect a cycle , they meet.
            int slow = nums[0];
            int fast = nums[nums[0]];

            while(slow != fast) {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }

//            Cycle has been detected here. Fast will move from one point to another and repeat itself again and again.
//        The index of 4 is 2 and the index of 2 is 4.

//        slow will come to 4 when it will be at 2. and vice versa. The point where it meets first is the answer.
            slow = 0;
            while(slow != fast) {
                slow = nums[slow];
                fast = nums[fast];
            }

            return slow;
    }

    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2,5,6,7,8,2};
        System.out.println(findDuplicate(nums));
    }
}
