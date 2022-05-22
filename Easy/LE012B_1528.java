package Easy;

public class LE012B_1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int [] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
    public static String restoreString(String s, int[] indices) {
        String shuffledString = "";
        for (int i = 0; i < indices.length; i++) {
           shuffledString += s.charAt(indexOfChar(indices,i));
        }
        return shuffledString;
    }
    public static int indexOfChar(int [] indices , int index){
        for (int i = 0; i < indices.length; i++) {
            if(indices[i] == index){
                return i;
            }
        }
        return -1;
    }
}
