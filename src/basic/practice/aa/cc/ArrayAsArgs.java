package basic.practice.aa.cc;

public class ArrayAsArgs {
    public static void main(String[] args) {
        int[] array = {100, 200 ,45, 3254, 2345};
        int[] array2 = reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }
    public static int[] reverse(int[] array){
        int len = array.length;
        int[] arrayReverse = new int[len];
        for (int i = 0; i < len; i++) {
            arrayReverse[len - 1 - i] = array[i];
        }
        return arrayReverse;
    }
}
