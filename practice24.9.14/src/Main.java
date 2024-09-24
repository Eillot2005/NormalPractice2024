public class Main {
    public static void main(String[] args)
    {
        //类与程序的基本结构

        //对象的组合：一个类的对象作为另一个类的成员变量
        Circle c=new Circle(3.5);
        Cone cone=new Cone(c,5.6);
        System.out.println(cone.getVolume());
        System.out.println(cone.getSurfaceArea());
        cone.setBottom(new Circle(4.5));
        System.out.println(c.getRadius());


        //访问权限
        /*
        1.访问权限修饰符有四种：private、缺省、protected、public
        2.类的访问权限修饰符只能是public和缺省
        3.类的成员变量和成员方法的访问权限修饰符可以是private、缺省、protected、public
        4.类的成员变量和成员方法的访问权限修饰符的访问范围：
            private:同一个类
            缺省:同一个包
            protected:同一个包，不同包的子类
            public:所有类
        5.访问权限的继承表格
            修饰符      类   包    子类    所有类
            private    √
            缺省        √    √
            protected  √    √     √
            public     √    √     √      √
        */


        //double类和float类的使用
        //double类和float类是浮点数类，double类的精度是float类的两倍
        //double类和float类中有两个常量：MAX_VALUE和MIN_VALUE，分别表示最大值和最小值
        //double类和float类中有两个方法：isInfinite(double d)和isNaN(double d)，分别表示判断d是否是无穷大和是否是非数字


        //character类
        //Character类是char的包装类，Character类中有两个常量：MAX_VALUE和MIN_VALUE，分别表示char的最大值和最小值
        //Character类中有两个方法：isDigit(char ch)和isLetter(char ch)，分别表示判断ch是否是数字和字母
        //Character类中有两个方法：toUpperCase(char ch)和toLowerCase(char ch)，分别表示将ch转换为大写和小写
        //Character类中有两个方法：isUpperCase(char ch)和isLowerCase(char ch)，分别表示判断ch是否是大写和小写
        //Character类中有两个方法：isWhitespace(char ch)和isSpaceChar(char ch)，分别表示判断ch是否是空白字符和空格字符
    }
}