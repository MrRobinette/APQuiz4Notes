public class Question_03 {
    public static void main(String[]args){
        int[] arr = {4, 2, 9, 7, 3};
        for(int k : arr){
            k = k + 30;
            System.out.print(k + " ");
        }
        for(int k : arr)
            System.out.print(k + " ");
    }
}
