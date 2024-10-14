public class Main {
    public static void main(String[] args)
    {
        //内部类
        //内部类是定义在类中的类，内部类可以访问外部类的属性和方法，内部类可以访问外部类的私有属性和方法
        //内部类的字节码文件：外部类$内部类.class
        //内部类的分类：成员内部类(静态内部类和非静态内部类)、局部内部类、匿名内部类

        //成员内部类
        //成员内部类是定义在类中的类，成员内部类可以访问外部类的属性和方法，成员内部类可以访问外部类的私有属性和方法
        //静态内部类：静态内部类是定义在类中的静态类，静态内部类可以访问外部类的静态属性和方法，静态内部类不能访问外部类的非静态属性和方法
        //非静态内部类：非静态内部类是定义在类中的非静态类，非静态内部类可以访问外部类的静态属性和方法与非静态属性和方法

        //匿名类
        //匿名类是没有类名的类，匿名类是一种特殊的内部类，匿名类是一种简化的内部类
        //匿名类的格式：new 类名或接口名(){方法体}
        //匿名类的应用场景：匿名类常用于创建只需要使用一次的类的对象
        /*
        举例1：
        interface A{
            void show();
        }
        public class Main {
            public static void main(String[] args) {
                A a = new A() {
                    @Override
                    public void show() {
                        System.out.println("show");
                    }
                };
                a.show();
            }
        }

        举例2：
        public abstract class bank(){
            public abstract void show();
        }
        public class ShowBank()
        {
            public void show(bank b){
                b.show();
            }
        }
        public class Main {
            public static void main(String[] args) {
                ShowBank sb = new ShowBank();
                sb.show(new bank(){
                    @Override
                    public void show() {
                        System.out.println("中国银行");
                    }
                });
            }
        }

        举例3:GUI
        JFrame jf = new JFrame();
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });最终的效果是：点击窗口的关闭按钮，窗口关闭
        */
        //用lambada表达式简化匿名类
        //格式：(参数列表)->{方法体}


        //异常机制
        //为什么要有异常机制：异常机制是一种程序运行时的错误处理机制，异常机制可以提高程序的健壮性
        //异常的分类：Error、Exception
        //Error：错误，是程序无法处理的严重问题，比如内存溢出
        //Exception：异常，是程序可以处理的问题，异常又分为编译时异常和运行时异常
            //编译时异常：编译时异常是在编译时期会出现的异常，如果不处理编译时异常，程序就会发生错误，无法通过编译
            //运行时异常：运行时异常是在运行时期会出现的异常，如果不处理运行时异常，程序不会出错，但是会影响程序的正常运行
        //异常处理的方式：try-catch、throws、throw

        //try-catch：try-catch是一种捕获异常的方式，try-catch可以捕获异常并处理异常
        //try-catch的格式
        /*
        try{
            //可能出现异常的代码
        }catch(异常类型1 变量名1){
            //处理异常的代码
        }catch(异常类型2 变量名2){
            //处理异常的代码
        }finally{
            //一定会执行的代码
        }
         */
        //try-catch的执行流程：当try中的代码出现异常时，会跳转到catch中的代码，当catch中的代码执行完毕后，会执行finally中的代码
        //异常类型有：
        /*
        1. ArithmeticException：算术异常
        2. ArrayIndexOutOfBoundsException：数组下标越界异常
        3. ArrayStoreException：数组存储异常
        4. ClassCastException：类转换异常
        5. IllegalArgumentException：非法参数异常
        6. IllegalMonitorStateException：非法监视器状态异常
        7. IllegalStateException：非法状态异常
        8. IllegalThreadStateException：非法线程状态异常
        9. IndexOutOfBoundsException：索引越界异常
        10. NegativeArraySizeException：负数组大小异常
        11. NullPointerException：空指针异常
        12. NumberFormatException：数字格式异常
        13. SecurityException：安全异常
        14. StringIndexOutOfBoundsException：字符串索引越界异常
        15. UnsupportedOperationException：不支持操作异常
         */
        //或者直接使用 Exception 类来捕获所有异常

        //Throwable类
        //Throwable类是所有异常的父类，Throwable类有两个子类：Error和Exception
        //Throwable类中有三个常用方法：getMessage()和printStackTrace()和 toString()
        //getMessage()：获取异常信息，但不显示异常的类型
        //printStackTrace()：打印异常的堆栈信息
        //toString()：获取异常的类型和异常信息

        //throw:throw是一种抛出异常的方式，throw可以抛出异常
        //throw的格式：throw 异常对象
        //throw的应用场景：throw常用于方法内部，用于抛出异常
        //throw和throws的区别：throw用于方法内部，用于抛出异常；throws用于方法声明上，用于声明异常
        /*
        举例：
        public void show(int a) throws Exception{
            if(a>0){
                throw new Exception("a不能大于0");
            }
        }
        这里的Exception是一个异常类，"a不能大于0"是异常信息
         */

        //throws:throws是一种声明异常的方式，throws可以声明异常
        //throws的格式：修饰符 返回值类型 方法名(参数列表) throws 异常类型1,异常类型2...
        //throws的应用场景：throws常用于方法声明上，用于声明异常
        //用处：throws用于声明异常，让调用者知道该方法可能会出现的异常
    }
}