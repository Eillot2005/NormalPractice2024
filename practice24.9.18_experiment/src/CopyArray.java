import java.util.Arrays;
public class CopyArray {
    public static void main(String[] args) {
        int []a={1,2,3,4,500,600,700,800};
        int[] b,c,d;
        System.out.println("数组a的内容是："+Arrays.toString(a));
        b=Arrays.copyOf(a,a.length);
        System.out.println("数组b的内容是："+Arrays.toString(b));
        c= Arrays.copyOf(a,4);//代码1
        System.out.println("数组c的内容是："+Arrays.toString(c));//代码2
        d=Arrays.copyOfRange(a,4,8);//代码3
        System.out.println("数组d的内容是："+Arrays.toString(d));
        c[c.length-1]=-100;//代码4
        d[d.length-1]=-200;
        System.out.println("数组a的内容是："+Arrays.toString(a));
        int []jerry=Arrays.copyOfRange(d,1,8);  System.out.println(Arrays.toString(jerry));

    }
}


//在代码4后面增加语句“int[] tom=Arrays.copyOf(a,6);  System.out.println(Arrays.toString(tom));”
//[1, 2, 3, 4, 500, 600]
//在程序最后一个语句后面增加语句“int []jerry=Arrays.copyOfRange(d,1,8);  System.out.println(Arrays.toString(jerry));”
//[600, 700, -200, 0, 0, 0, 0]

