package Easy;

public class LE004_2011C {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].charAt(1) == '+'){
                ans++;
            }else{
                ans--;
            }
        }
        return ans;
    }
}
