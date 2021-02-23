package basic;
//求100 -1000 之内的水仙花树
public class isPro3 {
    public static void main(String[] args) {

        for(int i =100;i<1000;i++){
            getNum(i);
        }
    }

    public  static void getNum(int num){
        int a=(num%10)%10;
        int b=(num/10)%10;
        int c=num/100;

        if(a*a*a+b*b*b+c*c*c ==num){
          System.out.println(num);
        }

    }

}
