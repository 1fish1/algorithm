package 设计模式.单例;

/**
 * 双检锁/双重校验锁
 * 线程安全
 *
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键
 *
 * 延迟初始化。和懒汉模式一致，只有在初次调用静态方法getSingleton，才会初始化signleton实例。
 * 性能优化。同步会造成性能下降，在同步前通过判读singleton是否初始化，减少不必要的同步开销。
 * 线程安全。同步创建Singleton对象，同时注意到静态变量singleton使用volatile修饰。
 */
public class SingletonDemo4 {

    private volatile static SingletonDemo4 singleton;    // 1:volatile修饰

    private SingletonDemo4() {
    }

    public static SingletonDemo4 getSingleton() {
        if (singleton == null) {     // 2:减少不要同步，优化性能
            synchronized (SingletonDemo4.class) {    // 3：同步，线程安全
                if (singleton == null) {
                    singleton = new SingletonDemo4();   // 4：创建singleton 对象
                }
            }
        }
        return singleton;
    }
}
