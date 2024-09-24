public class MainClass {
    public static void main(String[] args) {
        System.out.println("你好，只需编译我");
        A a=new A();
        a.fa();
        B b=new B();
        b.fb();
    }
}

//将MainClass.java编译后，不断改变A.java中的代码，后单独编译A.java，再运行MainClass.java：    输出的是修改后的代码
//如果编译某个目录下的所有java文件，可以使用javac *.java：    这样就会编译该目录下的所有java文件，包括原来没有编译的C.java

//java语言的主要贡献人是：  詹姆斯·高斯林（James Gosling）
//Java主类中正确的main方法是：  public static void main(String args[])
//如果jdk安装目录为D:\jdk，则path环境变量应该设置为：  D:\jdk\bin;   classpath环境变量应该设置为    D:\jdk\jre\lib\rt.jar
//JDK提供的编译器为：  javac.exe