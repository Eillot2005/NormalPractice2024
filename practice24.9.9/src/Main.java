import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int a=1;
        JOptionPane.showMessageDialog(null,"a="+a);//弹出一个对话框,显示a的值
        System.out.println("a="+a);//这里的+a+表示将a的值转换为字符串类型
        //switch语句的用法
        //1. switch语句中的表达式只能是如下几种数据类型：byte、short、int、char、枚举类型、String类型
        //2. case语句中的值必须是常量，不能是变量
        //3. case语句中的值不能重复
        //4. default语句是可选的
        //5. break语句是可选的，如果没有break语句，会继续执行下一个case语句(也称为case穿透)
        //6. switch语句可以嵌套
        Scanner sc=new Scanner(System.in);
        a=Integer.parseInt(JOptionPane.showInputDialog("请输入一个整数"));
        switch(a)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"a=1");
                /* showMessageDialog各个参数的意义分别是：
                父组件、
                要显示的消息、
                对话框标题、
                消息类型(可以是JOptionPane.INFORMATION_MESSAGE、JOptionPane.WARNING_MESSAGE、JOptionPane.ERROR_MESSAGE、JOptionPane.QUESTION_MESSAGE、JOptionPane.PLAIN_MESSAGE，
                分别表示信息、警告、错误、问题、普通消息，默认是普通消息) */
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"a=2");
                break;
            default:
                JOptionPane.showMessageDialog(null,"a不等于1也不等于2");
        }

    }
}