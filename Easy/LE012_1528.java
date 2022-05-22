package Easy;

public class LE012_1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int [] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
    public static String restoreString(String s, int[] indices) {
        String shuffledString = "";
        Character[] chars = new Character[indices.length];
        for (int i = 0; i < indices.length; i++) {
           chars[indices[i]] = s.charAt(i);
        }
        for (int i = 0; i < indices.length; i++) {
            shuffledString += chars[i];
        }
        return shuffledString;
    }
}
