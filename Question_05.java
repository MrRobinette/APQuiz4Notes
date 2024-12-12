public class Question_05 {
    public static void main(String[]args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        for(int k = 0; k < arr.length - 1; k++){
            arr[k] = arr[k+1];
                
        }


        for(int s : arr)
            System.out.print(s + " ");
    }
}
