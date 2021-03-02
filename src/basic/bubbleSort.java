package basic;

/**
 * 冒泡
 */
public class bubbleSort {
    public static void main(String[] args) {


        int a[] = {10, 9, 2, 5, 3, 7, 5, 18};

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
