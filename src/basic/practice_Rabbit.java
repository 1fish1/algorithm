package basic;

import java.util.Scanner;

/**
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
 * 问每个月的兔子对数为多少？  1 1 1  2 3 4  6
 */

public class practice_Rabbit {
    public static void main(String[] args) {
//        1 1  ,2  ,3 ,4 ,5, 6, 7,8,9,10 月份
//         1   1   2  3  5  8 13   6  8 10  第一只兔子
//              0  1   2  3               第二只兔子
//                     1                第三只兔子
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("请输入月份查看Rabbit 的数目");
            int month = input.nextInt();
            System.out.println(getCount(month));
        }
}
// 使用迭代方法实现。
    private  static  int getCount(int n){
        if(n==1 || n==2)
            return 1;
        else
            return getCount(n-1)+getCount(n-2);

    }

}
