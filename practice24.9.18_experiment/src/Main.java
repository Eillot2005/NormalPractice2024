/*
public class Main {
    public static void main(String[] args) {
        int startPosition=0,endPosition=0;
        char cStart='α',cEnd='ω';
        startPosition=(int)cStart;
        endPosition=(int)cEnd;
        System.out.println("希腊字母\'α\'的位置是:"+startPosition);
        System.out.println("希腊字母表");
        for(int i=startPosition;i<=endPosition;i++)
        {
            char c='\0';
            c=(char)i;
            System.out.print(c+" ");
            if((i-startPosition+1)%10==0)
                System.out.println();
        }
    }
}
*/



//将double类型的数据给float类型的变量赋值，编译器会提示的错误为：  java: 不兼容的类型: 从double转换到float可能会有损失
//java: 不兼容的类型: 从double转换到float可能会有损失
//java: 不兼容的类型: 从int转换到byte可能会有损失    -128

