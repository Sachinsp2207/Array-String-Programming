package arrays;

import java.util.Iterator;


public class ZigZag {
    public static void main(String[] args) {
        char[] arr1 = {'a', 'b', 'c','d','z'};
        char[] arr2 = {'e', 'f', 'g'};
        int length = arr1.length + arr2.length;
        char[] result = new char[length];
        int i = 0;
        int j = 0;
        boolean flag = true;
        for (int k = 0; k < length; k++) {
            if (flag) {
                if (i < arr1.length) {
                    result[k] = arr1[i++];
                } else {
                    result[k] = arr2[j++];
                }
            } else {
                if (j < arr2.length) {
                    result[k] = arr2[j++];
                } else {
                    result[k] = arr1[i++];
                }
            }
            flag = !flag;
        }
        System.out.println(new String(result));
    }
}
