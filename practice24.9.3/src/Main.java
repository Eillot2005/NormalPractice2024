import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float f= 12.31F;//float类型的数据后面要加F,否则会报错;float类型的数据占用4个字节,可以表示小数点后7位
        double d= 12.31;//double类型的数据后面可以不加D;double类型的数据占用8个字节,可以表示小数点后15位

        //整形默认是int类型,浮点型默认是double类型
        System.out.println(f);
        System.out.println(d);
        System.out.println((double) f);//强制转换为double类型,输出12.3100004196167,因为float类型的数据精度不够,所以会有误差
        System.out.println(f==d);//false,因为f和d的数据类型不一样,所以比较的时候会自动转换为double类型,所以会有误差

        System.out.println(0.1+0.2);//0.30000000000000004,因为0.1和0.2都是double类型,所以会有误差
        System.out.println(0.1F+0.2F);//0.3,因为0.1F和0.2F都是float类型,所以不会有误差
        /*
        1. 第一行有误差是因为 0.1 和 0.2 是 double 类型，在二进制中无法精确表示，
        导致运算结果 0.1 + 0.2 也无法精确表示，结果是一个非常接近 0.3 的值，但不是精确的 0.3，
        因此输出 0.30000000000000004。
        2. 第二行没有误差是因为 0.1F 和 0.2F 是 float 类型，
        虽然 float 类型的精度较低，但在这种简单的加法运算中，误差没有显现出来，
        因此输出 0.3。
        */



        Scanner sc=new Scanner(System.in);//括号里面的System.in表示解析从键盘输入的数据，还可以填写文件路径、网络流等
        System.out.print("请输入一个整数：");//print方法不会换行
        int a=sc.nextInt();//nextInt方法用于解析整数
        System.out.println(a);
        System.out.println("请输入一个字符串：");//println方法会换行
        String b=sc.next();//next方法用于解析字符串
        System.out.println(b);



        //数组
        //一维数组
        int[] arr1=new int[5];//定义一个长度为5的整型数组,还可以写成int arr1[]=new int[5]
        // int,byte,short,long,float,double默认值为0,boolean型默认值为false,char型默认值为'\u0000'(空字符),引用类型默认值为null
        int arr2[]=new int[]{1,2,3,4,5};//定义一个长度为5的整型数组并赋值
        int[] arr3={1,2,3,4,5};//定义一个长度为5的整型数组并赋值
        //数组长度：
        System.out.println(arr1.length);//arr.length表示数组的长度
        //遍历数组
        for(int i:arr1){
            System.out.println(i);
        }

        //二维数组
        int[][] arr4=new int[3][4];//定义一个3行4列的二维数组
        int[][] arr5=new int[][]{{1,2,3},{4,5,6},{7,8,9}};//定义一个3行3列的二维数组并赋值
        System.out.println(arr4.length);//3,表示二维数组的行数
        System.out.println(arr4[0].length);//4,表示二维数组的列数
        //数组的拷贝
        arr4=arr5;//arr4和arr5指向同一个数组,当我改变arr4的值时,arr5的值也会改变
        //此时原来的arr4数组会被垃圾回收机制回收
        //如果想要拷贝一个数组,可以使用clone方法
        int[] arr6=arr1.clone();//拷贝arr1数组,此时，arr6和arr1指向不同的数组，改变arr6的值不会影响arr1的值

        //折半查找
        int[] arr7=new int[]{1,2,3,4,5,6,7,8,9};
        //如果不是有序数组，需要先排序，代码如下：
        // Arrays.sort(arr7);这里sort用的是Arrays类的方法，所以要import java.util.Arrays;
        int target=5;
        int left=0;
        int right=arr7.length-1;
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if(arr7[mid]==target){
                System.out.println("找到了，下标为："+mid);
                break;
            }else if(arr7[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        if(left>right){
            System.out.println("没找到");
        }
    }
}
