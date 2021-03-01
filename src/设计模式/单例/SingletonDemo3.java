package 设计模式.单例;

/**
 * 饿汉式
 *
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 */
public class SingletonDemo3 {

        private static SingletonDemo3 instance = new SingletonDemo3();
        private SingletonDemo3 (){}
        public static SingletonDemo3 getInstance() {
            return instance;
        }

}
