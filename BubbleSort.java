package arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {10, 4, 3, 55, 2, 7, 2, 1};
        int temp = 0;
       // int n = a.length; // store the length of the array

        for (int i = 0; i < a.length - 1; i++) { // outer loop
            for (int j = 0; j < a.length - i - 1; j++) { // inner loop
                if (a[j] > a[j + 1]) { // swap if current element is greater than next element
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
