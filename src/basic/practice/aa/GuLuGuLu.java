package basic.practice.aa;

public class GuLuGuLu {
    public static void main(String[] args) {
        int[] array = {32, 3423, 5, 143, 1564, 342};
        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if(array[j] > array[j+1]){
                    int x = array[j];
                    array[j] = array[j+1];
                    array[j+1] = x;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
