public class Question_08 {
    public static void main(String[]args){
        int[] nums = {};

        // Answer I
        int counter = 0;
        int i = -1;
        while(i <= nums.length - 2){
            i++;
            if(nums[i] < 0){
                counter++;
            }
        }
        // Answer II
        int counter = 0;
        for(int i = 1; 1 < nums.length; i++){
            if(nums[i] < 0){
                counter++;
            }
        }

        // Answer III
        int counter = 0;
        for(int i : nums){
            if(nums[i] < 0){
                counter++;
            }
        }
    }
}
