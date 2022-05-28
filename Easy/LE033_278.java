package Easy;

public class LE033_278 {
    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start <= end){
            int mid = start +(end-start)/2;
//            We will get first good version from this ,so we need 1 more index from that.
//            If version is bad , we will set end = mid-1. Eventually , we are moving towards last stable version.
            if(isBadVersion(mid)){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    public static boolean isBadVersion(int n){
        int bad = 4;
        if(n>=bad){
            return true;
        }
            return false;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(firstBadVersion(5));
    }
}
