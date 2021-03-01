package 设计模式.单例;

/**
 * 饿汉式
 * <p>
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 */
public class SingletonDemo3 {
    // 内部创建一个内部实例
    private static SingletonDemo3 instance = new SingletonDemo3();

    private SingletonDemo3() {
    }

    public static SingletonDemo3 getInstance() {
        return instance;
    }
    public static void main(String[] args) {
        SingletonDemo3 s = SingletonDemo3.getInstance();
        SingletonDemo3 s2 = SingletonDemo3.getInstance();
        System.out.println(s == s2);
        System.out.println("s2=" + s2.hashCode());
        System.out.println("s=" + s.hashCode());
    }

}
