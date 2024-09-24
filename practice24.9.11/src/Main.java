public class Main {
    public static void main(String[] args) {
        System.out.println('平' + '安');//输出的是Unicode编码,因为'平'的Unicode编码是24179,'安'的Unicode编码是23433
        //类与对象

        //静态变量的特点是：随着类的加载而加载，优先于对象存在，被所有对象共享；访问方式：类名.静态变量名
        /*
        举例
            public class Person
            {
                String name;//实例变量
                static String country="中国";//静态变量
            }
            Person p1=new Person();
            Person p2=new Person();
            p1.name="张三";
            p1.country="美国";
            System.out.println(p1.name+" "+p1.country);//张三 美国
            System.out.println(p2.name+" "+p2.country);//null 美国
            System.out.println(Person.country);//美国
            System.out.println(p1.country);//美国
            System.out.println(p2.country);//美国
        分析:当p1.country="美国"时，Person.country也变成了"美国"，因为静态变量被所有对象共享，所以p2.country也是"美国"
         */
        //实例变量的特点是：随着对象的创建而存在，优先于对象存在，只能被对象访问；访问方式：对象名.实例变量名

        //静态方法（类方法）的特点是：随着类的加载而加载，优先于对象存在，被所有对象共享；访问方式：类名.静态方法名
        /*
        举例：
            public class Person
            {
                String name;//实例变量
                static String country="中国";//静态变量
                public static void show()
                {
                    System.out.println("我是一个中国人");
                }
            }
            Person.show();
         注意：静态方法可以通过类名直接调用，也可以通过对象名调用，但是推荐使用类名调用;静态方法中不能直接访问实例变量，只能访问静态变量
         */
        //实例方法的特点是：随着对象的创建而存在，只能被对象访问；访问方式：对象名.实例方法名

        //当局部变量与实例变量重名时，就近原则，即在方法中使用的变量是局部变量，如果要访问实例变量，需要使用this关键字

        Point p1=new Point(1.1,2.2,3.3);
        Point p2=new Point(2.3,3.5,4.7);
        System.out.println(p1.getDistance(p2));
        System.out.println(Point.getD(p1,p2));

    }
}