package basic.day20200420.stream;
/*
Stream流是jdk1.8新特性，Stream是一个管道流，只能消费一次。

获取Stream<T>流的两种方法：
1. Collection类可以调用.stream方法获取流
2. java.util.stream.Stream中的静态方法of获取一个Stream方法获取一个流对象
    static <T> Stream<T> of(T... values)

Stream<T>中的两类方法：
1. 延迟方法， 返回类型仍然是Stream自身类型的方法，可以继续使用链式调用
2. 终结方法，返回接口不再是Stream自身类型的方法，如count， foreach方法

接口方法：
void forEach(Consumer<? super T> action) 对此流的每个元素执行操作。
long count() 返回此流中的元素数。

Stream<T> filter(Predicate<? super T> predicate) 返回由与此给定谓词匹配的此流的元素组成的流。
Stream<T> limit(long maxSize) 返回由此流的元素组成的流，截短长度不能超过 maxSize 。
Stream<T> skip(long n) 在丢弃流的前 n元素后，返回由该流剩下元素组成的流。
<R> Stream<R> map(Function<? super T,? extends R> mapper) 映射，返回由给定函数应用于此流的元素的结果组成的流

静态方法：
static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b) 创建一个懒惰连接的流，其元素是第一个流的所有元素，后跟第二个流的所有元素。
 */


import java.util.ArrayList;
import java.util.stream.Stream;

/*
练习：筛选出A班、B班各个分段的学生。
1.评级并统计各级人数
2.给出两个班分数大于90的名单
*/
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Student> classA = new ArrayList<>();
        ArrayList<Student> classB = new ArrayList<>();

        classA.add(new Student("小明", 60));
        classA.add(new Student("小白", 78));
        classA.add(new Student("X黑", 100));
        classA.add(new Student("X啊", 62));
        classA.add(new Student("X哦", 63));
        classA.add(new Student("X额", 70));

        classB.add(new Student("adf", 2));
        classB.add(new Student("adf", 78));
        classB.add(new Student("fd", 88));
        classB.add(new Student("gr", 98));
        classB.add(new Student("ag", 89));

        levelCount(classA);
        levelCount(classB);

        Stream.concat(classA.stream(), classB.stream()).filter(student -> student.grade > 90)
                .map(student -> student.name).forEach(name -> System.out.println(name));

    }

    private static void levelCount(ArrayList<Student> aClass) {
        long countA = aClass.stream().filter(student -> student.grade >= 90).count();
        long countB = aClass.stream().filter(student -> student.grade < 90 && student.grade >= 75).count();
        long countC = aClass.stream().filter(student -> student.grade < 75 && student.grade >= 60).count();
        long countD = aClass.stream().filter(student -> student.grade < 60).count();
        System.out.println("LevelA counts:" + countA);
        System.out.println("LevelB counts:" + countB);
        System.out.println("LevelC counts:" + countC);
        System.out.println("LevelD counts:" + countD);
    }
}



class Student {
    public String name;
    public int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
        }
