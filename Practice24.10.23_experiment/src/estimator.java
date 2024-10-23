interface ComputerAverage {
    public double average(double[] a);
}
class Gymnastics implements ComputerAverage {
    public double average(double[] x) {
        int count=x.length;
        double aver=0,temp=0;
        for(int i=0;i<count;i++)
        {
            for(int j=i;j<count;j++)
            {
                if(x[i]>x[j])
                {
                    temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }
        for(int i=1;i<count-1;i++)
        {
            aver+=x[i];
        }
        if(count>2)
        {
            aver=aver/(count-2);
        }
        else
        {
            aver=0;
        }
        return aver;
    }
}
class School implements ComputerAverage {
    //代码1
    public double average(double[] x) {
        int count=x.length;
        double aver=0;
        for(int i=0;i<count;i++)
        {
            aver+=x[i];
        }
        aver=aver/count;
        return aver;
    }
}
public class estimator {
    public static void main(String[] args)
    {
        double[] a={9.89,9.88,9.99,9.12,9.69,9.76,8.97};
        double[] b={89,56,78,90,100,77,56,45,36,79,98};
        ComputerAverage computer;
        computer=new Gymnastics();
        double result=computer.average(a);//代码2
        System.out.printf("%n");
        System.out.printf("体操选手最后得分%5.3f\n",result);
        computer=new School();
        result=computer.average(b);//代码3
        System.out.printf("班级考试平均分数：%-5.2f",result);
    }
}

//输出结果
/*
体操选手最后得分9.668
班级考试平均分数：73.09
 */
//School类如果不重写public double average(double[] x)方法，编译器会提示什么样的错误？
//java: School不是抽象的, 并且未覆盖ComputerAverage中的抽象方法average(double[])
