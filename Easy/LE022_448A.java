package Easy;
import java.util.ArrayList;
import java.util.List;
public class LE022_448A {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int [] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] <= nums.length){
                temp[nums[i]-1] ++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] == 0){
                list.add(i+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int [] nums = {1,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
