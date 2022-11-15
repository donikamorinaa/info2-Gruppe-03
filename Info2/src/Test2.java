import java.util.Arrays;

public class Test2 {

    public static void main(String[] args){
       /*old way to initialize array
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(Arrays.toString(numbers));
        */

        //new way to initialize arrays
        int[] numbers = {2, 3, 5, 1, 4};
        //System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


    }

}
