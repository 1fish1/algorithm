package 设计模式.单例;

/**
 * 登记式/静态内部类
 *描述：
 *
 * 这种方式能达到双检锁方式一样的功效，但实现更简单。
 * 对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
 * 这种方式同样利用了 classloader 机制来保证初始化 instance 时只有一个线程，它跟第 3 种方式不同的是：
 * 第 3 种方式只要 Singleton 类被装载了，那么 instance 就会被实例化（没有达到 lazy loading 效果），
 * 而这种方式是 Singleton 类被装载了，instance 不一定被初始化。
 * 因为 SingletonHolder 类没有被主动使用，只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，
 * 从而实例化 instance。
 *
 * 实现代码简洁。和双重检查单例对比，静态内部类单例实现代码真的是太简洁，又清晰明了。
 * 延迟初始化。调用getSingleton才初始化Singleton对象。
 * 线程安全。JVM在执行类的初始化阶段，会获得一个可以同步多个线程对同一个类的初始化的锁。
 */
public class SingletonDemo5 {


    private static class SingletonHolder {
        private static final SingletonDemo5 INSTANCE = new SingletonDemo5();
    }

    private SingletonDemo5() {
    }

    public static final SingletonDemo5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
    public static void main(String[] args) {
        SingletonDemo5 s = SingletonDemo5.getInstance();
        SingletonDemo5 s2 = SingletonDemo5.getInstance();
        System.out.println(s == s2);
        System.out.println("s2=" + s2.hashCode());
        System.out.println("s=" + s.hashCode());
    }
}
