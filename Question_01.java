public class Question_01 {
    public static void main(String[]args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(allEven(arr));
    }

    public static boolean allEven(int[]arr){
        System.out.println("Form1");
        boolean isEven = true;/* expression */
        for(int k = 0; k < arr.length; k++){
            /* loop body */
            // Answer A (false)
        if((arr[k] % 2) == 0)
            isEven = true;

                    // // Answer B (false)
        if((arr[k] % 2) != 0)
            isEven = false;
        else
            isEven = true;

                    // Answer C (true) <--- Answer
        if((arr[k] % 2) != 0)
            isEven = false;
                    
                    // Answer D (true)
        if((arr[k] % 2) != 0)
            isEven = false;
        else
            isEven = true;

                    // Answer E (true)
        if((arr[k] % 2) == 0)
            isEven = false;
        else
            isEven = true;
        }
        return isEven;
    }
}