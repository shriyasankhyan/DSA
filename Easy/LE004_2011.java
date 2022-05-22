package Easy;

public class LE004_2011 {
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            switch(operations[i]){
                case "++X": x+=1; break;
                case "X++": x+=1; break;
                case "--X": x-=1; break;
                case "X--": x-=1; break;
            }
        }
        return x;
    }

    public static void main(String[] args) {
       String [] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
}
