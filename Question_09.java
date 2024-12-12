public class Question_09 {
    public static void main(String[]args){
        System.out.println(mystery(4));
    }
    public static int mystery(int value) {
        int sum = 0;
        int [] arr = {1, 4, 2, 5, 10, 3, 6, 4};

        for(int item : arr){
            if(item > value){
                sum += item;
            }
        }
        return sum;
    }
}
