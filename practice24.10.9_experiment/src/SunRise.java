import tom.jiafei.*;
public class SunRise {
    public static void main(String[] args) {
        SquareEquation equation = new SquareEquation(4,5,1);
        equation.getRoots();
        equation.setCoefficents(-3,4,5);
        equation.getRoots();
    }
}

//运行结果：
/*
是一元二次方程
方程的根：-0.250000,-1.000000
是一元二次方程
方程的根：-0.786300,2.119633
 */

//1.
/*
假设JDK的安装目录是“DNjdkl.6”，那么Java运行系统默认 Classpash 的值是：
D:\jak1.6\jre\lib\rt.jar;.;
其中的“：”表示应用程序可以使用所在当前目录中的无名包类以及当前目录下子目录中的类，子目录中的类必须有包名，而且包名要和子目录结构相对应。
因此，如果将模板 2应用程序 SunRise java 的字节码文件存放到“D15000”中，
并将SquareEquation java 的字节码文件存放到 “D:\1500\tom\jiafei〞 中，
就不需要修改 classpath
需要特别注意的是，因为 SquareEquation.java 有包名，不可将 SquareEquationjava以及它的字节码文件存放到“D:\1500” 中，
即不可以和 SunRise.java 的字节码存放在一起。
请进行如下练习：
(1）将 SquareEquation.java 存放到 “D:\50001\tom\jiafei”中，编译：
D: \5000\tom\jiafei> javac SquareEquation. java
(2）将 SunRise java 存放到 “D:\15000” 中，编译：
D: \5000> javac SunRise.java
(3）运行：
D: \5000> java SunRise
运行结果：正常运行。
 */

//2.rt.jar包含了什么内容
//rt.jar包含了Java的核心类库，如java.lang、java.util、java.io等包中的类

//3.为何将c:\1000添加到classpath中？
//因为SquareEquation.java文件的包名是tom.jiafei，所以SquareEquation.java的字节码文件SquareEquation.class被存到c:\1000\tom\jiafei中,将其添加到classpath中，可以让SunRise.java找到SquareEquation.class文件

//4.程序运行中，setCoefficents方法中this的值是什么？this能否省略？
//this指的是当前对象，setCoefficents方法中this指的是SquareEquation对象，this不能省略