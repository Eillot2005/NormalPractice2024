import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        //toString方法
        //toString方法是Object类的一个方法，所有类都继承了Object类，所以所有类都有toString方法
        //toString方法的作用是返回对象的字符串表示
        /*
        使用tostring示例：
        public class Student{
            private String name;
            private int age;
            public Student(String name,int age){
                this.name = name;
                this.age = age;
            }
            public String toString(){
                return "姓名："+name+" 年龄："+age;
            }
        }
        */
        //toString方法的默认实现是返回对象的类名+@+对象的哈希码的十六进制表示
        //可以重写toString方法，返回对象的其他字符串表示

        //对象的字符串表示
        //对象的字符串表示是对象的toString方法的返回值
        //如果对象没有重写toString方法，那么对象的字符串表示是对象的类名+@+对象的哈希码的十六进制表示
        //如果对象重写了toString方法，那么对象的字符串表示是重写的toString方法的返回值
        //System.out.println方法会调用对象的toString方法，打印对象的字符串表示


        //字符串与字符数组
        //String构造方法（参数包含字符数字）：String(char[] value，int offset，int count)
        //上面每个参数的含义是：value是字符数组，offset是起始位置，count是长度
        //String类的toCharArray方法：char[] toCharArray()
        //toCharArray方法的作用是将字符串转换为字符数组
        /*
        示例：
        String s = "hello";
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
         */
        //getChars方法：void getChars(int srcBegin,int srcEnd,char[] dst,int dstBegin)
        //getChars方法的作用是将字符串的一部分复制到字符数组中
        //srcBegin是字符串的起始位置，srcEnd是字符串的结束位置，dst是目标字符数组，dstBegin是目标字符数组的起始位置

        //字符串与字节数组
        //String(byte[] bytes) 构造方法,将字节数组转换为字符串
        //String(byte[] bytes,int offset,int length) 构造方法,将字节数组的一部分转换为字符串
        //getBytes方法：byte[] getBytes()，将字符串转换为字节数组(默认使用UTF-8编码)
        /*
        示例：
        String s = "hello";
        byte[] b = s.getBytes();
         */
        //getBytes方法的重载：byte[] getBytes(String charsetName)
        //在这里，charseName是字符编码的名称，有：UTF-8、GBK、GB2312、ISO-8859-1、UTF-16、UTF-16BE、UTF-16LE等
        /*
        示例：
        String s = "hello";
        byte[] b = s.getBytes("UTF-8");
        */

        //正则表达式
        //正则表达式是一种字符串匹配的模式，可以用来检查字符串是否符合一定的规则
        //正则表达式的基本语法：
        //1.普通字符：普通字符包括大小写字母和数字，以及一些符号
        //2.非打印字符：非打印字符包括制表符、换行符等
        //3.特殊字符：特殊字符包括正则表达式的关键字
        //4.边界匹配符：边界匹配符包括^和$
        //5.数量词：数量词包括*、+、?、{n}、{n,}、{n,m}
        //6.或：或的表示是|
        //7.分组：分组的表示是()
        //8.字符类：字符类的表示是[]
        //9.转义字符：转义字符是\
        //10.预定义字符类：预定义字符类包括.、\d、\D、\s、\S、\w、\W
        /*
        示例：
        String s = "hello";
        boolean b = s.matches("h.*");
        System.out.println(b);//true
         */
        //正则表达式的方法
        //matches方法：boolean matches(String regex)，判断字符串是否匹配正则表达式
        //split方法：String[] split(String regex)，根据正则表达式分割字符串
        //replaceAll方法：String replaceAll(String regex,String replacement)，根据正则表达式替换字符串
        //replaceFirst方法：String replaceFirst(String regex,String replacement)，根据正则表达式替换第一个字符串

        //字符串的分解
        //spilt方法：String[] split(String regex)，根据正则表达式分割字符串
        //split方法的返回值是一个字符串数组，数组中的元素是根据正则表达式分割后的子字符串
        //使用StringTokenizer类
        //StringTokenizer类的构造方法：StringTokenizer(String str)，StringTokenizer(String str,String delim)
        //StringTokenizer类的方法：boolean hasMoreTokens()，String nextToken(),int countTokens()
        /*
        1.hasMoreTokens方法的作用是判断是否还有分割后的子字符串,
        2.nextToken方法的作用是返回分割后的子字符串,每次调用nextToken方法都会返回一个子字符串
        3.countTokens方法的作用是返回剩余的子字符串的个数
        示例：
        String s = "hello,world";
        StringTokenizer st = new StringTokenizer(s,",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        输出: hello
             world
         */
        String s="hello my name is eillot";
        StringTokenizer st=new StringTokenizer(s," ");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}