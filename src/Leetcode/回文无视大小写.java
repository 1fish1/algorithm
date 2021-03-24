package Leetcode;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 */
public class 回文无视大小写 {
    public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama".toLowerCase().replaceAll(",", "").replaceAll(" ", "").replaceAll(":", "");
        String rs = new StringBuilder(s).reverse().toString().toLowerCase().replaceAll(",", "").replaceAll(" ", "").replaceAll(":", "");
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(rs);
        System.out.println(rs.equals(s));

//        String s = "A man, a plan, a canal: Panama";
//		s = s.toLowerCase();
//		String[] ss = s.split("[^a-z0-9]");
//		for(String t : ss){
//			System.out.println(t);
//		}
        System.out.println(s.split("[^a-z0-9]").toString());
        回文无视大小写 test = new 回文无视大小写();
        System.out.println(test.isPalindrome(s));

    }

    public boolean isPalindrome(String s) {
        if(null == s){
            return false;
        }
        s=s.toLowerCase();
//		 if(!s.matches("[^a-z0-9]")){
//			 return false;
//		 }
        String[] ss = s.split("[^a-z0-9]");
        System.out.println(ss.length);
        System.out.println(ss.toString());
        StringBuilder buffer = new StringBuilder();
        for(String t : ss){
            buffer.append(t);
        }
        s = buffer.toString();
        System.out.println(s.toString());
        String rs = buffer.reverse().toString();
//	     System.out.println(rs);
        return rs.equals(s);
    }

}
