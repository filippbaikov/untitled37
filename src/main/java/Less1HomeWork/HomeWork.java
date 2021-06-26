package Less1HomeWork;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d"};

        System.out.println( Arrays.toString(arr));
        changeElements(arr, 0, 1);
        System.out.println(Arrays.toString(arr));

    }
    private static <T> void changeElements(T[] array, int a, int b) {
        T x = array[a];
        array[a] = array[b];
        array[b] = x;
    }
}
