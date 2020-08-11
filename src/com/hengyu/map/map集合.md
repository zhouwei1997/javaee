# Map集合

## 特点
1、Map集合是一个双列集合，一个元素包含两个值（一个Key，一个Value）

2、Map集合中的元素，Key和Value的数据类型可以相同，也可以不同

3、Map集合中的元素，Key是不允许重复的，Value可以重复

4、Map集合中的元素，Key和Value是一一对应的

## 常用方法

public V put(K key,V value);把指定的键和指定的值添加到Map集合中

public V remove(Object key);把指定的键所对应的键值对元素，在Map集合中删除，返回被删除元素的值

public V get(Object key);根据指定的键，在Map集合中获取对应的值

public Set<K> keySet();获取Map集合中所有的键，存储到Set集合中

public Set<Map.Entry<K,V>> entrySet();获取到Map集合中所有的键值对对象的集合（Set集合）

# HashMap集合

java.util.HashMap<K,V> implement Map<K,V>

## 特点
1、HashMap集合底层是哈希表：查询的速度特别快
~~~
JDK1.8之前：数组+单向链表
JDK1.8之后：数组+单向链表/红黑树(链表长度超过8)
~~~
2、HashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一致

# LinkedHashMap集合

java.util.LinkedHashMap<K,V> extends HashMap<K,V>

## 特点
1、LinkedHashMap集合底层是哈希表+链表

2、LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的