package Easy;

public class LE006_1470B {
    public int[] shuffle(int[] nums, int n) {
        int [] temp = new int [nums.length];
        int i = 0;
        int j = temp.length/2;
        int k = 0;
        while(k < temp.length){
            temp[k] = nums[i];
            temp[k+1] = nums[j];
            k+=2;
            i++;
            j++;
        }
        return temp;
    }
}
