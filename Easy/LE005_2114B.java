package Easy;

public class LE005_2114B {
    public int mostWordsFound(String[] sentences) {
        int maximum = 0;
        for(int i =  0 ; i < sentences.length ; i++){
            String[] words = sentences[i].split(" ");
            if(maximum < words.length){
                maximum = words.length;
            }
        }
        return maximum;
    }
}
