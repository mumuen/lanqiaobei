package game;

import java.util.Arrays;

public class SystemTest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        System.arraycopy(arr,1,arr,2,8);
        System.out.println(Arrays.toString(arr));
        int[] ints = Arrays.copyOf(arr, 11);
        System.out.println(Arrays.toString(ints));
    }

}
