package 设计模式.单例;

/**
 * 懒汉式，线程安全
 * 优点：第一次调用才初始化，避免内存浪费。
 *
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 */
public class SingletonDemo2 {
    private static SingletonDemo2 singletonDemo;


    public SingletonDemo2() {
    }


    public static synchronized SingletonDemo2 getInstance() {
        if (singletonDemo == null) {
            singletonDemo = new SingletonDemo2();
        }
        return singletonDemo;
    }
    public static void main(String[] args) {
        SingletonDemo2 s = SingletonDemo2.getInstance();
        SingletonDemo2 s2 = SingletonDemo2.getInstance();
        System.out.println(s == s2);
        System.out.println("s2=" + s2.hashCode());
        System.out.println("s=" + s.hashCode());
    }
}
