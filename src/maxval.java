public class maxval {
    public static void main(String[] args) {
        int[] arr = {1,4,5,68,123,5,12};
        System.out.println(max(arr));
    };
    static int max(int[] arr) {
        int max = arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max = arr[i];

            }
        }
        return max;
    }
}
