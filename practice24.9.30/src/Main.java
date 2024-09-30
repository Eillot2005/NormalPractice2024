public class Main {
    public static void main(String[] args) {
        //接口
        //接口是一种引用数据类型，是抽象方法的集合，接口是一种公约标准
        //接口的作用：定义一些方法，但是不去实现，让不同的类去实现这些方法

        //接口的定义格式：
        /*
        interface 接口名{
            //常量
            //抽象方法
         */
        //接口体：接口中只能有常量和抽象方法
        //接口中的成员变量默认是public static final修饰的，接口中的方法默认是public abstract修饰的
        //JDK8之后，接口可以有实例方法和静态方法，用default和static修饰
        //JDK9之后，接口可以有私有方法，用private修饰（供接口内部default的实例方法调用）
        /*
        实现一个接口，包含以上所有情况：
        interface A{
            //常量
            public static final int NUM = 10;   等价于 int NUM = 10;
            //抽象方法
            public abstract void show();    等价于 void show();
            //实例方法
            public default void method(){
                System.out.println("实例方法");
            }
            //静态方法
            public static void function(){
                System.out.println("静态方法");
            }
            //私有方法
            private void test(){
                System.out.println("私有方法");
            }
         */

        //接口的实现
        //格式：class 类名 implements 接口名{}
        //重写接口中的方法
        /*
        除了抽象方法，dafault方法也可以重写（需要去除default修饰符）
        class B implements A{
            @Override
            public void show() {
                System.out.println("show");
            }
            @Override
            public void method() {
                System.out.println("method");
            }
        }
         */

        //接口回调
        //接口回调是一种常见的设计模式，接口回调是一种多态的应用
        //接口回调的原理：接口回调是一种多态的应用，接口回调是一种将接口的引用作为参数传递给方法的技术
        /*
        举例：
        interface A{
            void show();
        }
        class B implements A{
            @Override
            public void show() {
                System.out.println("show");
            }
        }
        class C{
            public void method(A a){
                a.show();
            }
        }
        public class Main {
            public static void main(String[] args) {
                C c = new C();
                B b = new B();
                c.method(b);
            }
        }
        输出结果：show
         */
        //接口回调的好处：接口回调可以使程序的结构更加清晰，可以使程序的耦合度更低，可以使程序的扩展性更强
        //接口回调的应用场景：接口回调常用于事件处理机制，接口回调常用于异步处理，接口回调常用于回调函数


        //函数接口与Lambda表达式
        //函数接口：函数接口是只有一个抽象方法的接口，函数接口是一种特殊的接口
        //函数接口的定义：在接口上使用@FunctionalInterface注解
        //函数接口的作用：函数接口可以用Lambda表达式来创建该接口的对象
        //Lambda表达式：Lambda表达式是一种匿名函数，Lambda表达式是一种简洁的函数式编程
        //Lambda表达式的格式：(参数列表) -> {方法体}
        //Lambda表达式的使用：Lambda表达式可以替代匿名内部类，Lambda表达式可以替代函数接口的实现
        /*
        举例：
        interface A{
            void show();
        }
        public class Main {
            public static void main(String[] args) {
                A a = () -> {
                    System.out.println("show");
                };
                a.show();
            }
        }
        输出结果：show
         */


        //接口与多态
        //接口与多态的结合：接口与多态是一种常见的结合方式，接口与多态是一种多态的应用
        //接口与多态的原理：接口与多态是一种将接口的引用作为参数传递给方法的技术
        /*
        接口与多态的举例：
        interface A{
            void show();
        }
        class B implements A{
            @Override
            public void show() {
                System.out.println("B show");
            }
        }
        class C implement A{
            @Override
            public void show() {
                System.out.println("C show");
            }
        }
        class D{
            public void method(A a){
                a.show();
            }
        }
        public class Main {
            public static void main(String[] args) {
                D d = new D();
                B b = new B();
                C c = new C();
                d.method(b);
                d.method(c);

                A a = new B();
                a.show();
                a = new C();
                a.show();
            }
        }
        输出结果：
        B show
        C show
        B show
        C show
         */


        //接口参数
        //定义：接口参数是一种将接口的引用作为参数传递给方法的技术


        //面向接口编程
        //设计一个广告牌，广告牌可以显示各种公司的广告
        /*
        interface Advertisement{
            void show();
        }
        class CompanyA implements Advertisement{
            @Override
            public void show() {
                System.out.println("A的广告");
            }
        }
        class CompanyB implements Advertisement{
            @Override
            public void show() {
                System.out.println("B的广告");
            }
        }
        class Billboard{
            public void show(Advertisement advertisement){
                advertisement.show();
            }
        }
        public class Main {
            public static void main(String[] args) {
                Billboard billboard = new Billboard();
                CompanyA companyA = new CompanyA();
                CompanyB companyB = new CompanyB();
                billboard.show(companyA);
                billboard.show(companyB);
            }
        }
        输出结果：
        CompanyA
        CompanyB
         */
    }
}