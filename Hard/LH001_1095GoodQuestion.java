package Hard;
interface MountainArray {
    int [] arr = {0,5,3,1};
   public static int get(int index) {
       return arr[index];
   }
    public static int length() {
       return arr.length;
    }
 }
public class LH001_1095GoodQuestion {
    public static void main(String[] args) {
        System.out.println(findInMountainArray(1));
    }
    public static int findInMountainArray(int target) {
//         In this question , you are not able to access mountainArr outside this method.
        int start = 0;
        int end = MountainArray.length()-1;
        while(start < end){
            int mid = start +(end-start)/2;
            if(MountainArray.get(mid) > MountainArray.get(mid+1)){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        int peakIndex = start;
        start = 0;
        end = peakIndex;
        int index = -1;
        while(start <= end){
            int mid = start +(end-start)/2;
            if(MountainArray.get(mid) == target){
                index = mid;
                break;
            }
            else if(MountainArray.get(mid) < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        if(index == -1){
            start = peakIndex +1;
            end = MountainArray.length() -1;
            while(start <= end){
                int mid = start +(end-start)/2;
                if(MountainArray.get(mid) == target){
                    index = mid;
                    break;
                }
                else if(MountainArray.get(mid) > target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return index;
    }
}
