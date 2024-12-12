public class Question_02 {
    private static String[] words;
    public static void main(String[]args){
        words = new String[] {"a", "b", "c", "d", "e", "f"};
        System.out.println(youExtra());
    }
    public static String youExtra(){
        /* missing implementation */

        // Answer A
        int maxIndex = 0;
        for(int k = 0; k < words.length; k++){
            if(words[k].compareTo(maxIndex) > 0){
                maxIndex = k;
            }
        }
        return words[maxIndex];

        //Answer B
        int maxIndex = 0;
        for(int k = 1; k <= words.length; k++){
            if(words[k].compareTo(words[maxIndex]) > 0){
                maxIndex = k;
            }
        }
        return words[maxIndex];

        // Answer C
        int maxIndex = 0;
        for(int k = 1; k < words.length; k++){
            if(words[k].compareTo(words[maxIndex]) > 0){
                maxIndex = k;
            }
        }
        return maxIndex;

        // Answer D
        String highKey = words[0];
        for(int k = 1; k < words.length; k++){
            if(words[k].compareTo(highKey) > 0){
                highKey = k;
            }
        }
        return highKey;

        // Answer E <----- Answer
        String highKey = words[0];
        for(int k = 1; k < words.length; k++){
            if(words[k].compareTo(highKey) > 0) {
                highKey = words[k];
            }
        }
        return highKey;
    }
}
