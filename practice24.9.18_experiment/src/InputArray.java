/*
public class InputArray {
    public static void main(String[] args) {
        int []a={100,200,300};
        System.out.println("数组a的长度是："+a.length);//代码1
        System.out.println("数组a的引用是："+a);//代码2
        int b[][]={{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
        System.out.println("数组b的长度是："+b.length);//代码3
        System.out.println(b[4][2]);
        b[4]=a;//代码4
        for(int i=0;i<b.length;i++) System.out.println("数组b["+i+"]的长度是："+b[i].length+" 数组b["+i+"]的引用是："+b[i]);
        System.out.println(b[4][2]);
    }
}
*/


//在代码4后面增加语句“a[3]=200”，编译器会提示的错误是：  java: 不兼容的类型: int[]无法转换为int
//在代码4前面输出二维数组b中各一维数组的长度和引用，代码是：
//for(int i=0;i<b.length;i++) System.out.println("数组b["+i+"]的长度是："+b[i].length+" 数组b["+i+"]的引用是："+b[i]);
/*
数组b[0]的长度是：1 数组b[0]的引用是：[I@27973e9b
数组b[1]的长度是：2 数组b[1]的引用是：[I@6e2c634b
数组b[2]的长度是：3 数组b[2]的引用是：[I@37a71e93
数组b[3]的长度是：4 数组b[3]的引用是：[I@7e6cbb7a
数组b[4]的长度是：5 数组b[4]的引用是：[I@7c3df479
 */
//在代码4后面输出二维数组b中各一维数组的长度和引用，代码是：
//for(int i=0;i<b.length;i++) System.out.println("数组b["+i+"]的长度是："+b[i].length+" 数组b["+i+"]的引用是："+b[i]);
/*
数组b[0]的长度是：1 数组b[0]的引用是：[I@27973e9b
数组b[1]的长度是：2 数组b[1]的引用是：[I@6e2c634b
数组b[2]的长度是：3 数组b[2]的引用是：[I@37a71e93
数组b[3]的长度是：4 数组b[3]的引用是：[I@7e6cbb7a
数组b[4]的长度是：3 数组b[4]的引用是：[I@5b6f7412
 */