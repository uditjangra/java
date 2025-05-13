import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,2,32,5,3,12,3,};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int[] arr) {
        int start;
        int end  = arr.length-1;
        for(start=0;start<arr.length/2;start++) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
        }
    }
}
