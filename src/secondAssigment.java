import java.util.Arrays;
public class secondAssigment {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println("Поточний масив: " + Arrays.toString(arr));

        int[] result = shiftArrElToLeft(arr);
        System.out.println("Кінцевий масив: " + Arrays.toString(result));
    }
    public static int[] shiftArrElToLeft(int[] arr){
        if(arr.length == 0){
            System.out.println("This array is empty");
        }
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
        return arr;
    }
}
