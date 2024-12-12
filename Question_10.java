public class Question_10 {
private int[] arr;
// precondition: arr.length > 0
public static void mystery()
{
    int s1 = 0;
    int s2 = 0;
    for(int k = 0; k < arr.length; k++){
        int num = arr[k];
        if((num>0) && (num % 2 == 0))
            s1 += num;
        else if(num < 0)
            s2 += num;
    }
    System.out.println(s1);
    System.out.println(s2);
}

    /*
     * The sum of all positive values in arr
     * The sum of all positive even values in arr
     * The sum of all positive odd values in arr
     * The sum of all values greater than 2 in arr
     * The sum of all values less than 2 in arr
     */
}
