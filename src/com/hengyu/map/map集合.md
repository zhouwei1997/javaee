# Map集合

## 特点
1、Map集合是一个双列集合，一个元素包含两个值（一个Key，一个Value）

2、Map集合中的元素，Key和Value的数据类型可以相同，也可以不同

3、Map集合中的元素，Key是不允许重复的，Value可以重复

4、Map集合中的元素，Key和Value是一一对应的

## 常用方法

public V put(K key,V value);把指定的键和指定的值添加到Map集合中
```
返回值V：
存储键值对的时候，key不重复，返回值V是null
存储键值对的时候，key重复，会使用新的value替换map中的重复的value，返回被替换的value值
```

public V remove(Object key);把指定的键所对应的键值对元素，在Map集合中删除，返回被删除元素的值
```
返回值V：
key存在，V返回被删除的对象
key不存在，V返回null
```

public V get(Object key);根据指定的键，在Map集合中获取对应的值
```
返回值V：
key存在，V返回对应的value值
key不存在，V返回null
```

public boolean containsKey(Object key)：判断集合中是否包含指定的键
```
包含返回true，不包含返回false
```

public Set<K> keySet();获取Map集合中所有的键，存储到Set集合中

public Set<Map.Entry<K,V>> entrySet();获取到Map集合中所有的键值对对象的集合（Set集合）
```
实现步骤：
1、使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存储到一个Set集合中
2、遍历Set集合，获取每一个Entry对象
3、使用Entry对象中的方法getKey()和getValue获取键与值
```
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