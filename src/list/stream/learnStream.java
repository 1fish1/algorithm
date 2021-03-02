package list.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class learnStream {

    public static void main(String[] args) {
        learn();
    }

    private static void learn() {
        List<Integer> lists = new ArrayList();
        //创建一个乱序数组
        lists.add(1);
        lists.add(5);
        lists.add(3);
        lists.add(25);
        lists.add(34);
        lists.add(12);
        lists.add(67);

//        list.stream().sorted();
//        list.forEach(System.out::println);

        System.out.print("List里面的数据:");
        for (Integer elem : lists) System.out.print(elem + " ");
        System.out.println();
        //最小值
        System.out.print("List中最小的值为:");
        Stream<Integer> stream = lists.stream();
        Optional<Integer> min = stream.min(Integer::compareTo);
        if (min.isPresent()) {
            System.out.println(min.get());//1
        }


        //最大值
        System.out.print("List中最大的值为:");
        lists.stream().max(Integer::compareTo).ifPresent(System.out::println);//67

        //排序
        System.out.print("将List流进行排序:");
        Stream<Integer> sorted = lists.stream().sorted();
        sorted.forEach(elem -> System.out.print(elem + " "));
//        sorted.forEach(System.out::print);

        System.out.println();

        //过滤
        System.out.print("过滤List流，只剩下那些大于30的元素:");
        lists.stream()
                .filter(elem -> elem > 30)
                .forEach(elem -> System.out.print(elem + " "));// 34 67

        System.out.println();

        //过滤
        System.out.println("过滤List流，只剩下那些大于0并且小于40的元素:\n=====begin=====");
        lists.stream()
                .filter(elem -> elem > 0)
                .filter(elem -> elem < 40)
                .sorted(Integer::compareTo)
                .forEach(System.out::println);// 1 3 5 12 25 34

        System.out.println("=====end=====");
        //经过了前面的这么多流操作，我们再来看看List里面的值有没有发生什么改变
        System.out.print("原List里面的数据:");
        for (Integer elem : lists) System.out.print(elem + " ");


    }

}
