import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    //StringBuffer类
    //与String的区别：String的内容不可变，StringBuffer的内容可变
    //StringBuffer的方法：append、insert、delete、reverse、replace、substring、length、capacity等
    /*
    1. append方法：public StringBuffer append(String s)
    作用：将字符串s添加到StringBuffer对象的末尾
    2. insert方法：public StringBuffer insert(int offset,String s)
    作用：将字符串s插入到StringBuffer对象的offset位置
    3. delete方法：public StringBuffer delete(int start,int end)
    作用：删除StringBuffer对象的start到end-1位置的字符
    4. reverse方法：public StringBuffer reverse()
    作用：将StringBuffer对象的字符序列反转
    5. replace方法：public StringBuffer replace(int start,int end,String s)
    作用：将StringBuffer对象的start到end-1位置的字符替换为字符串s
    6. substring方法：public String substring(int start)
    public String substring(int start,int end)
    作用：返回StringBuffer对象的start到end-1位置的子字符串
    7. length方法：public int length()
    作用：返回StringBuffer对象的长度
    8. capacity方法：public int capacity()
    作用：返回StringBuffer对象的容量
     */


    //日期与时间
    //LocalDate类：表示日期，不包含时间和时区信息
    /*
    LocalDate类的构造方法：
    1. LocalDate.now()：返回当前日期
    2. LocalDate.of(int year,int month,int day)：返回指定日期
    LocalDate类的方法：
    1. getYear()：返回年份
    2. getMonth()：返回月份
    3. getDayOfMonth()：返回日期
    4. getDayOfWeek()：返回星期几
    5. plusDays(int days)：返回days天后的日期
    6. minusDays(int days)：返回days天前的日期
    7. isAfter(LocalDate date)：判断日期是否在date之后
    8. isBefore(LocalDate date)：判断日期是否在date之前
    9. isLeapYear()：判断是否是闰年
     */
    //LocalTime类：表示时间，不包含日期和时区信息
    /*
    LocalTime类的构造方法：
    1. LocalTime.now()：返回当前时间
    2. LocalTime.of(int hour,int minute,int second)：返回指定时间
    LocalTime类的方法：
    1. getHour()：返回小时
    2. getMinute()：返回分钟
    3. getSecond()：返回秒
    4. plusHours(int hours)：返回hours小时后的时间
    5. minusHours(int hours)：返回hours小时前的时间
    6. isAfter(LocalTime time)：判断时间是否在time之后
    7. isBefore(LocalTime time)：判断时间是否在time之前
     */
    //LocalDateTime类：表示日期和时间，不包含时区信息
    /*
    LocalDateTime类的构造方法：
    1. LocalDateTime.now()：返回当前日期和时间
    2. LocalDateTime.of(int year,int month,int day,int hour,int minute,int second)：返回指定日期和时间
    LocalDateTime类的方法：
    1. getYear()：返回年份
    2. getMonth()：返回月份
    3. getDayOfMonth()：返回日期
    4. getDayOfWeek()：返回星期几
    5. getHour()：返回小时
    6. getMinute()：返回分钟
    7. getSecond()：返回秒
    8. plusDays(int days)：返回days天后的日期和时间
    9. minusDays(int days)：返回days天前的日期和时间
    10. isAfter(LocalDateTime dateTime)：判断日期和时间是否在dateTime之后
    11. isBefore(LocalDateTime dateTime)：判断日期和时间是否在dateTime之前
     */

    //Random类
    /*
    Random类的构造方法：
    1. Random()：使用默认种子创建一个随机数生成器
    2. Random(long seed)：使用指定种子创建一个随机数生成器
    Random类的方法：
    1. nextInt()：返回一个随机的int值
    2. nextInt(int n)：返回一个大于等于0小于n的int值
    3. nextLong()：返回一个随机的long值
    4. nextDouble()：返回一个随机的double值
    5. nextBoolean()：返回一个随机的boolean值
     */
    //随机数种子
    /*
    随机数种子是一个长整型数，用来初始化随机数生成器
    如果两个随机数生成器的种子相同，那么它们生成的随机数序列也相同
    如果不设置种子，那么随机数生成器使用当前时间作为种子
     */

    //Math类
    /*
    Math类的方法：
    1. abs方法：public static int abs(int a)
    作用：返回a的绝对值
    2. max方法：public static int max(int a,int b)
    作用：返回a和b中的较大值
    3. min方法：public static int min(int a,int b)
    作用：返回a和b中的较小值
    4. pow方法：public static double pow(double a,double b)
    作用：返回a的b次方
    5. sqrt方法：public static double sqrt(double a)
    作用：返回a的平方根
    6. random方法：public static double random()
    作用：返回一个大于等于0小于1的随机double值
    7. ceil方法：public static double ceil(double a)
    作用：返回大于等于a的最小整数
    8. floor方法：public static double floor(double a)
    作用：返回小于等于a的最大整数
    9. round方法：public static long round(double a)
    作用：返回a的四舍五入值
     */


    //Class类与反射
    //Class类：表示一个类的类对象
    //Class类的方法：
    /*
    1. forName方法：public static Class forName(String className)
    作用：返回指定类名的类对象
    2. newInstance方法：public Object newInstance()
    作用：创建此Class对象所表示的类的一个新实例,类型为Object
    3. getName方法：public String getName()
    作用：返回此Class对象所表示的类的名称
    4. getSuperclass方法：public Class getSuperclass()
    作用：返回此Class对象所表示的类的父类的类对象
    5. getInterfaces方法：public Class[] getInterfaces()
    作用：返回此Class对象所表示的类实现的接口的类对象数组
    6. getDeclaredMethods方法：public Method[] getDeclaredMethods()
    作用：返回此Class对象所表示的类或接口的所有方法的Method对象数组
    7. getDeclaredConstructors方法：public Constructor[] getDeclaredConstructors()
    作用：返回此Class对象所表示的类的所有构造方法的Constructor对象数组
    8. getDeclaredFields方法：public Field[] getDeclaredFields()
    作用：返回此Class对象所表示的类或接口的所有字段的Field对象数组
     */
    //反射：通过Class类的对象获取类的信息
    public static void main(String[] args)
    {
        long start=System.nanoTime();
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        LocalTime lt=LocalTime.now();
        System.out.println(lt);
        System.out.println(lt.getClass());
        Class c=lt.getClass();
        System.out.println(System.nanoTime()-start);

        String cost="数学99分，语文88分，英语77分";
        Scanner sc=new Scanner(cost);
        sc.useDelimiter("[^0-9]+");//设置分隔符,只要不是数字就作为分隔符
        int sum=0;
        while(sc.hasNextInt())//判断是否还有整数
        {
            try
            {
                int score=sc.nextInt();
                sum+=score;
            }
            catch(Exception e)
            {
                String t=sc.next();
            }
        }
        System.out.println("总分："+sum);

        System.out.println("12hello789".replaceAll("[123456789]+","*"));//这里的+表示1个或多个

        byte[]b="abc我爱学习".getBytes();
        String s=new String(b,0,6);//length是6,为什么是6呢？因为一个汉字占3个字节
        System.out.println(s);
    }
}