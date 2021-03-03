package basic;

import java.util.Arrays;

public class bubbleSort2 {

    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int ar[] = {1, 2, 3, 4, 5};
        bubbleSort2 sort2 = new bubbleSort2();
        sort2.sortTwo(arr);
        sort2.sortOne(arr);
    }

    void sortTwo(int arr[]) {
        System.out.println("第二个冒泡排序");
        for (int i = 0; i < arr.length; i++) {

            //设置锚点,如果没有进行比较直接输出
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    void sortOne(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int temp = 0;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("输入排序后的数组");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "--");
        }
    }
    // 冒泡排序是第一次是把最大的排到最上面
    /**
     * 9 2 5 3 7 5 10 18
     * 2 5 3 7 5 9 10 18
     *
     */

}
        