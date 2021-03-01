package 设计模式.单例;

/**
 * 懒汉式 线程不安全
 * 单例类必须给所有其他对象提供这一实例。
 * 单例类只能有一个实例
 * 单例类必须自己创建自己的唯一实例。
 *
 *
 * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。
 * 因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作
 */
public class SingletonDemo {

    private static SingletonDemo singletonDemo;


    public SingletonDemo() {
    }


    public static SingletonDemo getInstance() {
        if (singletonDemo == null) {
            singletonDemo = new SingletonDemo();
        }
        return singletonDemo;
    }

}
