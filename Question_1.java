public class Question_1 {
    public static void main(String[]args){
        int[] nums = {2, 5, 6, 8};

        System.out.println();
        System.out.println(allEven(nums));
    }
    public static boolean allEven(int[]arr) {
        boolean isEven = false;

        for(int k = 0; k < arr.length; k++) {
            // Answer A
            if(arr[k] % 2 != 0)
                isEven = false;
            else
                isEven = true;            
        }
        return isEven;
    }

    /* The key to this working 
     * isEven default true with arr[k] == 0) generating false
     * or...
     * isEven default false with arr[k] != 0) generating false
     * orr...
     * isEven default false 
    */
}