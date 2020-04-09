package basic.day20200409;
/*
    java.util.Properties extends HashTable implements Map
    Properties是一个与IO流相关的集合.
        store把集合中的临时数据，持久化写入到硬盘中
        load把文件中的键值对，读取到集合中使用
    属性列表中每个键、值默认都是字符串

    方法：
    Object setProperty(String key, String value)，相当Map中的get方法
    String getProperty(String key)，相当与Map中的get方法
    store(OutputStream out, String comments);
    store(Writer writer, String comments);
    load(InputStream inStream, String comments);
    load(Reader reader, String comments);
 */
public class PropertiesDemo {
}
