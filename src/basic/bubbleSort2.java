package basic;

import java.util.Arrays;

public class bubbleSort2 {

    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5,47,15,36,26,27,2,46,4,19,50,48};

        for(int i=0;i<arr.length;i++){

            //设置锚点,如果没有进行比较直接输出
            boolean flag=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
        