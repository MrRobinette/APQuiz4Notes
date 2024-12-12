public class Question_07 {

    public static void main(String[]args){
        int[] nums = {5, 8, 9, 7, 0, 2, 1};
        System.out.println(mystery(nums));
    }

    public static int mystery(int[] arr){
        int x = 0;
        for(int r = 0; r < arr.length; r = r + 2)
            x = x + arr[r];
        
        return x;
    }
}
