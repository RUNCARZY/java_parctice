package basic.day20200331;
/*
java.util.Map 双列集合，键值对
常用子类：HashMap<K, V>, LinkedHashMap<K, V>

HashMap<K, V>:
特点：
1、jdk1.8之前：数组+单向链表， jdk1.8之后：数组+单向链表/红黑树
2、无序集合
3、能存储null键，null值
4、非同步
HashMap的key，需要重写hashcode(),equals()方法来保证key的唯一性

LinkedHashMap<K, V>：
特点：
1、哈希表+链表
2、有序集合


HashTable<K, V>:
1、最早期的哈希表（JDK1.0）
2、同步（线程安全）
3、不能存储null键，null值
4、其子类Properties依旧常用，是唯一一个跟IO流结合的集合


Map接口常用方法
V put(K,V): 存储键值对，返回被替换的value（如果存在）/null
V get(K)
V remove(K)
boolean containsKey(Object key)
Set<K> keySet() 返回此地图中包含的键的set集合，可用来遍历集合
Set<Map.Entry<K, V>> entrySet() 返回此地图中包含的映射的Set视图。Map.Entry<K, V>是map的内部接口
通过Entry对象的方法Entry.getKey(),Entry.getValue()获取键值对
 */
public class MapDemo {
}
