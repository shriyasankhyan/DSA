package Easy;
public class LE005_2114A {
    public static void main(String[] args) {
        String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (int i = 0; i < sentences.length; i++) {
            int sentenceLength = numberOfWords(sentences[i]);
            if(sentenceLength > maxWords){
                maxWords = sentenceLength;
            }
        }
        return maxWords;
    }
    public static int numberOfWords(String sentence){
        int words = 0;
        if(sentence.length() !=0){
            words = 1;
        }
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == ' '){
                words ++;
            }
        }
        return words;
    }
}
