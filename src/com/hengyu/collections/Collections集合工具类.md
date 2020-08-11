# Collections集合工具类

java.util.Collections是集合工具类，用来对集合进行操作，部分方法如下

往集合中添加一些元素
public static <T> boolean addAll(Collection<T> c,T... elements);

打乱顺序，打乱集合顺序
public static void shuffle(List<?> list);

将集合中元素按照默认规则排序
public static <T> void sort(List<T> list);

将集合中元素按照指定规则排序
public static <T> void sort(List<T> list,Comparator<? super T> );


## Comparator和Comparable的区别
Comparable：this和别人的参数比较，自己需要实现Comparable接口，重写比较的规则compareTo方法

Compartor：相当于找一个第三方的裁判，比较两个

