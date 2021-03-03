package basic;

public class SelectionSort {
    /**
     * 选择排序原理即是，遍历元素找到一个最小（或最大）的元素，
     * 把它放在第一个位置，然后再在剩余元素中找到最小（或最大）
     * 的元素，把它放在第二个位置，依次下去，完成排序
     * <p>
     * 第一趟排序： 原始数据：5  2  8  4  9  1
     * <p>
     * 最小数据1，把1放在首位，也就是1和5互换位置，
     * <p>
     * 排序结果：1  2  8  4  9  5
     * <p>
     * -------------------------------------------------------
     * <p>
     * 第二趟排序：
     * <p>
     * 第1以外的数据{2  8  4  9  5}进行比较，2最小，
     * <p>
     * 排序结果：1  2  8  4  9  5
     * <p>
     * -------------------------------------------------------
     * <p>
     * 第三趟排序：
     * <p>
     * 除1、2以外的数据{8  4  9  5}进行比较，4最小，8和4交换
     * <p>
     * 排序结果：1  2  4  8  9  5
     * <p>
     * -------------------------------------------------------
     * <p>
     * 第四趟排序：
     * <p>
     * 除第1、2、4以外的其他数据{8  9  5}进行比较，5最小，8和5交换
     * <p>
     * 排序结果：1  2  4  5  9  8
     * <p>
     * -------------------------------------------------------
     * <p>
     * 第五趟排序：
     * <p>
     * 除第1、2、4、5以外的其他数据{9  8}进行比较，8最小，8和9交换
     * <p>
     * 排序结果：1  2  4  5  8  9
     * <p>
     * -------------------------------------------------------
     * <p>
     * 注：每一趟排序获得最小数的方法：for循环进行比较，定义一个第三个变量temp，
     * 首先前两个数比较，把较小的数放在temp中，然后用temp再去跟剩下的数据比较，
     * 如果出现比temp小的数据，就用它代替temp中原有的数据。具体参照后面的代码示例，
     * 相信你在学排序之前已经学过for循环语句了，这样的话，这里理解起来就特别容易了。
     */

    public static void main(String[] args) {

        int[] arr = new int[]{5, 2, 8, 4, 9, 1};
        SelectionSort sort = new SelectionSort();
        sort.select(arr);
        //外层循环，控制选择的次数，数组长度为7，一共需要选择6次
//        System.out.println("交换之前：");
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
//        //选择排序的优化
//        for(int i = 0; i < arr.length - 1; i++) {// 做第i趟排序
//            int k = i;
//            for(int j = k + 1; j < arr.length; j++){// 选最小的记录
//                if(arr[j] < arr[k]){
//                    k = j; //记下目前找到的最小值所在的位置
//                }
//            }
//            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
//            if(i != k){  //交换a[i]和a[k]
//                int temp = arr[i];
//                arr[i] = arr[k];
//                arr[k] = temp;
//            }
//        }
//        System.out.println();
//        System.out.println("交换后：");
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
    }

    void select(int arr[]) {
        int maxNum;
        for (int i = 0; i < arr.length-1; i++) {
            maxNum = i; // 把最大的下标赋值给
            for (int j = i+1; j < arr.length; j++) {
                if (arr[maxNum] < arr[j]) {
                    maxNum = j; //小赋值给大的
                }
            }
            if (i != maxNum) {
                int temp = arr[i];
                arr[i] = arr[maxNum];
                arr[maxNum] = temp;
            }
        }
//---------------------------------------
//        for (int i = 0; i < arr.length - 1; i++) {
//            int minIndex = i; // 用来记录最小值的索引位置，默认值为i
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[minIndex]) {
//                    minIndex = j; // 遍历 i+1~length 的值，找到其中最小值的位置
//                }
//            }
//            // 交换当前索引 i 和最小值索引 minIndex 两处的值
//            if (i != minIndex) {
//                int temp = arr[i];
//                arr[i] = arr[minIndex];
//                arr[minIndex] = temp;
//            }
            // 执行完一次循环，当前索引 i 处的值为最小值，直到循环结束即可完成排序
//        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
