package basic;

public class StringPool {
    public static void main(String[] args) {

        String str1 = new StringBuilder("58").append("tongcheng").toString();
        System.out.println(str1);
        System.out.println(str1.intern());
        System.out.println(str1 ==str1.intern());

        System.out.println();

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2);
        System.out.println(str2.intern());
        System.out.println(str2 ==str2.intern());
        System.out.println();

        String str3 = new StringBuilder("mei").append("tuan").toString();
        System.out.println(str3);
        System.out.println(str3.intern());
        System.out.println(str3 ==str3.intern());


        System.out.println(tableSizeFor(5));
        System.out.println(tableSizeFor(2 << 3));
//        1000 1111 1+2+4+8 = 15
    }
    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;

        return n + 1;
    }
}
