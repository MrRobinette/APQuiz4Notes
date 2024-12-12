public class Question_06 {
    private static int[] numbers;
    public static void main(String[]args){
        numbers = new int[] {25, 44, 31, 67, 54, 23, 15};
        mystery(3);
    }
    public static void mystery(int x){
        for(int k = 1; k < numbers.length; k = k + x){
            numbers[k] = numbers[k-1] + x;
        }


        for(int val : numbers){
            System.out.print( val + " ");
        }
    }

}
