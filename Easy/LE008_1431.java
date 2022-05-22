package Easy;

import java.util.ArrayList;
public class LE008_1431 {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;
        ArrayList list  = kidsWithCandies(candies,extraCandies);
        for(Object b : list){
            System.out.println(b);
        }
    }
    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> returnList = new ArrayList<>();
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
           if(candies[i] > max){
               max = candies[i];
           }
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max){
                returnList.add(true);
            }else{
                returnList.add(false);
            }
        }
        return returnList;
    }
}
